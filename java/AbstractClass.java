/**
 * AbstractClass
 */

abstract class Bank {
    abstract int getRateOfInterest();
    
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class PNB extends SBI{
    int getRateOfInterest(){
        return 8;
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        System.out.println("Rate of Interest SBI: "+ b.getRateOfInterest()+" %");
        b=new PNB();
        System.out.println("Rate of Interest PNB: "+b.getRateOfInterest()+" %");
    }
}