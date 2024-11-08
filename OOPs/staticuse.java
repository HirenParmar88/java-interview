
class Student{
    String name;
    static String colname;
    public static void changeColl(){
        colname="new coll";
    }
}
public class staticuse {
    public static void main(String[] args) {
        //staticuse Student=new staticuse();
        Student.colname="GLS University";
        Student student1=new Student();
        student1.name="Hiren";
        System.out.println(student1.colname);
    }
}
