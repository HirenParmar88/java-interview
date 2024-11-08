public class pattern {
    public static void main(String[] args) {
        int a=5;
        //upper
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower
        for(int i=a-1;i>=1;i--){
            for(int j=1;j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
