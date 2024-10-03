package ru.labs;

import java.util.Random;

public class Matrix {

    Random random = new Random();
    Matrix() {
        createMatrixAndVector();
    }

    void createMatrixAndVector() {
        int rows = random.nextInt(5) + 2;
        int cols = random.nextInt(5) + 2;

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Матрица: ");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print("  " + value);
            }
            System.out.println();
        }

        int[] vectorB = new int[rows];

        for (int i = 0; i < rows; i++) {
            vectorB[i] = isRowSorted(matrix[i]) ? 1 : 0;
        }

        System.out.println("Вектор B:");
        printVector(vectorB);
    }
    public boolean isRowSorted(int[] row) {
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] > row[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public void printVector(int[] vector) {
        for (int value : vector) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
