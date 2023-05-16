import java.util.Scanner;

// Homework_6
public class Main
{
    public static void main(String[] args) {
        getThreeArrayEachElementNum();
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
        int[][][] threeArray = new int[][][] {
                {
                        {
                                {1, 2, 3},
                                {4, 5, 6}
                        }
                }
        };

        for (int dm1 = 0; dm1 < threeArray.length; dm1++) {
            for (int dm2 = 0; dm2 < threeArray[dm1].length; dm2++) {
                for (int dm3 = 0; dm3 < threeArray[dm1][dm2].length; dm3++) {
                    System.out.println(threeArray[dm1][dm2][dm3] + " ");
                }
            }
        }
    }
}