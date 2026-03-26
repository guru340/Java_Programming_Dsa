package Graphs.Disjoint;

public class dis {
    private  int []parent;
    private int []rank;

    public dis(int n){
        this.parent=new int [n];
        this.rank=new int [n];

        for (int i=0;i<n;i++){
            this.parent[n]=i;
            this.rank[n]=1;

        }
    }

    private int findleader(int x){
        if (parent[x]==x){
            return x;
        }
        else {
            return findleader(x);
        }
    }

    public boolean sameset(int x,int y){
        return findleader(x)==findleader(y);
    }
}
