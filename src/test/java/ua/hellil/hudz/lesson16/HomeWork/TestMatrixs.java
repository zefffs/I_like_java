package ua.hellil.hudz.lesson16.HomeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.hellil.hudz.lessons.lesson16.HomWork.Matrixs;

public class TestMatrixs {

    @Test
    void testNull (){
        int [][] array = null;
        Assertions.assertEquals(-1, Matrixs.averageAremetic(array));
    }

    @Test
    void testEmpty(){
        int [][] array = new int[0][0];
        Assertions.assertEquals(-2, Matrixs.averageAremetic(array));
    }

    @Test
    void testArrayHasEmptyArrays(){
        int [][] array = new int[4][0];
        Assertions.assertEquals(-3, Matrixs.averageAremetic(array));
    }

    @Test
    void testIsSquare(){
        int [][] array = new int[2][2];
        Assertions.assertTrue(true == Matrixs.isSquare(array));
    }

    @Test
    void testIsNotSquare(){
        int [][] array = new int[1][2];
        Assertions.assertTrue(false == Matrixs.isSquare(array));
    }

    @Test
    void testIsEmptyMatrix(){
//        int [][] array = new int[0][0];
        int [][] array = {

        };
        Assertions.assertTrue(false == Matrixs.isSquare(array));
    }

    @Test
    void testIsNullMatrix(){
        int [][] array = null;
        Assertions.assertTrue(false == Matrixs.isSquare(array));
    }




}
