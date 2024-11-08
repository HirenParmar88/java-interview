import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        //ArrayList<String> list2=new ArrayList<String>();
        //ArrayList<Boolean> list3=new ArrayList<>();

        //add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(7);
        list.add(11);
        System.out.println(list);

        //get elements
        int element = list.get(1);
        System.out.println(element);

        //add elements in between
        list.add(0,5);
        System.out.println(list);

        //set elements
        list.set(2,15);
        System.out.println(list);

        //delete elements
        list.remove(3);
        System.out.println(list);

        //size
        int size=list.size();
        System.out.println(size);

        //loops
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
