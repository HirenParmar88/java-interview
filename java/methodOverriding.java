// Polymorphism
// Tpte-2 -> Method Overriding (i) Runtime polymorphism - dynamic binding

// parent class and child class methods are same..

class Parent{
    void show(){    //method
        System.out.println("Parent class show()");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Child class show()");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Parent obj1=new Parent();
        obj1.show();
        Parent obj2=new Child();
        obj2.show();
    }
}
