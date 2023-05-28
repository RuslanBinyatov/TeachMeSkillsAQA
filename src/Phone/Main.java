package Phone;
/*
    Основное задание - ООП
        1. Класс Phone.
        Создайте класс Phone, который содержит переменные number, model и weight.
        Создайте три экземпляра этого класса.
        Выведите на консоль значения их переменных.
        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
        Выводит на консоль сообщение “Звонит {name}”.
        getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
        Добавить конструктор в класс Phone,
        который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
        Добавить конструктор,
        который принимает на вход два параметра для инициализации переменных класса - number, model.
        Добавить конструктор без параметров.
        Вызвать из конструктора с тремя параметрами конструктор с двумя.
        Добавьте перегруженный метод receiveCall,
        который принимает два параметра - имя звонящего и номер телефона звонящего.
        Вызвать этот метод.
        Создать метод sendMessage с аргументами переменной длины.
        Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
        Метод выводит на консоль номера этих телефонов.
*/
public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("+375291111111", "IPhone", 100);
        Phone phone2 = new Phone("+375332222222", "Xiaomi", 200);
        Phone phone3 = new Phone("+375443333333", "Samsung", 300);

        phone1.getInfo();
        phone1.receiveCall("Archil");
        phone2.getNumber();
        phone1.receiveCall("Anna", "+375294444444");
        System.out.println();

        phone2.getInfo();
        phone2.receiveCall("Ruslan");
        phone3.getNumber();
        phone2.receiveCall("Olga", "+375335555555");
        System.out.println();

        phone3.getInfo();
        phone3.receiveCall("Ivan");
        phone1.getNumber();
        phone3.receiveCall("Elena", "+375446666666");
        System.out.println();

        phone1.sendMessage("+375297777777", "+375338888888", "+375449999999");
    }
}