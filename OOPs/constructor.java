
class A 
{
    //instance variables
    int a;
    String name;

   A()  //constructor
    {
        //value initialization
        a=0;
        name=null;
    }
    void show() //methods
    {
        System.out.print(a+" "+name);
    }
}

public class constructor {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
    }
}
