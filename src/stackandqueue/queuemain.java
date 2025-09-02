package stackandqueue;

public class queuemain {
    public static void main(String[] args) throws Exception {
        circularqueue que=new circularqueue(5);
        que.insert(5);
        que.insert(6);
        que.insert(7);
        que.insert(9);
        que.insert(98);

        que.display();

        System.out.println(que.remove());

        que.display();

    }
    
}
