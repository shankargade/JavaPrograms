package collection_programs;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(50);
        priorityQueue.add(100);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
          System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());

        /*priorityQueue.poll();
        System.out.println(priorityQueue);
        priorityQueue.remove();
        System.out.println(priorityQueue);*/


    }
}
