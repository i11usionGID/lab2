package ru.labs;

import java.util.Arrays;

public class ArrayOperations {

    ArrayOperations(int[] array) {
        multiplyAndCompress(array);
    }


    public void multiplyAndCompress(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num != 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : array) {
            if (num != 0) {
                result[index++] = num * 4;
            }
        }
        int n = result.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (result[j] < result[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = result[minIndex];
            result[minIndex] = result[i];
            result[i] = temp;
        }
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(result));
    }
}
