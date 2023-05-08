import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
        {
            getScannerPersInf();
            getASCII();
            getBMI();
        }
        public static void getScannerPersInf()
        {
            Scanner persinf = new Scanner(System.in);

            System.out.print("Please, enter your name: ");
            String name = persinf.nextLine();
            System.out.print("Please, enter your surname: ");
            String surname = persinf.nextLine();
            System.out.print("Please, enter your age: ");
            int age = persinf.nextInt();
            System.out.print("Please, enter your height in centimeters: ");
            int height = persinf.nextInt();
            System.out.print("Please, enter your weight in kilograms: ");
            double weight = persinf.nextDouble();
            System.out.println();
            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);
            System.out.println();
            persinf.close();
        };
        public static void getASCII()
        {
            char symbol1 = 'C';
            char symbol2 = 'a';

            System.out.println("" + symbol1 + " - " + (int) symbol1);
            System.out.println("" + symbol2 + " - " + (int) symbol2);
            System.out.println();
        };
        public static void getBMI()
        {
            double Weight = 88.8;
            int Height = 171;
            double a = (double) Height / 100;
            double BMI = Weight / (a * a);
            int num = (int) Math.round(BMI);

            System.out.println("BMI = " + num + " kg/m2");
        }
}