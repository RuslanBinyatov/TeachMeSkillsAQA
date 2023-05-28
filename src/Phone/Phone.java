package Phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {
    }
    public void getInfo() {
        System.out.println("Phone number: " + this.number + "\n" +
                "Phone model: " + this.model + "\n" +
                "Phone weight (gram): " + this.weight);
    }
    public void receiveCall(String name) {
        System.out.println(name + " is calling");
    }
    public void getNumber() {
        System.out.println(number);
    }
    public void receiveCall(String name, String number) {
        System.out.println(name + " is calling " + number);
    }
    public void sendMessage(String ... nums){
        System.out.println("Phone numbers to which the message will be sent: ");
        for (String elements: nums){
            System.out.println(elements);
        }
    }
}
