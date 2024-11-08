class a{
    void first(){
        System.out.println("class a");
    }
}
class b extends a{
    void second(){
        System.out.println("class b");
    }
}
class c extends b{
    void third(){
        System.out.println("class c");
    }
}

public class multilevel {
    public static void main(String[] args) {
        System.out.println("main class");
        c c1=new c();   //c1 is an object.
        c1.third();
        c1.second();
        c1.first();
    }
}
