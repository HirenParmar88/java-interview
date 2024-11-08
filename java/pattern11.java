public class pattern11 {
    public static void main(String[] args) {
        int n=7;
        int k=0;

        for(int i=1; i<=n; i++){
            /*if(i<=4){
                k++;
            }else{
                k--;
            }*/
            for(int j=1; j<=n; j++){
                if(j>=5-i && j<=3+i){
                    System.out.print("*");
                
                }else{
                    System.out.print(" ");
                }            
            }
            System.out.println();
        }
    } 
}
