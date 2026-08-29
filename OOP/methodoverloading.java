//🔹 What is Method Overloading?
//
//Method overloading means having multiple methods with the same name but different parameters.
//
//For example:
//
//class Calculator {
//
//    void add() {
//        System.out.println("No numbers");
//    }
//
//    void add(int a) {
//        System.out.println(a);
//    }
//
//    void add(int a, int b) {
//        System.out.println(a + b);
//    }
//}
//
//All methods are named add, but their parameters are different.
//
//1. Change the number of parameters
//
//You can overload by changing the number of parameters.
//
//void add(int a) {
//}
//
//void add(int a, int b) {
//}
//
//void add(int a, int b, int c) {
//}
//
//Here:
//
//add(int)          → 1 parameter
//add(int, int)     → 2 parameters
//add(int, int,int) → 3 parameters
//
//✅ This is method overloading.
//
//        2. Change the data type of parameters
//
//You can also change the type of parameters.
//
//void print(int a) {
//}
//
//void print(double a) {
//}
//
//void print(String a) {
//}
//
//For example:
//
//print(10);       // calls print(int)
//
//print(10.5);     // calls print(double)
//
//print("Hello");  // calls print(String)
//
//Java determines which method to call based on the argument you provide.
//
//        ❌ Changing only return type is NOT overloading
//
//This is not allowed:
//
//int add(int a) {
//    return a;
//}
//
//double add(int a) {
//    return a;
//}
//
//Why?
//
//Both methods have exactly the same:
//
//method name → add
//parameters   → (int)
//
//The only difference is the return type.
//
//Java cannot overload methods based only on return type.
//
//🧠 Easy rule
//
//When checking whether two methods are overloaded, look at:
//
//Method name + Parameters
//
//Don't consider the return type.
//
//Valid ✅
//add()
//add(int)
//add(int, int)
//add(double)
//add(int, double)
//Invalid ❌
//int add(int a)
//double add(int a)
//⭐ Why is it called "overloading"?
//
//Imagine a method called add.
//
//You are giving the same method name multiple responsibilities:
//
//add()
//   ↓
//add(int)
//   ↓
//add(int, int)
//   ↓
//add(double)
//
//You're basically loading the same method name with different parameter versions.
//
//And one important interview point:
//
//Method overloading is compile-time polymorphism (static polymorphism) because Java decides which overloaded method to call at compile time.
//

package OOP;

public class methodoverloading {


    public static void main(String[] args) {

    }
}


class adding{
    void add(int a, int b){

    }

    void add(int a, int b, int c){

    }

    void add(float a, float b){

    }

}
