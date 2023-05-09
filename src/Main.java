// Homework_4
public class Main {
    public static void main(String[] args) {
        getSwitchCaseMonth();
        getIfElseIfMonth();
        getEvenNumber();
        getOutTemp();
        getColorRainbow();

        getForOddNumber();
    }
    // Управляющие конструкции
        /*
        1. Написать программу для вывода названия поры года по номеру месяца.
        При решении используйте оператор switch-case.
         */
        public static void getSwitchCaseMonth() {
            int num = 12;
            switch (num) {
                case 1, 2, 12:
                    System.out.println("Time of the year: Winter");
                    break;
                case 3, 4, 5:
                    System.out.println("Time of the year: Spring");
                    break;
                case 6, 7, 8:
                    System.out.println("Time of the year: Summer");
                    break;
                case 9, 10, 11:
                    System.out.println("Time of the year: Autumn");
                    break;
                default:
                    System.out.println("There is no month with this number");
                }
        }
        /*
        2. Написать программу для вывода названия поры года по номеру месяца.
        При решении используйте оператор if-else-if.
         */
        public static void getIfElseIfMonth() {
            int num = 10;
            if (num == 1 || num == 2 || num == 12) {
                System.out.println("Time of the year: Winter");
            }
            else if (num == 3 || num == 4 || num == 5) {
                System.out.println("Time of the year: Spring");
            }
            else if (num == 6 || num == 7 || num == 8) {
                System.out.println("Time of the year: Summer");
            }
            else if (num == 9 || num == 10 || num == 11) {
                System.out.println("Time of the year: Autumn");
            }
            else {
                System.out.println("There is no month with this number");
            }
        }
        /*
        3. Напишите программу, которая будет принимать на вход число и на
        выход будет выводить сообщение четное число или нет.
        Для определения четности числа используйте операцию получения
        остатка от деления - операция выглядит так: '% 2').
         */
        public static void getEvenNumber() {
            int num = 5;
            if (num % 2 == 0) {
                System.out.println("Четное число");
            } else {
                System.out.println("Нечетное число");
            }
        }
        /*
        4. Для введенного числа t (температура на улице) вывести
        Если t>–5, то вывести «Тепло».
        Если –5>= t > –20, то вывести «Нормально».
        Если –20>= t, то вывести «Холодно».
         */
        public static void getOutTemp() {
            int t = -22;
            if (t > -5) {
                System.out.println("Outdoor temperature: Warm");
            }
            else if (t <= -5 && t > -20) {
                System.out.println("Outdoor temperature: Normally");
            }
            else {
                System.out.println("Outdoor temperature: Cold");
            }
        }
        /*
        5. По введенному номеру определить цвет радуги (1 –красный, 4 – зеленый и т. д.).
         */
        public static void getColorRainbow() {
            int num = 4;
            switch (num) {
                case 1:
                    System.out.println("Rainbow color: Red");
                    break;
                case 2:
                    System.out.println("Rainbow color: Orange");
                    break;
                case 3:
                    System.out.println("Rainbow color: Yellow");
                    break;
                case 4:
                    System.out.println("Rainbow color: Green");
                    break;
                case 5:
                    System.out.println("Rainbow color: Blue");
                    break;
                case 6:
                    System.out.println("Rainbow color: Dark blue");
                    break;
                case 7:
                    System.out.println("Rainbow color: Violet");
                    break;
                default:
                    System.out.println("This is unknown color");
            }
        }
    // Циклы
        /*
        1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        При решении используйте операцию инкремента (++).
         */
        public static void getForOddNumber() {
            for(int i = 1; i < 100; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

}