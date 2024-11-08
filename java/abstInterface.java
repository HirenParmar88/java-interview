//OOPS : Abstraction 
// use interface 

interface Animal1{
    int eyes=2;     //static or fix properties
    //public void walk1();
    void walk1();   //default public

}
interface Animal2{
    
}

//implements multiple inheritance
class Horse1 implements Animal1,Animal2{
    public void walk1(){
        System.out.println("Horse walk");
    }
}
public class abstInterface {
    public static void main(String[] args) {
        Horse1 h1=new Horse1();
        h1.walk1();
    }
}
