package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays4 {

    public Integer[] changeArrAfterLast4 (Integer[] arr) {
        if (arr == null) {
            throw new RuntimeException("Массив не должен быть пустым");
        }

        ArrayList<Integer> list = new ArrayList(Arrays.asList(arr));
        int posLast4 = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 4) {
                posLast4 = i;
            }
        }
        System.out.println(posLast4);

        /*try {*/
            if (posLast4 == -1) {
                throw new Num4isMissingException("В массиве нет ни одной цифры 4");
            }
        /*} catch (Num4isMissingException e) {
            System.out.println(e);
        }*/

        // list.subList(indexStart, indexEnd).clear()
        list.subList(0, (posLast4+1)).clear();

        Integer[] newArr  = /*(Integer[])*/list.toArray(new Integer[list.size()]);

        return newArr; //list;
    }

    public boolean isThere1or4 (Integer[] arr) {
        if (arr == null) {
            return false;
        }
        // мой вариант
        /*for (Integer ai: arr) {
            if (ai == 1 || ai == 4) {
                return true;
            }
        }
        return false;*/

        // твой вариант мне понравилсся больше
        List<Integer> list = Arrays.asList(arr);
        return list.contains(1) || list.contains(4);
    }

}
