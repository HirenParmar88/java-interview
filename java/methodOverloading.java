// Polymorphism
// Type-1 -> Compile time polymorphism (i) Method overloading - early binding


public class methodOverloading {
    public int sum(int x, int y){
        return(x+y);    //30
    }
    public int sum(int x, int y, int z){
        return(x+y+z);  //60
    }
    public double sum(double x, double y){
        return(x+y);    //31.5
    }
    public static void main(String[] args) {
        methodOverloading s=new methodOverloading();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10,20,30));
        System.out.println(s.sum(10.5,20.5));
    }
}
