package Authentication;
/*
    Основное задание - Исключения
        2. Создать класс, в котором будет статический метод.
        (почитать и понять, чем статический метод отличается от нестатического - обсудить на занятии по необходимости)
        Этот метод принимает на вход три параметра:
        Login,
        Password,
        confirmPassword.
        Все поля имеют тип данных String.
        Длина login должна быть меньше 20 символов и не должен содержать пробелы.
        Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
        Длина password должна быть меньше 20 символов, не должен содержать пробелом и
        должен содержать хотя бы одну цифру.
        Также password и confirmPassword должны быть равны.
        Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
        WrongPasswordException и WrongLoginException - пользовательские классы
        исключения с двумя конструкторами – один по умолчанию,
        второй принимает сообщение исключения и передает его в конструктор класса Exception.
        Метод возвращает true, если значения верны или false в другом случае.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Please, enter your login: ");
        String login = input().nextLine();
        System.out.println("Please, enter your password: ");
        String password = input().nextLine();
        System.out.println("Please, confirm your password: ");
        String confirmPassword = input().nextLine();

        boolean result = isCorrectCredentials(login, password, confirmPassword);
        System.out.println(result);
    }

    public static Scanner input(){
        return new Scanner(System.in);
    }

    public static boolean isCorrectCredentials(String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
            checkPassword(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e);
            return false;
        }
        return true;
    }

    private static void checkLogin(String login) throws WrongLoginException {
        if (login.length() >= 20) {
            throw new WrongLoginException("You've exceeded the login length to 20 characters.");
        }
        if (login.contains(" ")) {
            throw new WrongLoginException("Your login must not contain spaces.");
        }
    }

    private static void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() >= 20) {
            throw new WrongPasswordException("You've exceeded the password length to 20 characters.");
        }
        if (password.contains(" ")) {
            throw new WrongPasswordException("Your password must not contain spaces.");
        }
        boolean noDigits = true;
        for(int i = 0; i < password.length() && noDigits; i++) {
            if(Character.isDigit(password.charAt(i))) {
                noDigits = false;
            }
        }
        if (noDigits) {
            throw new WrongPasswordException("Your password must contain at least one number.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Your confirm password not equals password.");
        }
    }
}