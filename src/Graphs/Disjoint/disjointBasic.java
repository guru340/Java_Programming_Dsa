package Graphs.Disjoint;
// Find and union
public class disjointBasic {

    int []parent;


    public disjointBasic(int n) {
        parent =new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
    }
    public int find(int x){
        if(x!=parent[x]){
            x=parent[x];

        }
        return x;
    }
    public void union(int a,int b){
        int find_a=find(a);
        int find_b=find(b);

        if(find_a!=find_b){
            parent[find_a]=find_b;
        }
    }
}
