package Employees;

    /*
    2 Создать классы "Директор", "Рабочий", "Бухгалтер".
    Реализовать интерфейс с методом, который печатает название должности и
    имплементировать этот метод в созданные классы.
    */

public class Main {
    public static void main(String[] args) {
        getInformation();
    }

    public static void getInformation() {
        Director employee1 = new Director();
        employee1.getPositionName();

        Worker employee2 = new Worker();
        employee2.getPositionName();

        Accountant employee3 = new Accountant();
        employee3.getPositionName();
    }
}