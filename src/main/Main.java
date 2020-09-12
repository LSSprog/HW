package main;

import com.sun.corba.se.spi.ior.IdentifiableFactory;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        //Arrays4 arrays4 = new Arrays4();

        //Integer[] arrayInt = new Integer[]{0,2,3,5,6};
        //Integer[] arrayInt2 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        //Integer[] arrayInt3 = {1, 2, 3, 5, 2, 3, 8, 1, 7};
        //ArrayList<Integer> newArray = new ArrayList<>();
        //System.out.println(Arrays.toString(arrayInt2));

        //System.out.println(Arrays.toString(changeArrAfterLast4(arrayInt2)));
       // Integer[] al = changeArrAfterLast4(arrayInt3);
       // System.out.println(Arrays.toString(al));

        //System.out.println(isThere1or4(arrayInt));

        //arrays4.changeArrAfterLast4(arrayInt2);

    }

    /* public static Integer[] changeArrAfterLast4 (Integer[] arr) {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(arr));
        int posLast4 = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 4) {
                posLast4 = i;
            }
        }
        System.out.println(posLast4);

        try {
            if (posLast4 == -1) {
                throw new Num4isMissingException("В массиве нет ни одной цифры 4");
            }
        } catch (Num4isMissingException e) {
            System.out.println(e);
        }

        // list.subList(indexStart, indexEnd).clear()
        list.subList(0, (posLast4+1)).clear();

        Integer[] newArr  = /*(Integer[])*//*list.toArray(new Integer[list.size()]);

        return newArr; //list;
    }*/

    /*public static boolean isThere1or4 (Integer[] arr) {
        for (Integer ai: arr) {
            if (ai == 1 || ai == 4) {
                return true;
            }
        }
        return false;
    }*/
}
