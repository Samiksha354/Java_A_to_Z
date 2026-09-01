package OOP;
class Car{
    String type;
    int year;
    public Car(String type,int year) {
        this.type = type;
        this.year = year;
    }
    /// Override to string method
    @Override
    public String toString(){
        return "car model "+type+"car year"+year;

    }
}
public class javaObjectClass {
    public static void main(String[] args){
        Car obj=new Car("Honda",6789);
        System.out.print(obj); ///obj.toString which we dont need to write cause
        ///it will automatically can it
    }
}
