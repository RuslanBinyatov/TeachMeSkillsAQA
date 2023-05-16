import java.util.Scanner;

// Homework_6
public class Main
{
    public static void main(String[] args) {
        getThreeDimArrayEachElementNum();
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
    public static void getThreeDimArrayEachElementNum() {
        int [][][] threeDimArray = new int [][][] {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        };
        int a = 0;
        int b = 0;
        int c = 0;
        for (int dm1 = 0; dm1 < threeDimArray.length; dm1++) {
            a = d + 1;
            d = a;
            for (int dm2 = 0; dm2 < threeDimArray[dm1].length; dm2++) {
                b = dm2 + 1;
                dm2 = b;
                for (int dm3 = 0; dm3 < threeDimArray[dm1][dm2].length; dm3++) {
                    c = dm3 + 1;
                    dm3 = c;
                    System.out.print(threeDimArray[dm1][dm2][dm3] + "  ");
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
}