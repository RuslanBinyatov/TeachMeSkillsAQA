package Employees;

public class Director implements Employees {
    String positionName = "Director";

    @Override
    public void getPositionName() {
        System.out.println("Name of position is " + positionName);
    }
}