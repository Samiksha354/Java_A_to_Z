package OOP;

public class wrapperclasses_generics {
    public static void main(String [] args){
        Dog1<String> d1=new Dog1("Hanuman");
        Dog2<String, Integer> d2=new Dog2("Hanuman",45);
        //String is a wrapper class

    }
}

class Dog1<E>{ //E is data type you can set you
    // can name it in capital letters oe whatever you want\
    E id;

    public Dog1(E id){
        this.id=id;
    }
}

class Dog2<E , V>{ //E is data type you can set you
    // can name it in capital letters oe whatever you want\
    E id;
    V name;

    public Dog2(E id ,V name){
        this.id=id;
        this.name=name;
    }
}


