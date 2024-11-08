
class Animal{
    void eat(){
        System.out.println("method of eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("method of barking");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("method of meow");
    }
}

public class hierarchical {
    public static void main(String[] args) {
        System.out.println("main class running !!");
        Cat c= new Cat();
        c.meow();
        c.eat();
        //c1.b();
    }
}
