public class Motorcycle extends Vehicle {
    private final int engineCapacity;
    private final String motorcycleType;

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, int engineCapacity, String motorcycleType) {
        super(manufacturer, model, yearOfManufacture);
        this.engineCapacity = engineCapacity;
        this.motorcycleType = motorcycleType;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Hubraum: " + engineCapacity + " ccm");
        System.out.println("Typ: " + motorcycleType);
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }
}
