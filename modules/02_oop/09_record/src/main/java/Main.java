import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Species owl = new Species("Owl", 0.15);
        Owner owner1 = new Owner("Harry Potter", 17, "4 Privet Drive, Little Whinging, Surrey");
        Animal animal1 = new Animal(1,"Hedwig", owl , 3, owner1);

        Species dog = new Species("Dog", 0.3);
        Owner owner2 = new Owner("Shaggy", 19, "123 Mystery Lane, Coolsville, California");
        Animal animal2 = new Animal(2, "Scooby-Doo", dog, 7, owner2);

        Species chicken = new Species("Chicken", 0.1);
        Owner owner3 = new Owner("Moana", 16, "Motunui, Südsee");
        Animal animal3 = new Animal(3, "Heihei", chicken, 1, owner3);

        Owner owner4 = new Owner("Roger Radcliff", 30, "London, UK");
        Animal animal4 = new Animal(4, "Pongo", dog, 3, owner4);

        Animal animal5 = new Animal(2, "Scooby-Doo", dog, 7, owner2);

        System.out.println(animal1);
        System.out.println(animal2.equals(animal5));

        Zoo zoo = new Zoo(new ArrayList<>(List.of(animal1, animal2, animal3, animal4)));
        System.out.println(zoo.totalFoodNeed());
    }

}
