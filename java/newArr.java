public class newArr {
    public static void main(String[] args) {
        int arr[]= new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        //arr[5]=80;    //error

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //System.out.println(arr);
    }
}

/*explanation
length[5]=0,1,2,3,4


*/