package com.exercise_will.week04.data_structures;

public class LinkedLists {

    private ListNode head; // head node to hold the list

    // contains static inner class ListNode
    private  static  class ListNode{
    private int val;
    private ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {


        ListNode head = new ListNode(10); // first value is our head node
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        // Attach them together to form list
        head.next = second;
        second.next= third;
        third.next = fourth; // --> the last one we leave null

        System.out.println(head.toString());
    }
}
