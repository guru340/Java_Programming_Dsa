package Linkedlist;

import java.security.PublicKey;

public class LL {
    public Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

//   delete in single linked


    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.nxt = null;
        size--;
        return val;
    }


    public int deleteFirst() {
        int val = head.value;
        head = head.nxt;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    //    Delete At Index
    public int delete(int index) {
        if (index==0){
            return deleteFirst();

        }
        if (index==size-1){
            return deleteLast();
        }
        Node Prev=get(size-2);
        int val=Prev.nxt.value;
        Prev.nxt=Prev.nxt.nxt;
        return val;
    }


    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.value == val) {
                return node;
            }
            node = node.nxt;
        }
        return null;
    }


    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.nxt;
        }
        return node;
    }

    //   insert through index
    public void insert(int val, int index) {
        if (index == 0) {
            insertion(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.nxt;
        }

        Node node = new Node(val, temp.nxt);
        temp.nxt = node;

        size++;
    }


    //   inserting linked list
    public void insertion(int val) {
        Node node = new Node(val);
        node.nxt = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
//
    //    Displaying linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.nxt;
        }
        System.out.println("END");
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertion(val);
            return;
        }

        Node node = new Node(val);
        tail.nxt = node;
        tail = node;
        size++;
    }


    // insert using recursive
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);

    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.nxt = insertRec(val, index - 1, node.nxt);
        return node;
    }

    private class Node {
        private int value;
        private Node nxt;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node nxt) {
            this.value = value;
            this.nxt = nxt;
        }

    }

//   questions

    public void duplicate() {
        Node node = head;

        while (node.nxt != null) {
            if (node.value == node.nxt.value) {
                node.nxt = node.nxt.nxt;
                size--;


            } else {
                node = node.nxt;
            }
            tail = node;
            tail.nxt = null;
        }
    }
//    merge sort

    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.nxt;
            } else {
                ans.insertLast(s.value);
                s = s.nxt;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.nxt;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.nxt;
        }

        return ans;
    }


    // reversed linked lis
    public static void main(String[] args) {
//        LL first = new LL();
//        LL second = new LL();
//
//        first.insertLast(1);
//        first.insertLast(3);
//        first.insertLast(5);
//
//        second.insertLast(1);
//        second.insertLast(2);
//        second.insertLast(9);
//        second.insertLast(14);
//
//        LL ans = LL.merge(first, second);
//        ans.display();


    }
}


