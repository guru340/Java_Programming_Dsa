package OOPS.generics;

import java.util.Arrays;
import java.util.Objects;

public class customgenericarraylist<T> {

    private Object[]arr;
    private static int DEFAULT_SIze=10;
    private int size=0;
    public customgenericarraylist(){
        this.arr=new Object[DEFAULT_SIze];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        arr[size++]=num;

    }

    private void resize() {
        int []temp=new int[arr.length+2];

//        copy the current items in the array
        for (int i = 0; i < arr.length; i++) {
            temp[i]= (int) arr[i];

            arr= new int[][]{temp};
        }
    }
    public int remove(){
        int removed= (int) arr[--size];
        return removed;
    }

    public int get(int index){
        return (int) arr[index];
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
