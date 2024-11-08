class Pen{
    String color;
    String type;    //blueprint; gel

    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

// this keywords use
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //Default Constructor
    /*Student(){
        System.out.println("Constructor called");
    }*/

    //Parameterized Constructor
    Student(String name, int age){
       this.name=name;
       this.age=age; 
    }

    //Copy Constructor
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){

    }
}

//main class
public class OOPS {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.color="blue";
        p1.type="gel";
        p1.write(); //write something

        Pen p2=new Pen();
        p2.color="black";
        p2.type="ballpoint";

        p1.printColor();
        p2.printColor();

        /*Student s1=new Student(); //default constructor
        s1.name="Hiren";
        s1.age=21;
        s1.printInfo();*/

        /*Student s1=new Student("yash",18);  //parameterized constructor
        s1.printInfo();*/

        Student s1=new Student();
        s1.name="Aman";
        s1.age=23;
        Student s2=new Student(s1); //copy constructor
        s2.printInfo();
    }
}
