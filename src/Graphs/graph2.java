package Graphs;

import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import static java.lang.reflect.Array.get;


public class graph2 {



    ArrayList<AdajcenyList> nodlist=new ArrayList<AdajcenyList>();
    public graph2(ArrayList<AdajcenyList> nodlist) {
        this.nodlist = nodlist;
    }


    public void addUndirectedRectangle(int i,int j){
        AdajcenyList first=nodlist.get(i);
        AdajcenyList second=nodlist.get(j);
        first.neighours.add(second);
        second.neighours.add(first);
    }

    public String toString(){
        StringBuilder  str=new StringBuilder();

        for (int i=0;i<nodlist.size();i++){
            str.append(nodlist.get(i).name+" ");
            for (int j = 0; j <nodlist.get(i).neighours.size() ; j++) {
                if (j == nodlist.get(i).neighours.size() - 1) {
                    str.append(nodlist.get(i).neighours.get(j).name + ":");

                } else {
                    str.append((nodlist.get(i).neighours.get(j).name)+"-->");

                }
            }

            str.append("\n");

        }
        return str.toString();
    }



//BFS


//BFS internal
    void bfsvisited(AdajcenyList node){
        LinkedList<AdajcenyList> queue=new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            AdajcenyList currentnode=queue.poll();
            currentnode.isVisited=true;
            System.out.println(currentnode.name+" ");
            for (AdajcenyList neighbour: currentnode.neighours){
                if (!neighbour.isVisited){
                    queue.offer(neighbour);
                    neighbour.isVisited=true;
                }
            }
        }
    }


    void bfs(){
        for (AdajcenyList node:nodlist){
            if (!node.isVisited){
                bfsvisited(node);
            }
        }
    }



//    DFS
    void dfsvisited(AdajcenyList node){
        Stack<AdajcenyList> stack=new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            AdajcenyList currentnode=stack.pop();
            currentnode.isVisited=true;
            System.out.println(currentnode.name+" ");
            for (AdajcenyList neighours: currentnode.neighours){
               if (!neighours.isVisited){
                   stack.push(neighours);
                   neighours.isVisited=true;
               }
            }
        }
    }

    void dfs(){
        for (AdajcenyList node:nodlist){
            if (!node.isVisited){
                dfsvisited(node);
            }
        }
    }



//Topological sort
    public void addDirected(int i,int j){
        AdajcenyList first=nodlist.get(i);
        AdajcenyList second=nodlist.get(j);
        first.neighours.add(second);
    }

    void TopologicalVisit(AdajcenyList node, Stack<AdajcenyList> stack){
        for (AdajcenyList neighbour:node.neighours){
            if(!neighbour.isVisited){
                TopologicalVisit(neighbour,stack);
            }
        }
        node.isVisited=true;
        stack.push(node);
    }
    void topologicalsort(){
        Stack<AdajcenyList> stack=new Stack<>();
        for (AdajcenyList node:nodlist){
            if(!node.isVisited){
                TopologicalVisit(node,stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop().name+ " ");
        }
    }


//    SSSPP in AdajcencyList
    public static void pathprint(AdajcenyList node){
        if(node.parent!=null){
                pathprint(node.parent);
        }
        System.out.println(node.name+" ");
    }

    public void BFSforSSSPP(AdajcenyList node){
        LinkedList<AdajcenyList> queue=new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            AdajcenyList currentnode=queue.remove(0);
            currentnode.isVisited=true;
            System.out.println("Printing path for node"+currentnode.name+":");
            pathprint(currentnode);
            System.out.println();
            for (AdajcenyList neighbour:currentnode.neighours){
                if (!neighbour.isVisited){
                    queue.add(neighbour);
                    neighbour.isVisited=true;
                    neighbour.parent=currentnode;
                }
            }
        }
    }
}
