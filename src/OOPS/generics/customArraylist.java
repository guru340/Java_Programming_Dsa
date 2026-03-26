package OOPS.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class customArraylist {
    private int[]arr;
    private static int DEFAULT_SIze=10;
    private int size=0;
    public customArraylist(){
        this.arr=new int[DEFAULT_SIze];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        arr[size++]=num;

    }

    private void resize() {
        int []temp=new int[arr.length+2];

//        copy the current items in the array
        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[i];

            arr=temp;
        }
    }
    public int remove(){
        int removed=arr[--size];
        return removed;
    }

    public int get(int index){
        return arr[index];
    }

    public int size(){
        return size;
    }

    private boolean isFull(){
        return size==arr.length;
    }

    @Override
    public String toString() {
        return "customArraylist{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        customArraylist list=new customArraylist();
        list.add(5);
        list.add(6);
        list.add(9);

        System.out.println(list);

    }
}
