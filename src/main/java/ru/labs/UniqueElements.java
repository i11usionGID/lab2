package ru.labs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueElements {
    UniqueElements(ArrayList<Integer> list) {
        uniqueNumberOfList(list);
    }

    public void uniqueNumberOfList(ArrayList<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        for (Integer element : set) {
            int counter = 0;
            int number = 0;
            for (int j = 0; j < 100; j++) {
                if (list.get(j) == element) {
                    counter++;
                    number = j;
                }
            }
            if (counter == 1) {
                System.out.print(number + "  ");
            }
        }
    }
}
