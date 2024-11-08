
// Fibonacci series program
// e.g 
// 0 1 1 2 3 5 8 13

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int temp,a=0,b=1,c;
        System.out.print("Enter Number : ");
        Scanner r=new Scanner(System.in);
        temp=r.nextInt();

        for(int i=1;i<=temp;i++){
            System.out.print(a);
            c=a+b;
            a=b;
            b=c;

        }
    }    
}
