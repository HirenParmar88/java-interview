public class starPattern {
    public static void main(String[] args) {
        //int i, j;
        for(int i=1; i<=5; i++){    //row
            for(int j=1; j<=9; j++){    //col
                if(j>=6-i && j<=4+i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
