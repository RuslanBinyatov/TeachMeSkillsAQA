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
            Scanner PersInf = new Scanner(System.in);

            System.out.print("Please, enter your name: ");
            String name = PersInf.nextLine();
            System.out.print("Please, enter your surname: ");
            String surname = PersInf.nextLine();
            System.out.print("Please, enter your age: ");
            int age = PersInf.nextInt();
            System.out.print("Please, enter your height in centimeters: ");
            int height = PersInf.nextInt();
            System.out.print("Please, enter your weight in kilograms: ");
            int weight = PersInf.nextInt();
            System.out.println();
            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);
            System.out.println();
            PersInf.close();
        };
        public static void getASCII()
        {
            char Symbol1 = 'C';
            char Symbol2 = 'a';

            System.out.println("" + Symbol1 + " - " + (int) Symbol1);
            System.out.println("" + Symbol2 + " - " + (int) Symbol2);
            System.out.println();
        };
        public static void getBMI()
        {
            double Weight = 90;
            double Height = 1.85;
            double BMI = Weight / (Height * Height);
            int num = (int) Math.round(BMI);

            System.out.println("BMI = " + num + " kg/m2");
        };
}