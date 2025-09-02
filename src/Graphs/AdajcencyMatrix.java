package Graphs;

public class AdajcencyMatrix {
    public String name;
    public int index;
    public boolean isVisited=false;
    public AdajcencyMatrix parent;

    public AdajcencyMatrix(String name, int index) {
        this.name = name;
        this.index = index;
    }
    

    
}
