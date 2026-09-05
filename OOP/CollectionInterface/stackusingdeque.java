package OOP.CollectionInterface;

import java.util.ArrayDeque;

public class stackusingdeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> stack1 = new ArrayDeque<>();
        stack1.offer(21);
        stack1.offerFirst(90);
        stack1.offerLast(4);
        stack1.offerLast(4);


        System.out.println(stack1);

//            System.out.println(q.poll());
//
//            System.out.println(q.peek());
//
//            while(!q.isEmpty()){
//                System.out.print(q.poll());
//            }
    }

}
