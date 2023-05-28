package Phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {
    }

    public String getNumber() {
        return number;
    }

    public void getInfo() {
        System.out.println("The phone number is " + getNumber() + "\n" +
                "The model is " + this.model + "\n" +
                "The phone weight is " + this.weight);
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling.");
    }

    public void receiveCall(String name, String number) {
        System.out.println(name + " is calling." +
                "The phone number is " + number);
    }

    public void sendMessage(String... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Send message to number " + numbers[i]);
        }
    }
}
