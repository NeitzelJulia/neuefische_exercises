public class Car {

    private String brand;
    private String model;
    private String color;
    private int yearOfManufacture;
    private int speed;
    private boolean engineIsRunning;

    public Car(String brand, String model, String color, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = 0;
        this.engineIsRunning = false;
    }

    public void startEngine() {
        if (this.engineIsRunning) {
            throw  new IllegalStateException("Your engine is already running");
        }
        this.engineIsRunning = true;
        System.out.println("Starte den Motor ...");
    }

    public void accelerate(int acceleration) {
        if (!this.engineIsRunning) {
            throw  new IllegalStateException("Your engine is not running");
        }
        this.speed += acceleration;
        System.out.println("Du beschleunigst auf " + this.speed + " km/h.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", speed=" + speed +
                ", engineIsRunning=" + engineIsRunning +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEngineIsRunning() {
        return engineIsRunning;
    }
}
