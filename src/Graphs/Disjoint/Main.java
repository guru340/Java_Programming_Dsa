package Graphs.Disjoint;

import Graphs.Dijikstra.Weightednode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Weightnode> nodelist =new ArrayList<>();
        nodelist.add(new Weightnode("A"));
        nodelist.add(new Weightnode("B"));
        nodelist.add(new Weightnode("C"));
        nodelist.add(new Weightnode("D"));

        disjointset.makeset(nodelist);
        Weightnode firstnode=nodelist.get(0);
        Weightnode secondnode=nodelist.get(1);
        disjointset output=disjointset.findset(secondnode);
        output.printingallNodesofThisSet();



    }
}
