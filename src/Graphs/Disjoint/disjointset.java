package Graphs.Disjoint;



import java.util.ArrayList;

public class disjointset {
    private ArrayList<Weightnode> nodelist=new ArrayList<>();

    public static void makeset(ArrayList<Weightnode> nodelist){
        for (Weightnode node:nodelist){
            disjointset set=new disjointset();
            set.nodelist.add(node);
            node.set=set;
        }
    }
    public static  disjointset findset(Weightnode node){
        return node.set;
    }

    public static disjointset union(Weightnode node1,Weightnode node2){
        if (node1.set.equals(node2.set)){
            return null;
        }
        else {
            disjointset set1= node1.set;
            disjointset set2=node2.set;
            if (set1.nodelist.size()>set2.nodelist.size()){
                ArrayList<Weightnode> nodeset2=set2.nodelist;
                for (Weightnode node:nodeset2){
                    node.set=set1;
                    set1.nodelist.add(node);
                }
                return set1;

            }else{
                ArrayList<Weightnode> nodeset1=set1.nodelist;
                for (Weightnode node:nodeset1){
                    node.set=set2;
                    set2.nodelist.add(node);
                }
                return set2;
            }

        }
    }

    public void printingallNodesofThisSet(){
        System.out.println("Printing all nodes of the set:");
        for (Weightnode node:nodelist){
            System.out.println(node+" ");


        }
        System.out.println();
    }
}
