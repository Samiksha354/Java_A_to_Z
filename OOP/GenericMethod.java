package OOP;

public class GenericMethod {
    public static void main(String []args){
      printdata("Hello");
      printdata(123); ///here you can add anything
        GenericMethod obj= new GenericMethod();
        obj.doubledata(4);  //you only support number
//        obj.doubledata("Hello"); //this create error

    }



    //support multiple data types
    static <T> void printdata(T data){
    System.out.println(data);
    }

//Bounded Method
    //Support one type of data is called bounded generics
    <T extends Number> void doubledata(T data){
        System.out.println(data);
    }
}


//Bounded class


