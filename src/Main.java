import java.util.Scanner;

// Homework_6
public class Main
{
    public static void main(String[] args) {
        getThreeArrayEachElementNum();
        getChessBoard();
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
    public static void getThreeArrayEachElementNum() {
        int [][][] threeArray = new int [][][] {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        };
        for (int dm1 = 0; dm1 < threeArray.length; dm1++) {
            for (int dm2 = 0; dm2 < threeArray[dm1].length; dm2++) {
                for (int dm3 = 0; dm3 < threeArray[dm1][dm2].length; dm3++) {
                    System.out.print(threeArray[dm1][dm2][dm3] + "  ");
                }
                System.out.println();
            }
        }
        System.out.println();
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
        String [][] doubleArray = new String [8][8];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[0].length; j++) {
                if ((i + j) % 2 == 0) doubleArray [i][j] = "W";
                else doubleArray [i][j] = "B";
                System.out.print(doubleArray[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}