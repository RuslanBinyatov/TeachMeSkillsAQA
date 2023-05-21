package CreditCard;

public class CreditCard {
    private String cardNumber;
    private double balance;
    int sum;

//    public static Scanner scanner() {
//
//        return new Scanner(System.in);
//    }
//    System.out.print("Please, enter the amount you want to put on the card: ");
//    int sum = scanner.nextInt();

    public CreditCard() {
        this.cardNumber = "Unknown number";
    }
    //    public Scanner scanner() {
//        return new Scanner(System.in);
//    }
    public CreditCard(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }
    public void getCreditCardinfo() {
        System.out.println("Credit card number is: " + this.cardNumber);
        System.out.println("Credit card balance is: " + this.balance);
    }
    //    public void getBalance() {
//        return;
//    }
    public void getAddAmount() {
        System.out.println("Credit card balance is: " + this.balance);
    }


    //    void getCardInfo()
//    {
//        System.out.println("Card account number: "+ accountNumber);
//        System.out.println("Current amount on the card: " + currentAmount);
//    }
//    void cashWithdrawal()
//    {
//        System.out.println("Withdrawal from a credit card: "+ summa);
//        System.out.println("Current card balance: " + (currentAmount-summa));
//    }
    public void getPutSum() {
        System.out.println("Amount credited to the card: "+ sum);
        System.out.println("Credit card balance is: " + (balance + sum));
    }
}
