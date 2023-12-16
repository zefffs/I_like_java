package ua.hellil.hudz.lessons.lesson6;

public class HW1 {
    public static void main(String[] args) {


//    У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати 100 космічних шатлів
//    для перевезення людей на Марс так, щоб у номерах шатлів не траплялося
//    нещасливих чисел. Напишіть функцію, яка виводить усі номери таких шатлів.


        int countStarShip = 0;
        int nameCountStarShip = 100;

        for (int i = 0; i < 10; i++) {

            if (countStarShip == nameCountStarShip){
                break;
            }

            if (i == 4 || i == 9) {
                continue;
            }

            for (int j = 0; j < 10; j++) {

                if (countStarShip == nameCountStarShip){
                    break;
                }

                if (j == 4 || j == 9) {
                    continue;
                }

                for (int k = 0; k < 10; k++) {

                    if (countStarShip == nameCountStarShip){
                        break;
                    }

                    if (k == 4 || k == 9) {
                    continue;
                    }

                    System.out.println(i + "" + j + "" + k);
                    countStarShip++;
//                    System.out.println("countStarShip" + countStarShip);

                }
            }
        }
    }
}

