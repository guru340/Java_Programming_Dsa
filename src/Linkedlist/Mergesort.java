//package Linkedlist;
//
//public class Mergesort {
//
//    public listnode sortList(listnode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        listnode mid = getMid(head);
//        listnode left = sortList(head);
//        listnode right = sortList(mid);
//
//        return merge(left, right);
//    }
//
//    listnode merge(listnode list1, listnode list2) {
//        listnode dummyHead = new listnode();
//        listnode tail = dummyHead;
//        while (list1 != null && list2 != null) {
//            if (list1.val < list2.val) {
//                tail.next = list1;
//                list1 = list1.next;
//                tail = tail.next;
//            } else {
//                tail.next = list2;
//                list2 = list2.next;
//                tail = tail.next;
//            }
//        }
//        tail.next = (list1 != null) ? list1 : list2;
//        return dummyHead.next;
//    }
//
//    listnode getMid(listnode head) {
//        listnode midPrev = null;
//        while (head != null && head.next != null) {
//            midPrev = (midPrev == null) ? head : midPrev.next;
//            head = head.next.next;
//        }
//        listnode mid = midPrev.next;
//        midPrev.next = null;
//        return mid;
//    }
//}
//
// public class ListNode {
//    int val;
//    listnode next;
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//
//    public ListNode(listnode next) {
//        this.next = next;
//    }
//}
//
//
