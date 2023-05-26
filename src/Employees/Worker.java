package Employees;

public class Worker implements Employees {
    String positionName = "Worker";

    @Override
    public void getPositionName() {
        System.out.println("Name of position is " + positionName);
    }
}
