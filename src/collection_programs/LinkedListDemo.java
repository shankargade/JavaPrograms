package collection_programs;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(60);
        linkedList.add(70);
        linkedList.add(80);
        linkedList.add(100);

        System.out.println("Linked List :::::::>"+linkedList);

       // linkedList.remove(1);
     //   System.out.println(linkedList);
      //  linkedList.remove();
      //  System.out.println(linkedList);
      //  linkedList.removeFirst();
     //   linkedList.removeLast();
       // linkedList.remove(1);
//        Integer num = 70;
//        linkedList.remove(num);

//        linkedList.addFirst(100);
//        linkedList.addLast(200);
//        linkedList.offer(70);
        // linkedList.poll();
        linkedList.removeIf(ele -> (ele % 50 == 0));
        //linkedList.sort(C);
        linkedList.stream().forEach(System.out::println);
        //System.out.println(linkedList);



    }
}
