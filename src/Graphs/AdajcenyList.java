package Graphs;

import java.util.ArrayList;

public class AdajcenyList {
    String name;
    int index;
    public boolean isVisited=false;
    public AdajcenyList parent;
    public ArrayList<AdajcenyList> neighours=new ArrayList<AdajcenyList>();
    public AdajcenyList(String name, int index) {
        this.name = name;
        this.index = index;
    }




}
