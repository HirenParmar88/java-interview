import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        //int number=15;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int number=sc.nextInt();

        if(number % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
