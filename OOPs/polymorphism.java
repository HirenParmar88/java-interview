//types : 
//1) compile time -> Function overloading 
//2) runtime polymorphism -> method overriding 
//Function overloading means same name function repeared from class.

public class polymorphism {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name +" "+ age); //Hiren Parmar
    }
    public static void main(String[] args) {
        polymorphism p=new polymorphism();
        p.name="Hiren";
        p.age=21;
        p.printInfo(p.name, p.age);
    }
}
