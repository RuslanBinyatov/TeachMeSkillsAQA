package ATM;
    /*
    Основное задание
    1. Создать класс CreditCard c полями: номер счета, текущая сумма на счету.
    Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    Добавьте метод, который выводит текущую информацию о карточке.
    Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма
    Тестовый сценарий для проверки:
    Положите деньги на первые две карточки и снимите с третьей.
    Выведите на экран текущее состояние всех трех карточек.
    */
public class Main {
    public static void main (String[] args) {
        CreditCard a1 = new CreditCard("1111-1111-1111-1111", 1000);
        CreditCard b2 = new CreditCard("2222-2222-2222-2222", 2000);
        CreditCard c3 = new CreditCard("3333-3333-3333-3333", 3000);

        a1.getCreditCardinfo();
        a1.setPut(100);
        a1.putMoney();
        System.out.println();

        b2.getCreditCardinfo();
        b2.setPut(200);
        b2.putMoney();
        System.out.println();

        c3.getCreditCardinfo();
        c3.setRemove(300);
        c3.removeMoney();
    }
}
