
/**
 * Innerinterface2
 */
interface Bank1 {
    float rateOfInterest();
}
class SBI1 implements Bank1{
    public float rateOfInterest(){
        return 9.15f;
    }
}
class PNB1 implements Bank1{
    public float rateOfInterest(){
        return 9.7f;
    }
}

class interface2 {
    public static void main(String[] args) {
        Bank1 b=new SBI1();
        System.out.println("Rate of Interest: "+b.rateOfInterest());
    }    
}
