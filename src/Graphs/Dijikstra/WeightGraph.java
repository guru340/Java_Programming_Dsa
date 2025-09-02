package Graphs.Dijikstra;

import Graphs.AdajcencyMatrix;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightGraph {
    ArrayList<Weightednode> nodelist=new ArrayList<>();

    public WeightGraph(ArrayList<Weightednode> nodelist) {
        this.nodelist = nodelist;
    }

    void dijisktra(Weightednode node){
        PriorityQueue<Weightednode> queue=new PriorityQueue<>();
        node.distance=0;
        queue.addAll(nodelist);
        while(!queue.isEmpty()){
            Weightednode currentnode=queue.remove();
            for (Weightednode neighbor:currentnode.neighbors){
                if (queue.contains(neighbor)){
                    if (neighbor.distance>currentnode.distance+currentnode.weightMap.get(neighbor)){
                        neighbor.distance=(currentnode.distance+currentnode.weightMap.get(neighbor));
                        neighbor.parent=currentnode;
                        queue.remove(neighbor);
                        queue.add(neighbor);

                    }
                }
            }
        }

        for (Weightednode nodeTocheck:nodelist){
            System.out.println("Node"+nodeTocheck+",distance"+nodeTocheck.distance+"Path");
            pathprint(nodeTocheck);
            System.out.println();
        }


    }

    public void pathprint(Weightednode nodeTocheck) {
        if (nodeTocheck.parent!=null){
            pathprint(nodeTocheck.parent);
            System.out.println(nodeTocheck.name+" ");
        }
    }

    public void addWeightnodeEdge(int i,int j,int d){
        Weightednode first=nodelist.get(i);
        Weightednode second=nodelist.get(j);
        first.weightMap.put(second,d);
    }

//    Bellman Ford Algorithm
    void bellmanFord(Weightednode sourcenode){
        sourcenode.distance=0;
        for (int i=0;i<nodelist.size();i++){
            for (Weightednode currentnode:nodelist){
                for (Weightednode neighbor:currentnode.neighbors){
                    if(neighbor.distance>currentnode.distance+currentnode.weightMap.get(neighbor)){
                        neighbor.distance=(currentnode.distance+currentnode.weightMap.get(neighbor));
                        neighbor.parent=currentnode;
                    }
                }
            }
        }
        System.out.println("Checking for Negative cycle");
        for (Weightednode currentnode:nodelist){
            for (Weightednode neighbor:currentnode.neighbors){
                if (neighbor.distance>currentnode.distance+currentnode.weightMap.get(neighbor)){
                    System.out.println("Negative cycle found \n");
                    System.out.println("Vertex name"+neighbor.name);
                    System.out.println("old cost"+neighbor.distance);
                    int newDistance=currentnode.distance+currentnode.weightMap.get(neighbor);
                    System.out.println("new cost"+newDistance);
                    return;
                }
            }
        }
        System.out.println("Negative cycle not found:");
        for (Weightednode nodeTocheck:nodelist){
            System.out.println(" Node "+nodeTocheck+" distance "+nodeTocheck.distance+" Path ");
            pathprint(nodeTocheck);
            System.out.println();
        }
    }

//    Flyod Warshell algorithm
    void flyodwarshall(){
        int size=nodelist.size();
        int [][] mat =new int [size][size];
        for (int i=0;i<size;i++){
            Weightednode first=nodelist.get(i);
            for (int j=0;j<size;j++){
                Weightednode second=nodelist.get(j);
                if (i==j){
                    mat[i][j]=0;
                        
                } else if (first.weightMap.containsKey(second)) {
                    mat[i][j]=first.weightMap.get(second);
                }else {
                    mat[i][j]=Integer.MAX_VALUE/10;

                }
            }
        }
        for (int k=0;k<size;k++){
            for (int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    if (mat[i][j]>mat[i][k]+mat[k][j]){
                        mat[i][j]=mat[i][k]+mat[k][j];
                    }
                }
            }
        }
        for (int i=0;i<size;i++){
            System.out.println("Printing distance list for node"+nodelist.get(i)+":");
            for (int j=0;j<size;j++){
                System.out.println(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

}
