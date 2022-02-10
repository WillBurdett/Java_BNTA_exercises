package com.exercise_will.week04.data_structures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue {

    // QUEUES

    // remember lidl

    // you have priority queues and linked lists:
    // - Priority (like the elderly) will jump to the front

    // adds to the back, takes from the front

    public static void main(String[] args) {

//        // LINKED LIST
//        java.util.Queue<String> names = new LinkedList();
//        names.add("alex");
//        names.add("bert");
//        names.add("bill");
//
//        System.out.println(names);
//        System.out.println(names.peek());
//        names.poll();
//        System.out.println(names);
//        names.add("alex");
//        System.out.println(names);
//        System.out.println(names.size());
//        System.out.println(names.peek());
//
//        System.out.println(names.offer("tom")); // won't add on a size restricted set
//        System.out.println(names);

        // PRIORITY QUEUES
        // Highest priority comes first
//        java.util.Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
//
//        queue.offer(3.0);
//        queue.offer(2.5);
//        queue.offer(4.0);
//        queue.offer(1.5);
//        queue.offer(2.0);
//
//        while(!queue.isEmpty()){
//            System.out.println(queue.poll());
//        }

        java.util.Queue<String> queue = new PriorityQueue<>();

        queue.offer("B");
        queue.offer("A");
        queue.offer("C");
        queue.offer("F");
        queue.offer("D");


        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }


    }
}
