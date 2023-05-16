import java.util.Scanner;

// Homework_6
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
    }

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
    public static void nDimensionalArray() {
        // three-dimensional+ array
        int[][][] get3DArrayEachElementNum = new int[][][]{
                {
                        {
                                {1, 2, 3},
                                {4, 5, 6}
                        }
                }
        };

        for (int dm1 = 0; dm1 < get3DArrayEachElementNum.length; dm1++) {
            for (int dm2 = 0; dm2 < get3DArrayEachElementNum[dm1].length; dm2++) {
                for (int dm3 = 0; dm3 < get3DArrayEachElementNum[dm1][dm2].length; dm3++) {
                    System.out.println(get3DArrayEachElementNum[dm1][dm2][dm3] + " ");
                }
            }
        }
    }
}