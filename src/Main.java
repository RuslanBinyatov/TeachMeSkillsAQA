// Homework_4
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        getSwitchCaseMonth();
        getIfElseIfMonth();
        getEvenNumber();
        getOutTemp();
        getColorRainbow();

        getForOddNumber();
        getForNumber();
        getSumPosNum();
        getSequence();
        getTenFirstNum();
        getSquareNum();
        getSquareNumDiff();

        getElevenFirstFibonacci();
        getDeposit();
        getMultiplicatTab();
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
            } else if (num == 3 || num == 4 || num == 5) {
                System.out.println("Time of the year: Spring");
            } else if (num == 6 || num == 7 || num == 8) {
                System.out.println("Time of the year: Summer");
            } else if (num == 9 || num == 10 || num == 11) {
                System.out.println("Time of the year: Autumn");
            } else {
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
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
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
            } else if (t <= -5 && t > -20) {
                System.out.println("Outdoor temperature: Normally");
            } else {
                System.out.println("Outdoor temperature: Cold");
            }
        }

        // 5. По введенному номеру определить цвет радуги (1 –красный, 4 – зеленый и т. д.).
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
            for (int i = 1; i < 100; i++) {
                if (i % 2 != 0) {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }

        /*
        2. Необходимо вывести на экран числа от 5 до 1.
        При решении используйте операцию декремента (--).
         */
        public static void getForNumber() {
            for (int i = 5; i > 0; i--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        /*
        3. Напишите программу, где пользователь вводит любое целое положительное число.
        А программа суммирует все числа от 1 до введенного пользователем числа.
        Для ввода числа воспользуйтесь классом Scanner.
        */
        public static void getSumPosNum() {
            Scanner posnum = new Scanner(System.in);
            System.out.print("Please, enter any positive number: ");
            int num = posnum.nextInt();
                int sum = 0;
                for (int i = 1; i < num; i++) {
                sum = sum + i;
                }
                if (num > 0) {
                    System.out.println(sum);
                }
                else {
                    System.out.println("The entered value is not a positive number, please try again");
                }
        }

        /*
        4. Необходимо, чтоб программа выводила на экран вот такую последовательность:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98.
        В решении используйте цикл while.
         */
        public static void getSequence() {
            int i = 7;
            while (i <= 98) {
                System.out.print(i+" ");
                i = i + 7;
            }
            System.out.println();
        }

        // 5. Вывести 10 первых чисел последовательности 0,-5,-10,-15...
        public static void getTenFirstNum() {
            int a = 0;
            for (int i = 0; i < 10; i++) {
                System.out.print(a+" ");
                a = a - 5;
            }
            System.out.println();
        }

        // 6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
        public static void getSquareNum() {
            for (int i = 10; i <= 20; i++) {
                System.out.print(i * i+" ");
            }
            System.out.println();
        }
        // 6. Иной способ
        public static void getSquareNumDiff() {
            for (int i = 10; i <= 20; i++) {
                System.out.print((int) Math.pow(i, 2) + " ");
            }
            System.out.println();
        }

    // Дополнительное задание
        // 1. Выведите на экран первые 11 членов последовательности Фибоначчи.
        public static void getElevenFirstFibonacci() {
            int a = 1;
            int b = 1;
            int c;
            System.out.print(a+" "+b+" ");
            for (int i = 3; i <= 11; i++) {
                c = a + b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
            System.out.println();
        }

        /*
        2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
        Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
        А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
        Для вычисления суммы с учетом процентов используйте цикл for.
        Пусть сумма вклада будет представлять тип float.
         */
        public static void getDeposit() {
            Scanner deposit = new Scanner(System.in);
            System.out.print("Please, enter deposit amount: ");
            float sum = deposit.nextFloat();
            System.out.print("Please, enter the term of the deposit in months: ");
            int period = deposit.nextInt();
            deposit.close();
                for(int i = 1; i <= period; i++) {
                    sum = (float) (sum + (sum * 0.07));
                }
                        if (period == 1) {
                            System.out.print("After "+period+" month the amount of the deposit will be: "+sum);
                        }
                        else {
                            System.out.print("After "+period+" months the amount of the deposit will be: "+sum);
                        }
            System.out.println();
        }

        // 3. Напишите программу, которая выводит на консоль таблицу умножения.
        public static void getMultiplicatTab() {
            for (int i = 1; i < 10; i++) {
                System.out.print(i + "  ");
            }
            System.out.println();
            int a = 0;
            int b;
            for (int i = 1; i < 10; i++) {
                b = a + 2;
                a = b;
                if (b < 8) {
                    System.out.print(b + "  ");
                }
                else {
                    System.out.print(b + " ");
                }
            }
            System.out.println();
            int c = 0;
            int d;
            for (int i = 1; i < 10; i++) {
                d = c + 3;
                c = d;
                if (d < 9) {
                    System.out.print(d + "  ");
                }
                else {
                    System.out.print(d + " ");
                }
            }
            System.out.println();
            int e = 0;
            int f;
            for (int i = 1; i < 10; i++) {
                f = e + 4;
                e = f;
                if (f < 8) {
                    System.out.print(f + "  ");
                }
                else {
                    System.out.print(f + " ");
                }
            }
            System.out.println();
            int g = 0;
            int h;
            for (int i = 1; i < 10; i++) {
                h = g + 5;
                g = h;
                System.out.print(h + " ");
            }
            System.out.println();
            int k = 0;
            int l;
            for (int i = 1; i < 10; i++) {
                l = k + 6;
                k = l;
                System.out.print(l + " ");
            }
            System.out.println();
            int m = 0;
            int n;
            for (int i = 1; i < 10; i++) {
                n = m + 7;
                m = n;
                System.out.print(n + " ");
            }
            System.out.println();
            int o = 0;
            int p;
            for (int i = 1; i < 10; i++) {
                p = o + 8;
                o = p;
                System.out.print(p + " ");
            }
            System.out.println();
            int q = 0;
            int r;
            for (int i = 1; i < 10; i++) {
                r = q + 9;
                q = r;
                System.out.print(r + " ");
            }
        }

}