package Graphs.krushal;

public class undirectededge {
    public Weightnode first;
    public Weightnode second;
    public int weight;

    public undirectededge(Weightnode first, Weightnode second, int weight) {
        this.first = first;
        this.second = second;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge (" +first+","+second+"), weight="+weight;
    }
}
