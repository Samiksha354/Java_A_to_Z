package OOP.CollectionInterface;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class deque {
    public static void main(String[] args){
            ArrayDeque<Integer> q= new ArrayDeque<>();
            q.offer(21);
            q.offerFirst(90);
            q.offerLast(4);
        q.offerLast(4);


            System.out.println(q);

//            System.out.println(q.poll());
//
//            System.out.println(q.peek());
//
//            while(!q.isEmpty()){
//                System.out.print(q.poll());
//            }
        }


}
