
class Aa {
    int x, y;

    Aa(int a, int b) {
        x = a;
        y = b;
    }

    void show() {
        System.out.print(x + " " + y);
    }
}

public class parameterizedConst {
    public static void main(String[] args) {
        Aa p = new Aa(100, 200);
        p.show();
    }
}
