
//Abstraction : e.g. blueprint 

abstract class Animal{  //abstract class
    abstract void walk();   //abstract function

    //constructor
    Animal(){
        System.out.println("creating a animal");
    }

    //allow to create non-abstract method
    public void eat_animal(){
        System.out.println("eating..");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("created a Hourse");
    }
    public void walk(){
        System.out.println("Horse class");
    }
}
class Lion extends Animal{
    public void walk(){
        System.out.println("Lion class");
    }
}

public class abstractionOOPS {
    public static void main(String[] args) {
        Horse horse=new Horse();
        //horse.walk();
        //horse.eat_animal();

        //Animal animal=new Animal();
        //animal.walk();
    }
}
