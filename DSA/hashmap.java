import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        System.out.println("hashMap..");
        HashMap<String, Integer> map= new HashMap<>();
        
        //[1]Insert
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);
        System.out.println(map);
        System.out.println("size of map: "+map.size());
        //[2]serach
        if(map.containsKey("Indonesia")){
            System.out.println("exist..");
        }else{
            System.out.println("not exist");
        }

        System.out.println(map.get("China"));   //key exists
        System.out.println(map.get("Indonesia"));   //key does not exist
    
        System.out.println("***Array***");
        int arr[] = {12,15,18,20};
        for(int i=0;i<4; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();

        //1.entrySet()
        System.out.println("***Map.Entry***");
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //2.keySet()
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        //[3]Delete
        map.remove("China");
        System.out.println("Deleted Success:"+map);
    }
}
