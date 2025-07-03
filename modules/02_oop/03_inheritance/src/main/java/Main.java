public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Canyon", "Grail CF SL 7", 2023);
        Car car = new Car("Cupra", "Born", 2024, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBF600", 2012, 600, "Naked Bike");

        vehicle.printInfo();
        car.printInfo();
        motorcycle.printInfo();
    }
}
