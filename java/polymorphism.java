
// two types :
//1) compile time: function overloading
//2) run time:

class Student1{
    String name;
    int age;

    //compile time polymorphism -> function overloading : same name function create multiple time in single class
    public void printInfo(String name){
        System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(this.age); 
    }
    public void printInfo(String name, int age){
        System.out.println(name+ " " +age);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.name="Hiren";
        s1.age=21;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name,s1.age);
    }
}
