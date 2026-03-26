//package Linkedlist;
//
//public class Interviewquestion {
//
//    public boolean isPalindrome(listnode head) {
//        listnode mid=middleNode(head);
//        listnode headsecond=reverseList(mid);
//        listnode reverseHead=headsecond;
//        while(head!=null && headsecond!=null){
//            if (head.val!=headsecond.val){
//                break;
//            }
//            head=head.next;
//            headsecond=headsecond.next;
//            reverseList(reverseHead);
//
//        }
//        return head==null||headsecond==null;
//    }
//
//    public listnode reverseList(listnode head) {
//        if (head == null) {
//            return head;
//        }
//        listnode prev = null;
//        listnode present = head;
//        listnode next = present.next;
//
//        while (present != null) {
//            present.next = prev;
//            prev = present;
//            present = next;
//            if (next != null) {
//                next = next.next;
//            }
//        }
//        return prev;
//    }
////    reorder List
//
////    Middle Of Linked List
//    public listnode middleNode(listnode head) {
//        listnode s = head;
//        listnode f = head;
//
//        while (f != null && f.next != null) {
//            s = s.next;
//            f = f.next.next;
//        }
//        return s;
//    }
//
//    public void reorderList(listnode head) {
//        if (head == null || head.next == null) {
//            return;
//        }
//
//        listnode mid = middleNode(head);
//
//        listnode hs = reverseList(mid);
//        listnode hf = head;
//
//        // rearrange
//        while (hf != null && hs != null) {
//            listnode temp = hf.next;
//            hf.next = hs;
//            hf = temp;
//
//            temp = hs.next;
//            hs.next = hf;
//            hs = temp;
//        }
//
//        // next of tail to null
//        if (hf != null) {
//            hf.next = null;
//        }
//    }
//// Reverse K group
//public listnode reverseKGroup(listnode head, int k) {
//    if (k <= 1 || head == null) {
//        return head;
//    }
//
//    listnode current = head;
//    listnode prev = null;
//
//    int length = getLength(head);
//    int count = length / k;
//    while (count > 0) {
//        listnode last = prev;
//        listnode newEnd = current;
//
//        listnode next = current.next;
//        for (int i = 0; current != null && i < k; i++) {
//            current.next = prev;
//            prev = current;
//            current = next;
//            if (next != null) {
//                next = next.next;
//            }
//        }
//
//        if (last != null) {
//            last.next = prev;
//        } else {
//            head = prev;
//        }
//
//        newEnd.next = current;
//
//        prev = newEnd;
//        count--;
//    }
//    return head;
//}
//    public int getLength(listnode head) {
//        listnode node = head;
//        int length = 0;
//        while (node != null) {
//            length++;
//            node = node.next;
//        }
//        return length;
//    }
//    public listnode rotateRight(listnode head, int k) {
//        if (k <= 0 || head == null || head.next == null) {
//            return head;
//        }
//
//        listnode last = head;
//        int length = 1;
//        while (last.next != null) {
//            last = last.next;
//            length++;
//        }
//
//        last.next = head;
//        int rotations = k % length;
//        int skip = length - rotations;
//        listnode newLast = head;
//        for (int i = 0; i < skip - 1; i++) {
//            newLast = newLast.next;
//        }
//        head = newLast.next;
//        newLast.next = null;
//
//        return head;
//    }
//
//    public int getDecimalValue(ListNode head) {
//    ListNode temp=head;
//    int decimal = 0;
//        while (temp != null) {
//            decimal = (decimal*2)+ temp.val;
//        }
//            return decimal;
//        }
////    public ListNode removeElements(ListNode head, int val) {
////        ListNode temp=head;
////        while(temp!=null){
////              if (temp.val==val){
////
////              }
////        }
////    }
//
//    }
//
//
//
//    class listnode {
//        int val;
//        listnode next;
//
//        public listnode() {
//        }
//
//        listnode(int x) {
//            val = x;
//            next = null;
//        }
//    }
//
//
//
