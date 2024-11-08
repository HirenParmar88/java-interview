
// Class and Objects examples

class Pen {
    String color;   //properties
    String type;    //properties

    public void write(){    //method
        System.out.println("writing something..");
    }

    public void print(){
        System.out.println(this.color);
        //System.out.println(this.type);
    }
}

//class 2
class Student{  //class
    String name;    //class properties
    int age;
    public void studInfo(){ //class methods
        System.out.println(this.name); 
        System.out.println(this.age);
    }

    //Default constructor
    Student(){
        System.out.println("constructor called");
    }
    //Parameterized constructor
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    //copy constructor
    Student(Student s3){
        this.name=s3.name;
        this.age=s3.age;
    }
}

public class classobj {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="blue";  //class properties
        pen1.type="gel pen";

        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="bollpoint";

        pen1.print();   //class method
        pen2.print();
        //pen1.write();

        //class 2
        Student s1=new Student();   //objects
        s1.name="Hiren";
        s1.age=21;
        s1.studInfo();

        //parameterized constructor
        Student s2=new Student("aaa",24);
        s2.studInfo();

        //copy constructor
        Student s3=new Student(s1);
        s3.studInfo();
    }
}
