public class pattern10 {
    public static void main(String[] args){
        int n=5;
        boolean k;

        for(int i=1; i<=n; i++){
            k=true;
            for(int j=1; j<=9; j++){
                if(j>=6-i && j<=4+i && k){
                    System.out.print("*");
                    k=false;
                }else{
                    System.out.print(" ");
                    k=true;
                }
                
            }
            System.out.println();
        }
    }
}
