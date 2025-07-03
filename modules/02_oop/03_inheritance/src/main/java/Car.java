public class Car extends Vehicle {
    private final int numberOfDoors;

    public Car(String manufacturer, String model, int yearOfManufacture, int numberOfDoors) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Anzahl der Türen: " + numberOfDoors);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
