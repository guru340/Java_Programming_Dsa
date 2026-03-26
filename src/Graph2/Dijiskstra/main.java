package Graph2.Dijiskstra;

import Graphs.Dijikstra.Weightednode;

import java.util.ArrayList;

public class main {
    static void main() {
                ArrayList<Weightednode> nodelist=new ArrayList<>();
        nodelist.add(new Weightednode("A",0));
        nodelist.add(new Weightednode("B",1));
        nodelist.add(new Weightednode("C",2));
        nodelist.add(new Weightednode("D",3));
        nodelist.add(new Weightednode("E",4));
        nodelist.add(new Weightednode("F",5));
        nodelist.add(new Weightednode("G",6));
        WeightGraph newGraph=new WeightGraph(nodelist);
        newGraph.addWeightnodeEdge(0,1,2);
        newGraph.addWeightnodeEdge(0,2,5);
        newGraph.addWeightnodeEdge(1,2,6);
        newGraph.addWeightnodeEdge(1,3,1);
        newGraph.addWeightnodeEdge(1,4,3);
        newGraph.addWeightnodeEdge(2,5,8);
        newGraph.addWeightnodeEdge(3,4,4);
        newGraph.addWeightnodeEdge(4,6,9);
        newGraph.addWeightnodeEdge(5,6,7);
        System.out.println(" Printing Dijisktra from source A ");
        newGraph.dijiskstra(nodelist.get(0));


    }
}
