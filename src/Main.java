// Homework_5
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        getArrayEntryNum();
//        getArrayWithoutNum();
        getArrayMaxMinAvgVal();
        getArrayArithmeticMean();
//        getArrayEvenNum();
        getArrayChangeOddIndexToZero();
        getArraySortNames();
        getArrayBubbleSort();
    }
    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    // Одномерные массивы
        /*
        0. Создайте массив целых чисел.
        Напишете программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
        Пусть число для поиска задается с консоли (класс Scanner).
        */
    public static void getArrayEntryNum() {
        int[] mas0 = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(mas0));

        System.out.print("Please, enter any integer: ");
        int n0 = scanner().nextInt();

        for (int index = 0; index < mas0.length; index++) {
            if (mas0[index] == n0) {
                System.out.println("Entered integer " + n0 + " present in the array");
                break;
            }
            if (index == mas0.length - 1)
                System.out.println("The entered number " + n0 + " is not in the array");
        }
        System.out.println();
    }
        /*
        1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
        Пусть число задается с консоли (класс Scanner).
        Если такого числа нет - выведите сообщения об этом.
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
    public static void getArrayMaxMinAvgVal() {
//        Scanner integer = new Scanner(System.in);
        System.out.print("Please, enter the length of the array: ");
        int n2 = scanner().nextInt();

        int [] mas2 = new int[n2];

        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(mas2));

        int max = mas2[0];
        int min = mas2[0];
        double avg = 0;

        for (int i = 0; i < mas2.length; i++) {
            if (max < mas2[i])
                max = mas2[i];
            if (min > mas2[i])
                min = mas2[i];
            avg += mas2[i];
        }
        avg/=n2;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);

        System.out.println();
    }
        /*
        3. Создайте 2 массива из 5 чисел.
        Выведите массивы на консоль в двух отдельных строках.
        Посчитайте среднее арифметическое элементов каждого массива и сообщите,
        для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
         */
    public static void getArrayArithmeticMean() {
        int [] mas31 = new int[] {3, 1, 3, 4, 0};
        int [] mas32 = new int[] {4, 5, 0, 5, 4};

        System.out.println(Arrays.toString(mas31));
        System.out.println(Arrays.toString(mas32));

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < 5; i++) {
            average1 += mas31[i];
            average2 += mas32[i];
        }
        average1/=5;
        average2/=5;

        if (average1 > average2) {
            System.out.println("Arithmetic average of the first array ("+average1+") " +
                    "greater than the arithmetic average of the second array ("+average2+")");
        }
        else if (average1 < average2){
            System.out.println("Arithmetic average of the first array ("+average1+") " +
                    "less than the arithmetic average of the second array ("+average2+")");
        }
        else {
            System.out.println("Arithmetic averages of arrays are equal ("+average1+")");
        }
        System.out.println();
    }
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
    public static void getArrayChangeOddIndexToZero() {
        int[] mas5 = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(mas5));

        for (int i = 0; i < mas5.length; i++) {
            if(i%2 == 1){
                mas5[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas5));

        System.out.println();
    }
        /*
        6. Создайте массив строк. Заполните его произвольными именами людей.
        Отсортируйте массив. Результат выведите на консоль.
        */
    public static void getArraySortNames() {
        String [] mas6 = new String[] {"Ruslan", "Archil", "Kate", "Jack"};
        System.out.println(Arrays.toString(mas6));

        Arrays.sort(mas6);
        System.out.println(Arrays.toString(mas6));

        System.out.println();
    }
        // 7.Реализуйте алгоритм сортировки пузырьком.
    public static void getArrayBubbleSort() {
        int [] mas7 = {15, 1, 92, 3, 7};
        System.out.println(Arrays.toString(mas7));

        boolean sort = false;
        int buf;
        while(!sort) {
            sort = true;
            for (int i = 0; i < mas7.length-1; i++) {
                if(mas7[i] > mas7[i+1]){
                    sort = false;

                    buf = mas7[i];
                    mas7[i] = mas7[i+1];
                    mas7[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas7));
    }
}