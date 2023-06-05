/*
    Основное задание
    1. Написать программу со следующим функционалом:
    На вход передать строку (будем считать, что это номер документа).
    Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
    - Вывести на экран в одну строку два первых блока по 4 цифры.
    - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
    - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
    - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
    (реализовать с помощью класса StringBuilder).
    - Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или нет
    (причем, abc и ABC считается одинаковой последовательностью).
    - Проверить начинается ли номер документа с последовательности 555.
    - Проверить заканчивается ли номер документа на последовательность 1a2b.
    Все эти методы реализовать в отдельном классе в статических методах,
    которые на вход (входным параметром) будут принимать вводимую на вход программы строку.
*/

import java.util.Scanner;

public class Main {
    public static Scanner input() {
        return new Scanner(System.in);
    }
    public static void main(String[] args) {
        System.out.println("Enter the document number in the format xxxx-yyy-xxxx-yyy-xyxy" +
                " (where x - number, y - letter): ");
        String docNum = input().nextLine();

        DocNum.getNum(docNum);
        System.out.println();
        DocNum.getDocNum(docNum);
        System.out.println();
        DocNum.getLowerLetters(docNum);
        DocNum.getUpperLetters(docNum);
        System.out.println();
        DocNum.checkContainString(docNum);
        DocNum.checkSequenceNum(docNum);
        DocNum.checkSequenceEnd(docNum);
    }
}