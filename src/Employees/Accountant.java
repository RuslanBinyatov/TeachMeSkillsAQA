package Employees;

public class Accountant implements Employees {
    String positionName = "Accountant";

    @Override
    public void getPositionName() {
        System.out.println("Name of position is " + positionName);
    }
}