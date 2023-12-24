package ua.hellil.hudz.lessons.lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
//        Після введення повинні автоматично створюватися два масиви розміром M x N
//        перший та N x M другий.


        Scanner scanner = new Scanner(System.in);

        int M = 0, N = 0;

        System.out.println("Для побудови матриці M * N введіть число більше 0!");

        while (M <= 0 || N <= 0){
            if (M <= 0) {
                System.out.print("Введіть розмір М ---> ");
                if (scanner.hasNextInt()){
                    M = scanner.nextInt();
                    scanner.nextLine();
                    if (M <= 0) {
                        System.out.println("Ви ввели негативне число або 0!");
                        continue;
                    }
                } else {
                    System.out.println("Введіть число, а не символ!!!");
                    scanner.nextLine();
                    continue;
                }
            }

            if (N <= 0) {
                System.out.print("Введіть розмір N ---> ");
                if (scanner.hasNextInt()){
                    N = scanner.nextInt();
                    scanner.nextLine();
                    if (N <= 0){
                        System.out.println("Ви ввели негативне число або 0!");
                    }
                } else {
                    System.out.println("Введіть число, а не символ!!!");
                    scanner.nextLine();
                }
            }
        } // Вводимо розміри матриці з консолі.

        int[][] arr = new int [M][N];
        int[][] arrT = new int [N][M];

        // Заповнюємо перший масив рандомними значеннями

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 21);
            }
        }

        // виводимо масив arr

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }

        //  транспонуємо матрицю arr

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrT[j][i] = arr[i][j];
            }
        }

        // виводимо масив arrТ

        System.out.println();
        System.out.println("Транспонована матриця.");
        for (int i = 0; i < arrT.length; i++) {
            for (int j = 0; j < arrT[i].length; j++) {
                System.out.print(arrT[i][j] + " \t");
            }
            System.out.println();
        }
    }
}
