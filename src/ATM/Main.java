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
        System.out.println();
        b2.getCreditCardinfo();
        System.out.println();
        c3.getCreditCardinfo();
        System.out.println();
    }
}

public class AccountMovement {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("1456 7388 9052 1659", 2370.5);
        CreditCard card2 = new CreditCard("6194 3807 1516 0284", 4236.9);
        CreditCard card3 = new CreditCard("5890 0000 2391 1365", 1347.45);

        card1.getCardInfo();
        card1.setPut(1988.2);
        card1.addMoney();
        System.out.println();

        card2.getCardInfo();
        card2.setAccrual(3400);
        card2.addMoney();
        System.out.println();

        card3.getCardInfo();
        card3.setWriteOff(276.8);
        card3.withdrawMoney();
    }
}
