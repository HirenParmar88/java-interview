/**
 * classAndObject
 */

class demo{
    int rno=10;
    String name="Hiren Parmar";
    void show(){
        System.out.println(rno + " " +name);
    }
}
public class classAndObject {

    public static void main(String[] args) {
        demo d=new demo();
        d.show();
    }
}