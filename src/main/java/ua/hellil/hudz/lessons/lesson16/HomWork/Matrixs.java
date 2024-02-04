package ua.hellil.hudz.lessons.lesson16.HomWork;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrixs {
    public static void main(String[] args) {

//        Додайте метод, який буде рахувати середнє арифметичне елементів масиву.
//        Зробіть метод, який прийматиме на вхід двомірну матрицю (двовимірний масив) у та перевіряти чи є вона квадратною
//        В тестовому класі створіть тестову матрицю та передайте її в метод тестованого класу


//        if array == null ----> -1
//        if array empty -----> -2
//        if array has empty arrays ------> -3

//        if array is Square ------> true
//        else is not square, empty, null ------> false
//

        int [][] array = {
                {},
                {},
                {1,2,3,4}

        };

//        int [][] array = new int[2][2];
//        int [][] array = new int[0][0];







        System.out.println(averageAremetic(array));
        System.out.println(isSquare(array));


    }
   public static double averageAremetic (int[][] array ) {


       if (array == null){
           return -1;
       }

       if (array.length == 0){
           return -2;
       }

       int sumMat = 0;
       int count = 0;

       for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {
               sumMat += array[i][j];
               count++;
           }
       }

       if (sumMat == 0) {
           return -3;
       }

       return (double) sumMat / count;
   }

   public static boolean isSquare(int[][] array ) {

        if (array == null || array.length == 0){
            return false;
        }

       for (int[] ints : array) {

           if (ints.length != array.length){
               return false;
           }
       }
       return true;
   }

}
