class Animal{
    public void eat(){
        System.out.println("Parent/Base class called");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Derived/Child class called");
    }
}

public class singleInheri {
    public static void main(String[] args) {
        
        System.out.println("Manin class called !!");

        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}
