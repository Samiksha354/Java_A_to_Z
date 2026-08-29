//Constructors in Java
//A constructor is called automatically when an object is created.
//Student s1 = new Student();
//
//When new Student() runs, the constructor is automatically called.
//
//Two rules for a constructor:
//a) Constructor name must be the same as the class name
//class Student {
//
//    Student() {
//        System.out.println("Constructor called");
//    }
//}
//
//Class name → Student
//Constructor name → Student ✅
//
//b) Constructor has NO return type
//
//Correct:
//
//Student() {
//}
//
//❌ Incorrect:
//
//void Student() {
//}
//
//If you write void, it becomes a method, not a constructor.
//
//If you don't create a constructor, Java provides a default constructor.
//class Student {
//    int age;
//    String name;
//}
//
//You didn't write any constructor, so Java provides one automatically.
//
//Then:
//
//Student s = new Student();
//
//The instance variables get their default values:
//
//int     → 0
//double  → 0.0
//boolean → false
//String  → null
//Default constructor
//
//A default constructor is automatically provided by the compiler only when you don't write any constructor yourself.
//
//For example:
//
//class Student {
//    int age;
//}
//
//Java effectively provides something like:
//
//Student() {
//}
//
//⚠️ Important:
//
//If you write your own constructor:
//
//class Student {
//
//    Student(int age) {
//        this.age = age;
//    }
//}
//
//Java will not automatically provide the no-argument constructor.
//
//So this won't work:
//
//Student s = new Student(); // ❌
//Constructor cannot be abstract, static, or final.
//
//For example:
//
//static Student() { }    // ❌
//final Student() { }     // ❌
//abstract Student();     // ❌
//
//Why?
//
//A constructor is specifically used to create/initialize an object, so these modifiers don't make sense for constructors.
//
//Constructor can be overloaded but cannot be overridden.
//Overloading ✅
//
//You can have multiple constructors with different parameters:
//
//class Student {
//
//    Student() {
//    }
//
//    Student(String name) {
//    }
//
//    Student(String name, int age) {
//    }
//}
//
//Same constructor name, different parameters → constructor overloading.
//
//Overriding ❌
//
//Constructors cannot be overridden because constructors are not inherited by child classes.
//
//class Animal {
//    Animal() {
//    }
//}
//
//class Dog extends Animal {
//    Dog() {
//    }
//}
//
//Dog() is not overriding Animal().
//
//It is simply a separate constructor for Dog.
//
//🧠 Remember
//
//        Constructor = used to initialize an object
//
//Same name as class + no return type
//
//Can be overloaded ✅
//
//Cannot be overridden ❌
//
//





/// //// constructor default set the value and they get changed if you explicitaly initialized them


/// /when you create constructor with parameters then you cant call the default one



/// /******************This Keyword ***************************\\\\\\\\
//What is this?
//
//In Java, this refers to the current object.
//
//For example:
//
//class Student {
//    String name;
//
//    void display() {
//        System.out.println(this.name);
//    }
//}
//
//If we do:
//
//Student s1 = new Student();
//s1.name = "Sam";
//
//        s1.display();
//
//Inside display():
//
//        this
//
//refers to s1.
//
//        So:
//
//        this.name
//
//means:
//
//name belonging to the current object (s1)
//
//1. Most common use: removing ambiguity
//
//This is where you'll see this most often.
//
//class Student {
//
//    String name;
//
//    Student(String name) {
//        this.name = name;
//    }
//}
//
//Here we have two names:
//
//String name;       → instance variable
//Student(String name) → parameter
//
//Without this, Java would be confused about which name you're referring to.
//
//        this.name = name;
//    ↑       ↑
//object    parameter
//
//So:
//
//        this.name → instance variable
//name → constructor parameter
//
//Example:
//
//Student s1 = new Student("Sam");
//
//The constructor does:
//
//        this.name = "Sam"
//
//So s1.name becomes "Sam".
//
//        2. this can call another method
//
//Suppose:
//
//class Student {
//
//    void study() {
//        System.out.println("Studying");
//    }
//
//    void display() {
//        this.study();
//    }
//}
//
//You can write:
//
//        this.study();
//
//which means:
//
//Call study() of the current object.
//
//You can also simply write:
//
//study();
//
//Both work here.
//
//3. this() calls another constructor
//
//This is very important.
//
//class Student {
//
//    Student() {
//        this(20);
//        System.out.println("Default constructor");
//    }
//
//    Student(int age) {
//        System.out.println("Age: " + age);
//    }
//}
//
//When:
//
//Student s = new Student();
//
//Java calls:
//
//Student()
//   ↓
//           this(20)
//           ↓
//Student(int age)
//
//So this() means:
//
//Call another constructor of the same class.
//
//        ⚠️ Important rule
//
//this() must be the first statement inside a constructor.
//
//Correct:
//
//Student() {
//    this(20);
//}
//
//❌ Incorrect:
//
//Student() {
//    System.out.println("Hello");
//    this(20);  // Error
//}
//🧠 Easy way to remember
//
//this has three common uses:
//
//        this.variable
//
//👉 Current object's variable
//
//        this.name = name;
//this.method()
//
//👉 Current object's method
//
//        this.display();
//this()
//
//        👉 Another constructor of the same class
//
//this(10);
//        ⭐ One-line interview answer
//
//The this keyword refers to the current object and is commonly used to access instance variables, call instance methods, and invoke another constructor of the same class.




















package OOP;

import OOP.classes_objects;

public class constructorinjava {

    public static void main(String[] args){

        ComplexNumber num1=new ComplexNumber(12,8);  //ComplexNumber() - default constructor
        ComplexNumber num2=new ComplexNumber(12, 90);
         num1.print();


    }
}

