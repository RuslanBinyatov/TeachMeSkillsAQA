// Homework_5
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        getArrayEntryNum();
        //getArrayWithoutNum();
    }
    // Одномерные массивы
        /*
        0. Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том,
        входит ли заданное число в массив или нет.
        Пусть число для поиска задается с консоли (класс Scanner).
         */
    public static void getArrayEntryNum() {
        int[] numbers = new int[]{1, 2, 3, 4, 5};

        Scanner integer = new Scanner(System.in);
        System.out.print("Please, enter any integer: ");
        int num = integer.nextInt();

        int key = Arrays.binarySearch(numbers, num);

        if () {
            System.out.print(numbers[key] + " ");
        } else {
            System.out.println("The entered value is not a positive number, please try again");
        }
    }
        /*
        1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
        Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
        В результате должен быть новый массив без указанного числа.
         */
        public static void getArrayWithoutNum() {
            int[] notnum = new int[]{1, 2, 3, 4, 5};

            Scanner integer = new Scanner(System.in);
            System.out.print("Please, enter any integer: ");
            int num = integer.nextInt();

            int key = Arrays.binarySearch(numbers, num);


        }
}