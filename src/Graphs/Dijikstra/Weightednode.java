package Graphs.Dijikstra;


import java.util.ArrayList;
import java.util.HashMap;

public  class Weightednode implements Comparable<Weightednode> {
    public String name;
    public ArrayList<Weightednode> neighbors=new ArrayList<Weightednode>();
    public HashMap<Weightednode,Integer> weightMap=new HashMap<>();
    public boolean isVisited =false;
    public Weightednode parent;
    public int distance;
    public int index;


    public Weightednode(String name, int index) {
        this.name = name;
        distance=Integer.MAX_VALUE;
        this.index = index;
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public int compareTo(Weightednode o){
        return this.distance-o.distance;
    }
}
