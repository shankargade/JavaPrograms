package collection_programs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Shankar");
        deque.add("Jyoti");
        deque.addFirst("Saurabh");
        deque.addLast("Pravin");
        System.out.println(deque);
        // System.out.println( deque.pollFirst());
        // System.out.println(deque.pollLast());
        // System.out.println(deque.removeFirst());
        //System.out.println(deque.removeLast());
        //  System.out.println(deque.descendingIterator());
     //   System.out.println(deque.getFirst());
      //  System.out.println(deque.getLast());
      //  Iterator<String> iterator = deque.descendingIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

       // System.out.println(deque.element());
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}
