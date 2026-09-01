package OOP;

public class AnonymousClasses {


    //we konw that we cant create the object of interface
    superinterface obj2 =new superinterface(){

    };
    Outerclass obj=new Outerclass(){/// anonymous class the anonymous class object is use only once


    };



    public static void main(String[] args) {
        anonuminterface anonim=(int steps) ->{
            System.out.println("walking through."+steps);
            return steps;

        };


        anonuminterface obj2=(int steps) -> 2*steps;
        System.out.println(obj2.walk(8));

        anonim.walk(5);
    }



}

class Outerclass{

     void sing(){

     }
    public void outerMethod(){

    }
}

interface superinterface{

}

interface anonuminterface{
    int walk(int steps);
}
