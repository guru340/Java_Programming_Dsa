package Graph2.Dijiskstra;

import java.util.ArrayList;
import java.util.HashMap;

public class Weightnode implements Comparable<Weightnode>{

    public String name;
    public int distance;
    public int index;
    public Weightnode parent;
    public ArrayList<Weightnode> neighours=new ArrayList<>();
    public HashMap<Weightnode,Integer> weightmap=new HashMap<>();

    @Override
    public int compareTo(Weightnode o) {
        return this.distance-o.distance;
    }
    @Override
    public String toString(){
        return name;
    }
    public Weightnode(String name, int index) {
        this.name = name;
        distance=Integer.MAX_VALUE;
        this.index = index;
    }

}
