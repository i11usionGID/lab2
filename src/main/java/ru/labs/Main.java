package ru.labs;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(199) - 99 );
        }
        System.out.println("Массив из 100 элементов:");
        System.out.println(list);
        CreateReciprocalFraction(list);
        System.out.println("Уникальные номера элементов массива");
        UniqueElements uniqueElements = new UniqueElements(list);
        int[] array = {5, 0, 10, 4, 2, 0, 12, 1, 6, 7, 5, 0, 2};
        System.out.println("\nМассив:");
        System.out.println(Arrays.toString(array));
        ArrayOperations arrayOperations = new ArrayOperations(array);
        Matrix matrix = new Matrix();
     }

    public static void CreateReciprocalFraction(ArrayList<Integer> list) {
        Collections.reverse(list);
        System.out.println("Перевернутый массив:");
        System.out.println(list);
    }
}