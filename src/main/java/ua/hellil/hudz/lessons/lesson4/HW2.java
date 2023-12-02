package ua.hellil.hudz.lessons.lesson4;

public class HW2 {
    public static void main(String[] args) {

//        За владу в стародавньому Китаї боролися дві династії: Лі та Мінь.
//
//                З кожного боку боролися 3 типи воїнів з такими показниками атаки:
//
//        Лі:
//
//        воїн - 13
//        лучник - 24
//        вершник - 46
//
//        Мінь:
//
//        воїн - 9
//        лучник - 35
//        вершник - 12
//        Розрахувати: загальний показник атаки для обох династій, якщо відомо, що
//        воїнів династії Лі кожного типу було 860, а кількість воїнів династії Мінь
//        кожного типу в півтора рази більша.
//
//        Вивести в консоль значення загальної атаки кожної армії;


         int liWarion = 13;
         int liArcher = 24;
         int liRider = 46;
         int liNuberOfPeople = 860;

         int minWarion = 9;
         int minArcher = 35;
         int minRider = 12;
         int minNuberOfPeople = (int) (liNuberOfPeople * 1.5);

         int liStrong = (liArcher + liRider + liWarion) * liNuberOfPeople;
         int minStrong = (minArcher + minRider + minWarion) * minNuberOfPeople;

         System.out.println("Загальний показник атаки династії Лі = " + liStrong);
         System.out.println("Загальний показник атаки династії Мінь = " + minStrong);




    }
}
