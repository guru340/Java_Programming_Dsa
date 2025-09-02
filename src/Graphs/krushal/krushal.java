package Graphs.krushal;

import java.util.*;

public class krushal {


    ArrayList<Weightnode> nodeList=new ArrayList<Weightnode>();
    ArrayList<undirectededge> edgelist=new ArrayList<>();
    public krushal(ArrayList<Weightnode> nodeList) {
        this.nodeList = nodeList;
    }
    public void addWeightedundirectedEdge(int firstIndex,int secondIndex,int weight){
        undirectededge edge=new undirectededge(nodeList.get(firstIndex),nodeList.get(secondIndex),weight);
        Weightnode first=edge.first;
        Weightnode second=edge.second;
        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightMap.put(second,weight);
        second.weightMap.put(first,weight);
        edgelist.add(edge);

    }
    void krushal(){
        disjointset.makeset(nodeList);
        Comparator<undirectededge> comparator=new Comparator<undirectededge>() {
            @Override
            public int compare(undirectededge o1, undirectededge o2) {
                return 0;
            }
        };
//        Collections.sort(nodeList, comparator);
        int cost=0;
        for (undirectededge edge:edgelist){
            Weightnode first=edge.first;
            Weightnode second=edge.second;
            if (!disjointset.findset(first).equals(disjointset.findset(second))){
                disjointset.union(first,second);
                cost+=edge.weight;
                System.out.println("Taken"+edge);
            }
        }
        System.out.println("\nTotal cost of min span Tree "+cost);
    }

//    Prims Algorithm

    void prims(Weightnode node){
        for(int i=0;i<nodeList.size();i++){
            nodeList.get(i).distance=Integer.MAX_VALUE;

        }
        node.distance=0;
        PriorityQueue<Weightnode> queue=new PriorityQueue<>();
        queue.addAll(nodeList);
        while(!queue.isEmpty()){
            Weightnode currentnode=queue.remove();
            for (Weightnode neighbour:currentnode.neighbors){
                if (neighbour.distance>currentnode.weightMap.get(neighbour)){
                    neighbour.distance=currentnode.weightMap.get(neighbour);
                    neighbour.parent=currentnode;
                    queue.remove(neighbour);
                    queue.add(neighbour);

                }
            }
        }
        int cost=0;
        for (Weightnode nodetocheck:nodeList){

            System.out.println("Node"+ nodetocheck+" ,key "+nodetocheck.distance+"Parent"+nodetocheck.parent);
            cost=cost+nodetocheck.distance;
        }
        System.out.println("\nTotal cost of MST:"+cost);
    }

}
