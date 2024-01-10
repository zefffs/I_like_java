package ua.hellil.hudz.lessons.lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int findNumber = 0;

        int[] array =  new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }

        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
        printArray(array);



        while (true){
            System.out.print("Введи число для пошуку! = > ");
            if (scanner.hasNextInt()){
                findNumber = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("String!");
                scanner.nextLine();
            }
        }


//        findNumber = 14;

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int ind = (low + high) / 2;
            int temp = array[ind];

            if (temp == findNumber) {
                System.out.println("Число яке ви шукаєте знаходиться під індексом = " + ind);
                break;
            } else if (low == high && temp != findNumber) {
                System.out.println("do not finded nuber!");
                break;

            } else if (findNumber < temp ) {
                high = ind - 1;
            } else if (findNumber > temp) {
                low = ind + 1;
            }
        }
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[middle + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
