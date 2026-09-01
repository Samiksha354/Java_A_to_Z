package OOP;

public class Innerclasses {

   class Toy {
        int price;
    }
    static class Tire {
        int price;
    }


    public static void main(String[] args){
//        Toy toy=new Innerclasses().new Toy();
        Innerclasses obj=new Innerclasses();
        Toy toy=obj.new Toy();
        toy.price =45;

        Tire omg=new Tire();

    }
}
