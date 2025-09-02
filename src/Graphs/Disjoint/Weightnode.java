package Graphs.Disjoint;



import java.util.ArrayList;
import java.util.HashMap;

public class Weightnode implements Comparable<Weightnode>{
    public String name;
    public ArrayList<Weightnode> neighbors=new ArrayList<Weightnode>();
    public HashMap<Weightnode,Integer> weightMap=new HashMap<>();
    public boolean isVisited =false;
    public Weightnode parent;
    public int distance;
    public int index;
    public disjointset set;


    public  Weightnode(String name) {
        this.name = name;
        distance=Integer.MAX_VALUE;
        this.index = index;
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public int compareTo(Weightnode o){
        return this.distance-o.distance;
    }
}


