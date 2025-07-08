import java.util.List;

public record Zoo(List<Animal> animals) {

    public double totalFoodNeed() {
        double sum = 0;
        for (Animal animal : animals) {
            sum += animal.species().foodNeed();
        }
        return sum;
    }
}
