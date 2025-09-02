package Graphs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    static ArrayList<AdajcencyMatrix> gr;
    static int [][] adjacency;

    public Graph(ArrayList<AdajcencyMatrix> gr) {
        this.gr = gr;
        int size= gr.size();
        adjacency=new int[size][size];
    }


    public void addUndirected(int i,int j){
        adjacency[i][j]=1;
        adjacency[j][i]=1;
    }

    public int size() {
        return gr.size();
    }

    public AdajcencyMatrix get(int index) {
        return gr.get(index);
    }

    public String toString(){
        StringBuilder  str=new StringBuilder();
        str.append(" ");
        for (int i=0;i<size();i++){
            str.append(get(i).name+" ");

        }
        str.append("\n");
        for (int i = 0; i <size() ; i++) {
            str.append(get(i).name+":");
            for (int j:adjacency[i]){
                str.append(j+" ");

            }
            str.append("\n");


        }
        return str.toString();
    }

//    BFS
//    get Neighbours
public static ArrayList<AdajcencyMatrix> getNeighbours(AdajcencyMatrix node){
    ArrayList<AdajcencyMatrix> neighbours=new ArrayList<AdajcencyMatrix>();
    int nodeIndex=node.index;

    for(int i=0;i<adjacency.length;i++){
        if(adjacency[nodeIndex][i]==1){
            neighbours.add(gr.get(i));
        }
    }
    return neighbours;
}


//BFS Internal Implementation
    void bfsvisited(AdajcencyMatrix node){
        LinkedList<AdajcencyMatrix> queue=new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            AdajcencyMatrix currentnode=queue.poll();
            currentnode.isVisited=true;
            System.out.println(currentnode.name+" ");
            ArrayList<AdajcencyMatrix> neighbours=getNeighbours(currentnode);
            for (AdajcencyMatrix neighbour:neighbours){
                if (!neighbour.isVisited){
                    queue.add(neighbour);
                    neighbour.isVisited=true;
                }
            }
        }


    }

    public void bfs(){
        for (AdajcencyMatrix node:gr){
            if (!node.isVisited){
                bfsvisited(node);
            }

        }
    }


//    DFS
void dfsvisited(AdajcencyMatrix node){
    Stack<AdajcencyMatrix> stack=new Stack<>();
    stack.push(node);
    while(!stack.isEmpty()){
        AdajcencyMatrix currentnode=stack.pop();
        currentnode.isVisited=true;
        System.out.println(currentnode.name+" ");
        ArrayList<AdajcencyMatrix> neighbours=getNeighbours(currentnode);
        for (AdajcencyMatrix neighour: neighbours){
            if (!neighour.isVisited){
                stack.push(neighour);
                neighour.isVisited=true;
            }
        }
    }
}

    void dfs(){
        for (AdajcencyMatrix node:gr){
            if (!node.isVisited){
                dfsvisited(node);
            }
        }
    }





//    Topological sort
// we need a directededgegraph
public void addDirectededge(int i,int j){
        adjacency[i][j]=1;
}

    void topologicalVisit(AdajcencyMatrix node, Stack<AdajcencyMatrix> stack){
        ArrayList<AdajcencyMatrix> neighours=getNeighbours(node);
        for (AdajcencyMatrix neighbour:neighours){
            if(!neighbour.isVisited){
                topologicalVisit(neighbour,stack);
            }
        }
        node.isVisited=true;
        stack.push(node);
    }

    void topologicalsort(){
        Stack<AdajcencyMatrix> stack=new Stack<>();
        for (AdajcencyMatrix node:gr){
            if(!node.isVisited){
                topologicalVisit(node,stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop().name+ " ");
        }
    }

//    SSSPP
    public static void pathprint(AdajcencyMatrix node){
        if (node.parent!=null){
            pathprint(node.parent);
            System.out.println(node.name+" ");
        }


    }

    public static void BFSForSSSPP(AdajcencyMatrix node){
        LinkedList<AdajcencyMatrix> queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            AdajcencyMatrix currentnode=queue.remove(0);
            currentnode.isVisited=true;
            System.out.println("Printing Path for node"+":");
            pathprint(currentnode);
            System.out.println();
            ArrayList<AdajcencyMatrix> neighbours=getNeighbours(currentnode);
            for (AdajcencyMatrix neighbour:neighbours){
                if (!neighbour.isVisited){
                    queue.add(currentnode);
                    neighbour.isVisited=true;
                    neighbour.parent=currentnode;
                }
            }
        }
    }

}
