public class Main {
    public static void main(String[] args) {
        Car car = new Car("Cupra", "Born", "grey", 2024);
        car.startEngine();

        Car car2 = new Car("Nissan", "Micra", "white", 2016);
        car2.startEngine();
        car2.accelerate(10);

        Person person1 = new Person("Julia", 39, Person.Gender.FEMALE);
        Person person2 = new Person("Steven", 40, Person.Gender.MALE);

        person1.introduce();
        person2.introduce();
    }
}
