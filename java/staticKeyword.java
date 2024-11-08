
// static keyword 

class Stud{
    String name;
    static String college;  //common properties

    public static void changeCollege(){ //static method
        college="MKBU";
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        Stud.college="GLS University";
        
        Stud stud1=new Stud();
        stud1.name="Hiren";
        System.out.println(stud1.college);
    }
}
