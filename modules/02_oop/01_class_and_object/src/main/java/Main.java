public class Main {
    public static void main(String[] args) {
        Car car = new Car("Cupra", "Born", "grey", 2024);
        car.startEngine();

        Car car2 = new Car("Nissan", "Micra", "white", 2016);
        car.startEngine();
        car2.accelerate(10);
    }
}
