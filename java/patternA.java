public class patternA {
    public static void main(String[] args) {
        int n=5;
        Boolean k;
        for(int i=1; i<=n; i++){
            k=true;
            for(int j=1; j<=9; j++){
                if(j>=i && j<=10-i){
                    k=false; 
                    System.out.print("*");
                }else{
                    k=true;
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        for(int i=2;i<=n;i++){
            k=true;
            for(int j=1;j<=9;j++){
                if(j>=6-i && j<=4+i){
                    k=false;
                    System.out.print("*");
                }else{
                    k=true;
                    System.out.print(" ");       
                }
            }
            System.out.println();
        }
    }
}
