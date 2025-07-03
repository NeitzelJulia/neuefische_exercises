public class Vehicle {
    private final String manufacturer;
    private final String model;
    private final int yearOfManufacture;

    public Vehicle(String manufacturer, String model, int yearOfManufacture) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void printInfo() {
        System.out.println("Hersteller: " + manufacturer);
        System.out.println("Modell: " + model);
        System.out.println("Baujahr: " + yearOfManufacture);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
}
