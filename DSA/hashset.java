import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        System.out.println("Hashing..");
        //create
        HashSet<Integer> set = new HashSet<>();
        //ArrayList<Integer> list = new ArrayList<>();
        //Add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        System.out.println("size of set : "+ set.size());
        //search - contains
        if(set.contains(1)){
            System.out.println("Exist..");
        }
        if(!set.contains(6)){
            System.out.println("Does not exist..");
        }
        //Delete - remove
        set.remove(1);
        System.out.println("updated:"+ set);
        if(!set.contains(1)){
            System.out.println("does not contains");
        }

        //Iterator - var
        Iterator it = set.iterator();
        //hasNext; next function
        System.out.println("it.hasNext() "+ it.hasNext());
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
