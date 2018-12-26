package com.zy.container;

import java.util.*;

public class PriorityQueueDemo {
    public static void printQueue(Queue queue){
        while (queue.peek() != null){
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; ++i){
            priorityQueue.offer(rand.nextInt(i + 10));
        }
        printQueue(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<Integer>(ints);
        printQueue(priorityQueue);

        priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        printQueue(priorityQueue);;

        String face = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(face.split(" "));
        PriorityQueue<String> stringPQ = new PriorityQueue<>(strings);
        printQueue(stringPQ);

        stringPQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringPQ.addAll(strings);
        printQueue(stringPQ);

        Set<Character> charSet = new HashSet<>();
        for (char c : face.toCharArray()){
            charSet.add(c);
        }
        PriorityQueue<Character> characterPQ = new PriorityQueue<>(charSet);
        printQueue(characterPQ);
    }
}
