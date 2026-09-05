package OOP.CollectionInterface;

import java.util.ArrayList;
import java.util.List;

public class LeranList {
    public static void main(String[] args){


        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(90);

        List<Integer> list2=new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(9);

        System.out.println(list.size());
        System.out.println(list2.isEmpty());
        System.out.println(list2.contains(3));
        System.out.println(list2.add(8));
        System.out.println(list2.remove(2));
        System.out.println(list2.remove(Integer.valueOf(1)));
        System.out.print(list.containsAll(list2));
        System.out.println(list2.addAll(list));
        System.out.println(list2.removeAll(list));
        list2.clear();






    }

}
