
// 5!=5*4*3*2*1=120

public class factorial2 {
    public static void main(String[] args) {
        int n=5;
        int result=1;
        for(int i=1; i<=n; i++){
            result *= i;
        }
        System.out.println("Factorial is : "+result);
    }
}
