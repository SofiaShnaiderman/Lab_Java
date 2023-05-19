package edu.shnaiderman;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 20;

    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        printMatrix(matrix);

        int minimum = findMinimum(matrix);
        int maximum = findMaximum(matrix);
        double average = calculateAverage(matrix);

        System.out.println("Min Element: " + minimum);
        System.out.println("Max Element: " + maximum);
        System.out.println("Arithmetic mean: " + average);
    }

    private static int[][] createMatrix() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix width (max 20): ");
        int width = scanner.nextInt();
        if (width > 20) {
            System.out.println("Invalid value, please try again :-(");
        }
        System.out.print("Enter matrix height (max 20): ");
        int height = scanner.nextInt();
        if (height > 20) {
            System.out.println("Invalid value, please try again :-(");
        }


        width = Math.min(width, MAX_SIZE);
        height = Math.min(height, MAX_SIZE);

        int[][] matrix = new int[height][width];
        Random random = new Random();

        System.out.println("Enter matrix elements yourself (0) or generate randomly (1)?");
        int choice = scanner.nextInt();

        if (choice == 0) {
            System.out.println("Enter matrix elements:");

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
        } else {
            System.out.println("Generating random matrix...");

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = random.nextInt(100); // Change the range as needed
                }
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static int findMinimum(int[][] matrix) {
        int min = matrix[0][0];

        for (int[] row : matrix) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }

        return min;
    }

    private static int findMaximum(int[][] matrix) {
        int max = matrix[0][0];

        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }

        return max;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }

        return (double) sum / count;
    }
}
