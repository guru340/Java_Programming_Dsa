package stackandqueue;

public class customstack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=1;


    public customstack(){
        this(DEFAULT_SIZE);
    }
    public customstack(int size){
        this.data=new int[size];
    }
    public boolean push(int item){
        if (isFull()){
            System.out.println("stack is Full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws stackexception{
        if(isEmpty()){
            throw new stackexception("Cannot pop from an Empty stack!!");
        }
//        int removed=data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()){
            throw new Exception("Cannot pop from an empty stack!!");
        }
        return data[ptr];
    }
   public boolean isFull(){
        return ptr== data.length-1; //ptr is at last index
    }

    public boolean isEmpty(){
        return ptr==-1;
    }

}
