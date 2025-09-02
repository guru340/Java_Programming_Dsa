package stackandqueue.InterviewQuestions;

//Implements queue using stack
import java.util.Stack;

class Queueusingstack{
    private Stack<Integer> first;
    private Stack<Integer> Second;

    public Queueusingstack(){
        first=new Stack<>();
        Second=new Stack<>();
    }
    public void add(int item){
        first.push(item);
    }

    public int remove(){
        while(!first.isEmpty()){
            Second.push(first.pop());

        }
        int removed=Second.pop();
        while (!Second.isEmpty()){
            first.push(Second.pop());

        }
        return removed;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }

    public int peek() throws Exception{
        while(!first.isEmpty()){
            Second.push(first.pop());

        }
        int peeked=Second.peek();
        while (!Second.isEmpty()){
            first.push(Second.pop());

        }
        return peeked;

    }

}

//remove efficient
class Queueusingstack1 {
    private Stack<Integer> first;
    private Stack<Integer> Second;

    public Queueusingstack1() {
        first = new Stack<>();
        Second = new Stack<>();
    }

    public void add(int item) {
        while (!first.isEmpty()){
            Second.push(first.pop());
        }
        first.push(item);
        while (!Second.isEmpty()){
            first.push(Second.pop());
        }
    }

    public int remove() throws Exception{
        return first.pop();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

    public int peek() throws Exception {
        return first.peek();

    }

}


