// Homework_5
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        getArrayEntryNum();
//        getArrayWithoutNum();
//        getArrayMaxMinAvgVal();
//        gtr();
//        getArrayArithmeticMean();
//        getArrayEvenNum();
//        getArrayChangeOddIndexToZero();
//        getArraySortNames();
//        getArrayBubbleSort();
    }

    // Одномерные массивы
        /*
        0. Создайте массив целых чисел.
        Напишете программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
        Пусть число для поиска задается с консоли (класс Scanner).
        */
    public static void getArrayEntryNum() {
        int[] mas0 = new int[]{1, 2, 3, 4, 5};

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please, enter any integer: ");
        int num = scanner1.nextInt();

        for (int i = 0; i < mas0.length; i++) {
            if (mas0[i] == num) {
                int index0 = i;
                System.out.println(index0);
            }
            else {
            System.out.println("The entered value is not a positive number, please try again");
            }
        }
    }
}


//
//        int index = 0;
//
//        if (mas[index] == num) {
//            System.out.print(mas[index] + " ");
//        } else {
//            System.out.println("The entered value is not a positive number, please try again");

        /*
        1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
        Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
        В результате должен быть новый массив без указанного числа.
         */
//        public static void getArrayWithoutNum() {
//            int[] notnum = new int[]{1, 2, 3, 4, 5};
//
//            Scanner integer = new Scanner(System.in);
//            System.out.print("Please, enter any integer: ");
//            int num = integer.nextInt();
//
//            int k = Arrays.binarySearch(notnum, num);
//
//
//        }
        /*
        2. Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
        Для генерации случайного числа используйте метод Math.random().
        Пусть будет возможность создавать массив произвольного размера.
        Пусть размер массива вводится с консоли.
         */
//    public static void getArrayMaxMinAvgVal() {
//        Scanner integer = new Scanner(System.in);
//        System.out.print("Please, enter the length of the array: ");
//        int num = integer.nextInt();
//
//        int [] mas = new int[num];
//
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = (int) (Math.random() * 10);
//        }
//        System.out.println(Arrays.toString(mas));
//
//        int max = mas[0];
//        int min = mas[0];
//        double avg = 0;
//
//        for (int i = 0; i < mas.length; i++) {
//            if (max < mas[i])
//                max = mas[i];
//            if (min > mas[i])
//                min = mas[i];
//            avg += mas[i];
//        }
//        avg/=num;
//        System.out.println("max = " + max);
//        System.out.println("min = " + min);
//        System.out.println("avg = " + avg);
//    }
        /*
        3. Создайте 2 массива из 5 чисел.
        Выведите массивы на консоль в двух отдельных строках.
        Посчитайте среднее арифметическое элементов каждого массива и сообщите,
        для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
         */
//    public static void getArrayArithmeticMean() {
//        int [] mas1 = new int[] {3, 1, 3, 4, 0};
//        int [] mas2 = new int[] {4, 5, 0, 5, 4};
//
//        System.out.println(Arrays.toString(mas1));
//        System.out.println(Arrays.toString(mas2));
//
//        double average1 = 0;
//        double average2 = 0;
//
//        for (int i = 0; i < 5; i++) {
//            average1 += mas1[i];
//            average2 += mas2[i];
//        }
//        average1/=5;
//        average2/=5;
//
//        if (average1 > average2) {
//            System.out.println("Arithmetic average of the first array ("+average1+") " +
//                    "greater than the arithmetic average of the second array ("+average2+")");
//        }
//        else if (average1 < average2){
//            System.out.println("Arithmetic average of the first array ("+average1+") " +
//                    "less than the arithmetic average of the second array ("+average2+")");
//        }
//        else {
//            System.out.println("Arithmetic averages of arrays are equal ("+average1+")");
//        }
//    }
    // Дополнительное задание
        /*
        4. Создайте массив из n случайных целых чисел и выведите его на экран.
        Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
        Если n не удовлетворяет условию - выведите сообщение об этом.
        Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
        Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
        */
//    public static void getArrayEvenNum() {
//        Scanner integer = new Scanner(System.in);
//        System.out.print("Please, enter an array length between 6 and 10 inclusive: ");
////        int num = integer.nextInt();
//
//        int n = 0;
//
//        while (n < 3) {
//            if(integer.hasNextInt()){
//                n = integer.nextInt();
//                if(n < 3){
//                    System.out.print("Введенное число должно быть больше 3. Повторите ввод: ");
//                }
//            } else {
//                System.out.println("Вы ввели не число. Повторите ввод:");
//                integer.next();
//            }
//        }
// }
        /*
        5. Создайте массив и заполните массив.
        Выведите массив на экран в строку.
        Замените каждый элемент с нечётным индексом на ноль.
        Снова выведете массив на экран на отдельной строке.
        */
//    public static void getArrayChangeOddIndexToZero() {
//        int[] mas = new int[] {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(mas));
//
//        for (int i = 0; i < mas.length; i++) {
//            if(i%2 == 1){
//                mas[i] = 0;
//            }
//        }
//        System.out.println(Arrays.toString(mas));
//    }
        /*
        6. Создайте массив строк. Заполните его произвольными именами людей.
        Отсортируйте массив. Результат выведите на консоль.
        */
//    public static void getArraySortNames() {
//        String [] mas = new String[] {"Ruslan", "Archil", "Kate", "Jack"};
//        System.out.println(Arrays.toString(mas));
//        Arrays.sort(mas);
//        System.out.println(Arrays.toString(mas));
//    }
        // 7.Реализуйте алгоритм сортировки пузырьком.
//    public static void getArrayBubbleSort() {
//        int [] mas = {15, 1, 92, 3, 7};
//
//        boolean sort = false;
//        int buf;
//        while(!sort) {
//            sort = true;
//            for (int i = 0; i < mas.length-1; i++) {
//                if(mas[i] > mas[i+1]){
//                    sort = false;
//
//                    buf = mas[i];
//                    mas[i] = mas[i+1];
//                    mas[i+1] = buf;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(mas));
//    }
//}