// Homework_5
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        getArrayEntryNum();
    }
    // Одномерные массивы
        /*
        0. Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том,
        входит ли заданное число в массив или нет.
        Пусть число для поиска задается с консоли (класс Scanner).
         */
    public static void getArrayEntryNum() {
        int[] numbers = new int[] {1, 2, 3, 4, 5};
        System.out.println(numbers[0]);

        Scanner integer = new Scanner(System.in);
        System.out.print("Please, enter any integer: ");
        int num = integer.nextInt();


    }
}