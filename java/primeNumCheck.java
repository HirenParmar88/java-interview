import java.util.Scanner;

public class primeNumCheck {
    public static void main(String[] args){
        //int num=51;
        //num=Scanner();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");

        int num=sc.nextInt();
        System.out.println("Your Number is : " +num);
        
        boolean isPrime=true;
        if(num <= 1){
            isPrime=false;
        }else{
            for(int i=2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num+" : Prime Number");
        }else{
            System.out.println(num+" : Not a Prime");
        }
    }
}
