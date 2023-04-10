package taco.q37.arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        var values = new ArrayList<Integer>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

//        WRONG! Exception in thread "main" java.util.ConcurrentModificationException
//        for (Integer val : values) {
//            if (val % 2 == 0) values.remove(val);
//        }
//        System.out.println(values);


//        CORRECT
        values.removeIf(val -> val % 2 == 0);
        System.out.println(values);

//        CORRECT
//        var result = new ArrayList<>();
//        for (Integer val : values) {
//            if (val % 2 != 0) {
//                result.add(val);
//            }
//        }
//        System.out.println(result);
    }
}
