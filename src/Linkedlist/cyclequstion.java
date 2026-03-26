package Linkedlist;

public class cyclequstion {
    public boolean hasCycle(listNode head) {
        listNode fast = head;
        listNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // find length of the cycle
    public int lengthCycle(listNode head) {
        listNode fast = head;
        listNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                listNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

//    find the start node
    public listNode detectCycle(listNode head){
        int length=0;
        listNode fast = head;
        listNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
             length= lengthCycle(slow);
            }
        }

        if (length==0){
            return null;
        }
        listNode f=head;
        listNode s=head;
        while(length>0){
            s=s.next;
            length--;
        }

//        keep moving both forward and they will meet at cycle start
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }

//    middle of linked list
    public listNode middleNode(listNode head) {
        listNode s=head;
        listNode f=head;

        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    //happy number

    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;

        do {
            slow=findsquqre(slow);
            fast=findsquqre(findsquqre(fast));
        }while (slow!=fast);
        if (slow==1){
            return true;
        }
        return false;
    }
    private int findsquqre(int number){
        int ans=0;
        while(number>0){
            int rem=number%10;
            ans+=rem*rem;
            number/=10;

        }
        return ans;
    }

}

class listNode {
     int val;
     listNode next;
      listNode(int x) {
          val = x;
          next = null;
      }
  }
