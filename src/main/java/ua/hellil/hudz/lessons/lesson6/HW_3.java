package ua.hellil.hudz.lessons.lesson6;

public class HW_3 {
    public static void main(String[] args) {

                int countStarShip = 0;
                int nameCountStarShip = 100;

                for (int i = 1; countStarShip < nameCountStarShip; i++) {

//                    if (nameCountStarShip == countStarShip) {
//                        break;
//                    }

                    if (proverka(i)) {
                        continue;
                    }

                    System.out.println(i);
                    countStarShip++;
//                    System.out.println("countStarShip  " + countStarShip);


                }
            }

            // Проверка, содержит ли число 4 или 9
            private static boolean proverka(int number) {
                while (number > 0) {
                    int digit = number % 10;
                    if (digit == 4 || digit == 9) {
                        return true;
                    }
                    number /= 10;
                }
                return false;
            }
        }






