/* Half Pyramid
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class pattern9 {
    public static void main(String[] args) {
        /* 
        int n=5;   //rows

        // Upper half of the diamond
        for(int i=0; i<=n-1; i++){  //row
            for(int j=0; j<=i-1; j++){    //col
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for(int i=n-0; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */
        int n=5;   //rows

        // Upper half of the diamond
        for(int i=1; i<=n-1; i++){  //row
            for(int j=0; j<=i-1; j++){    //col
                System.out.print(n+" ");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for(int i=n-0; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}