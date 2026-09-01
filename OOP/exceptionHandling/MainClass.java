package OOP.exceptionHandling;

public class MainClass {
    public static  void main(String[] args){
//        int a[] =new int[5];
//
//        System.out.println("Hello Guys");
//         try {
//             int result =5/0;
//             System.out.println(a[8]);
//
//
//
//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Tried to access out of boud element.");
//         } catch(ArithmeticException e){
//             System.out.print(e.getMessage());
//             System.out.print(e);
//
//         }


        int a[] =new int[5];

        System.out.println("Hello Guys");
        try {
            int result = 5 / 0;
            System.out.println(a[8]);


//        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
//            System.out.println("handling the exception.");
//        }
        }catch(Exception e){
            System.out.print("Handling ");
        }
        System.out.println("Buy Guys");

    }
}
