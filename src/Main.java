import java.util.Scanner;

// Homework_6
public class Main
{
    public static void main(String[] args) {
        getThreeDimArrayEachElementNum();
        getChessBoard();

        getTwoDimArraySumElem();
    }
    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    // Двумерные и n-массивы
        /*
        0. Создать трехмерный массив из целых чисел.
        С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
        Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
        */
    public static void getThreeDimArrayEachElementNum() {
        int [][][] threeDimArray = new int [][][] {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        };
        for (int dm1 = 0; dm1 < threeDimArray.length; dm1++) {
            for (int dm2 = 0; dm2 < threeDimArray[dm1].length; dm2++) {
                for (int dm3 = 0; dm3 < threeDimArray[dm1][dm2].length; dm3++) {
                    System.out.print(threeDimArray[dm1][dm2][dm3] + "  ");
                }
                System.out.println();
            }
        }
        System.out.println();
        int a = 0;
    }
        /*
        1. Шахматная доска.
        Создать программу для раскраски шахматной доски с помощью цикла.
        Создать двумерный массив String-ов 8х8.
        С помощью циклов задать элементам циклам значения B(Black) или W(White).
        Результат работы программы:
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        */
    public static void getChessBoard() {
        String [][] twoDimArray = new String [8][8];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if ((i + j) % 2 == 0) twoDimArray [i][j] = "W";
                else twoDimArray [i][j] = "B";
                System.out.print(twoDimArray[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
        /*
        3. Создайте двумерный массив целых чисел.
        Выведите на консоль сумму всех элементов массива.
        */
    public static void getTwoDimArraySumElem() {
        int mas3[][] = new int[3][3];
        int sum = 0;
        for (int i = 0; i < mas3.length; i++) {
            for (int j = 0; j < mas3[i].length; j++) {
                mas3[i][j] = (int) ((Math.random() * 10)+1);
                System.out.print(mas3[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < mas3.length; i++) {
            for (int j = 0; j < mas3[i].length; j++) {
                sum = sum + mas3[i][j];
            }
        }
        System.out.println("Sum of all array elements = " + sum);
    }
}