
//palindrome number : e.g. 121 --> 121

import java.util.Scanner;

public class palindromeNum {
    public static void main(String[] args) {
        int n,s=0,c,r;
        System.out.print("Enter Any Number : ");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        c=n;

        while(n>0){ // n val 0 se > hoga to hi chalega loop.
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s){
            System.out.print("Plindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
