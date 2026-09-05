package OOP.CollectionInterface;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Interface {
    public static void main(String[] args){
        Queue<Integer> q= new LinkedList<>();
        q.offer(21);
        q.offer(90);
        q.offer(4);
        q.offer(78);

        System.out.println(q);

        System.out.println(q.poll());

        System.out.println(q.peek());

        while(!q.isEmpty()){
            System.out.print(q.poll());
        }
    }
}
