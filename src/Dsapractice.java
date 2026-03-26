//
//
//import Graphs.AdajcencyMatrix;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Stack;
//
//public class Dsapractice{
//    static ArrayList<practice> gr;
//    static int [][] adjacency;
//
//    public Dsapractice(ArrayList<practice> gr) {
//        this.gr = gr;
//        int size= gr.size();
//        adjacency=new int[size][size];
//    }
//
//
//    public void addUndirected(int i,int j){
//        adjacency[i][j]=1;
//        adjacency[j][i]=1;
//    }
//
//    public int size() {
//        return gr.size();
//    }
//
//    public practice get(int index) {
//        return gr.get(index);
//    }
//
//    public String toString(){
//        StringBuilder  str=new StringBuilder();
//        str.append(" ");
//        for (int i=0;i<size();i++){
//            str.append(get(i).name+" ");
//
//        }
//        str.append("\n");
//        for (int i = 0; i <size() ; i++) {
//            str.append(get(i).name+":");
//            for (int j:adjacency[i]){
//                str.append(j+" ");
//
//            }
//            str.append("\n");
//
//
//        }
//        return str.toString();
//    }
//
//    //    BFS
////    get Neighbours
//    public static ArrayList<practice> getNeighbours(practice node){
//        ArrayList<practice> neighbours=new ArrayList<practice>();
//        int nodeIndex=node.index;
//
//        for(int i=0;i<adjacency.length;i++){
//            if(adjacency[nodeIndex][i]==1){
//                neighbours.add(gr.get(i));
//            }
//        }
//        return neighbours;
//    }
//
//
//    //BFS Internal Implementation
//    void bfsvisited(practice node){
//        LinkedList<practice> queue=new LinkedList<>();
//        queue.offer(node);
//        while(!queue.isEmpty()){
//            practice currentnode=queue.poll();
//            currentnode.isVisited=true;
//            System.out.println(currentnode.name+" ");
//            ArrayList<practice> neighbours=getNeighbours(currentnode);
//            for (practice neighbour:neighbours){
//                if (!neighbour.isVisited){
//                    queue.add(neighbour);
//                    neighbour.isVisited=true;
//                }
//            }
//        }
//
//
//    }
//
//    public void bfs(){
//        for (practice node:gr){
//            if (!node.isVisited){
//                bfsvisited(node);
//            }
//
//        }
//    }
//
//
//    //    DFS
//    void dfsvisited(practice node){
//        Stack<practice> stack=new Stack<>();
//        stack.push(node);
//        while(!stack.isEmpty()){
//            practice currentnode=stack.pop();
//            currentnode.isVisited=true;
//            System.out.println(currentnode.name+" ");
//            ArrayList<practice> neighbours=getNeighbours(currentnode);
//            for (practice neighour: neighbours){
//                if (!neighour.isVisited){
//                    stack.push(neighour);
//                    neighour.isVisited=true;
//                }
//            }
//        }
//    }
//
//    void dfs(){
//        for (practice node:gr){
//            if (!node.isVisited){
//                dfsvisited(node);
//            }
//        }
//    }
//
////    Topoliogical Sort
//    public void adddirected(int i,int j){
//        adjacency[i][j]=1;
//    }
//    void topologicalvisited(practice node,Stack<practice> stack){
//        ArrayList<practice> neighours=getNeighbours(node);
//        for (practice neighour:neighours){
//            if (!neighour.isVisited){
//                topologicalvisited(neighour,stack);
//            }
//        }
//        node.isVisited=true;
//        stack.push(node);
//    }
//
//    void topologicalSort(){
//        Stack<practice>  stack=new Stack<>();
//        for (practice node:gr){
//            if(!node.isVisited){
//                topologicalvisited(node,stack);
//            }
//        }
//
//        while(!stack.isEmpty()){
//            System.out.println(stack.pop().name+" ");
//        }
//    }
//
////      sssp
//    public void pathprint(practice node){
//        if (node.parent!=null){
//            pathprint(node.parent);
//            System.out.println(node.name+" ");
//        }
//
//
//
//        }
//    public void BFSForSSSP(practice node){
//        LinkedList<practice> queue=new LinkedList<>();
//        queue.add(node);
//        while(!queue.isEmpty()){
//            practice currentnode=queue.remove(0);
//            currentnode.isVisited=true;
//            System.out.println("Printing Path for node"+":");
//            pathprint(currentnode);
//            System.out.println();
//            ArrayList<practice> neighour=getNeighbours(node);
//            for (practice neighours:neighour){
//                if (!neighours.isVisited){
//                    queue.add(currentnode);
//                    neighours.isVisited=true;
//                    neighours.parent=currentnode;
//                }
//            }
//        }
//    }
// }
