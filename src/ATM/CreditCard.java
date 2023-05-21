package ATM;

public class CreditCard {
    private String cardNumber;
    private double balance;
    private double put;
    private double remove;

    public CreditCard() {
        this.cardNumber = "Unknown number";
    }
    public CreditCard(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }
    public void getCreditCardinfo() {
        System.out.println("Credit card number is: " + this.cardNumber);
        System.out.println("Credit card balance is: " + this.balance);
    }
    public void getAddAmount() {
        System.out.println("Credit card balance is: " + this.balance);
    }
    public double getPut() {
        return put;
    }
    public void setPut(double put) {
        this.put = put;
    }
    public double getRemove() {
        return remove;
    }
    public void setRemove(double remove) {
        this.remove = remove;
    }
    public void putMoney() {
        double newBalance = balance + getPut();
        System.out.println("Account balance after crediting money: " + newBalance);
    }
    public void removeMoney() {
        double newBalance = balance - getRemove();
        System.out.println("Account balance after withdrawal: " + newBalance);
    }
}