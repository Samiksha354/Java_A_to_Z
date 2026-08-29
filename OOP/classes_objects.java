//1. Class = Blueprint, Object = Real thing
//
//Think of a class like a blueprint of a house.
//
//class Student {
//    String name;
//    int age;
//}
//
//Student is a class. It describes what a student has (name, age).
//
//When we create:
//
//Student s1 = new Student();
//
//s1 is an object — an actual student created from that blueprint.
//
//2. Memory
//
//A class itself doesn't create memory for its instance variables just because you wrote the class.
//
//class Student {
//    String name;
//    int age;
//}
//
//When you create:
//
//Student s1 = new Student();
//
//memory is allocated for that object's instance data.
//
//If you create:
//
//Student s2 = new Student();
//
//another object gets its own instance data.
//
//3. Class = logical, Object = physical
//
//Class is just a definition/idea in your program:
//
//Student
// ├── name
// └── age
//
//An object is the actual thing created in memory:
//
//s1 → name = "Sam"
//age = 22
//
//So you can remember:
//
//Class = design
//        Object = actual instance
//
//4. One class → many objects
//
//You write the class only once:
//
//class Student {
//    String name;
//}
//
//But you can create many objects:
//
//Student s1 = new Student();
//Student s2 = new Student();
//Student s3 = new Student();
//
//All three are objects of the same Student class.
//
//Student (Class)
//              |
//                      -----------------
//                      |       |       |
//s1      s2      s3
//Object  Object  Object
//🧠 Easiest way to remember
//
//Class = Blueprint 📝
//
//Object = Thing created from blueprint 🏠
//


//5. Class arranges data + behavior
//
//A class keeps data (properties) and behavior (methods) together.
//
//For example:
//
//class Student {
//    // Data / properties
//    String name;
//    int age;
//
//    // Behavior / method
//    void study() {
//        System.out.println(name + " is studying");
//    }
//}
//
//Here:
//
//name, age → data/properties
//study() → behavior
//Student → class
//
//So:
//
//Class = Data + Methods
//
//When we create an object:
//
//Student s1 = new Student();
//
//s1.name = "Sam";
//s1.age = 22;
//
//        s1.study();
//
//The object s1 gets the properties and behaviors defined by the Student class.
//
//        6. Class is a user-defined data type
//
//You already know data types like:
//
//int age;
//double salary;
//String name;
//
//These are predefined types.
//
//But you can create your own type using a class:
//
//class Student {
//    String name;
//    int age;
//}
//
//Now Student becomes a user-defined data type.
//
//You can write:
//
//Student s1;
//Student s2;
//Student s3;
//
//Just like:
//
//int a;
//int b;
//int c;
//
//The difference is:
//
//int
// ↓
//Predefined data type
//
//        Student
// ↓
//User-defined data type
//🧠 Simple example
//
//Think of Student as a new data type that you created.
//
//        Student s1 = new Student();
//
//means:
//
//        "Create a variable s1 whose type is Student, and create a Student object for it."
//
//        ⭐ Remember this
//
//Class = Blueprint
//
//        Class = Data + Behavior
//
//Class = User-defined data type
//
//        Object = Actual instance created from the class.





package OOP;

public class classes_objects {
    public static void main(String []args){
       Dog d1=new Dog();
        Dog d2=new Dog();
       d1.number=1;
       d1.age=20;
       d1.name="dinu";
       d1.walk(d1.name);
       d1.bark(d1.name);

       d2.name="shibu";
        d2.walk(d2.name);
        d2.bark(d2.name);


        ComplexNumber c1=new ComplexNumber(34,67);
        c1.a=12;
        c1.b=50;
        c1.print();




    }
}



class ComplexNumber {
    int a;
    int b;




    /// /constructor overloading
//     public ComplexNumber(){ //default Constructor
//        real=0;
//        img=0;
//    }


    public ComplexNumber(int real, int img) {
        a = real;
        b = img;
    }

        void print () {
            System.out.println(a + "+" + b);
        }
        void add () {

        }

        void sub () {

        }
    }



class Dog{  //factory


    //properties
    int number;
    int  age;
    String  name;

    //behavior
    void walk( String name){
       System.out.println(name+ " can walk");
    }

    void bark(String name){
        System.out.println(name+" can bark");
    }

}
