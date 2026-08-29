



package OOP;

public class Inheritance {
    public static void main(String[] args){
       Cow c1=new Cow();
       c1.sound("bhoobhoo");
       c1.legscount("bully",4);

    }
}


class Animal{
    String Type;
    int age;
    String name;
    int count;



    void sound( String name){
        System.out.println(name +"make sound");

    }

    void legscount (String name, int count){
        System.out.print(name+" have "+count+ "legs");
    }

}

class Cow extends Animal{

    String sou;
    void sound(String sou){

        System.out.println(sou+" make sound");
    }

}
