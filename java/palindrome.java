public class palindrome {
    public static void main(String[] args) {
        int a,sum=0,temp;
        int n=121;

        temp=n;
        while(n>0){
            a=n%10;
            sum=(sum*10)+a;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("palindrome number");
        }else{
            System.out.println("not palindrome");
        }
    }
}

/* 
public class palindrome{
    public static void main(String[] args) {
        String str="madam";
        String reversed=new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            System.out.println(str + " : palindrome");
        }else{
            System.out.println(str + " : not palindrome");
        }
    }
}
*/