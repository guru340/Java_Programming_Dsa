package Graph2.Dijiskstra;

import Graphs.Dijikstra.Weightednode;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.PriorityQueue;



public class WeightGraph {
    ArrayList<Weightednode> nodeList=new ArrayList<>();

    public WeightGraph(ArrayList<Weightednode> nodeList) {
        this.nodeList = nodeList;
    }

   public void dijiskstra(Weightednode node){
        PriorityQueue<Weightednode> queue=new PriorityQueue<>();
        node.distance=0;
        queue.addAll(nodeList);
        while(!queue.isEmpty()){
            Weightednode currentnode=queue.remove();
            for (Weightednode neighour:currentnode.neighbors){
                if (queue.contains(neighour)){
                    if (neighour.distance>currentnode.distance+currentnode.weightMap.get(neighour)){
                        neighour.distance=(currentnode.distance+currentnode.weightMap.get(neighour));
                        currentnode.parent=neighour;
                        queue.remove(neighour);
                        queue.add(neighour);
                    }
                }
            }
        }
        for (Weightednode weightednode:nodeList){
            System.out.println("Node "+weightednode+" , distance "+weightednode.distance+"Path");
            pathprint(weightednode);
            System.out.println();
        }

    }

    public  void pathprint(Weightednode nodeToCheck){
        if (nodeToCheck.parent!=null){
            pathprint(nodeToCheck);
            System.out.println(nodeToCheck.name+" ");
        }
    }

    public void addWeightnodeEdge(int i,int j,int d){
        Weightednode first=nodeList.get(i);
        Weightednode second=nodeList.get(j);
        first.weightMap.put(second,d);
    }

//    Bellman Ford's
    void BellmanFord(Weightednode sourcenode) {
        sourcenode.distance = 0;
        for (int i = 0; i < nodeList.size(); i++) {
            for (Weightednode currentnode : nodeList) {
                for (Weightednode neighbour : currentnode.neighbors) {
                    if (neighbour.distance > currentnode.distance + currentnode.weightMap.get(neighbour)) {
                        neighbour.distance = (currentnode.distance + currentnode.weightMap.get(neighbour));
                        neighbour.parent = currentnode;
                    }
                }
            }
        }
        System.out.println("Negative cycle not found:");
        for (Weightednode nodeTocheck : nodeList) {
            for (Weightednode currentnode : nodeList) {
                for (Weightednode neighbor : currentnode.neighbors) {
                    if (neighbor.distance > currentnode.distance + currentnode.weightMap.get(neighbor)) {
                        System.out.println("Negative cycle found \n");
                        System.out.println("Vertex name" + neighbor.name);
                        System.out.println("old cost" + neighbor.distance);
                        int newDistance = currentnode.distance + currentnode.weightMap.get(neighbor);
                        System.out.println("new cost" + newDistance);
                        return;
                    }
                }
            }

        }

    }

    void floydwarshell(){
        int size=nodeList.size();
        int [][]v=new int[size][size];
        for(int i=0;i<size;i++){
            Weightednode first=nodeList.get(i);
            for (int j=0;j<size;j++){
                Weightednode second=nodeList.get(j);
                if (i==j) {
                    v[i][j] = 0;
                } else if (first.weightMap.containsKey(second)) {
                            v[i][j] =first.weightMap.get(second);
                }else{
                    v[i][j]=Integer.MAX_VALUE/10;
                }
            }
        }
            for (int k=0;k<nodeList.size();k++){
                for (int i=0;i<nodeList.size();i++){
                    for (int j=0;j<nodeList.size();i++){
                        if (v[i][j]>v[i][k]+v[k][j]){
                            v[i][j]=v[i][k]+v[k][j];
                        }
                    }
                }
            }
            for (int i=0;i<size;i++){
                System.out.println("printing distance list for node "+nodeList.get(i));
                for (int j=0;j<size;j++){
                    System.out.println(v[i][j]);
                }
                System.out.println();
            }
    }
}
