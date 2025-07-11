import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = List.of(42, 17, 8, 99, 123, 256);

        List<Integer> processed = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sorted()
                .toList();

        System.out.println("Verarbeitete Zahlen:");
        processed.forEach(System.out::println);

        int sum = processed.stream()
                .reduce(0, Integer::sum);
        System.out.println("Summe aller verarbeiteten Zahlen: " + sum);
        System.out.println();



        //Bonus
        String resourceName = "students.csv";
        URL res = Main.class.getClassLoader().getResource(resourceName);
        if (res == null) {
            throw new IllegalArgumentException(resourceName + " not found!");
        }
        Path csvPath = Paths.get(res.toURI());

        Set<Student> students = Files.lines(csvPath)
                .skip(1)
                .map(String::trim)
                .filter(line -> !line.isEmpty())
                .map(line -> line.split(","))
                .filter(tokens -> tokens.length == 4)
                .map(tokens -> new Student(
                        tokens[0],
                        tokens[1],
                        tokens[2],
                        Integer.parseInt(tokens[3])
                ))
                .collect(Collectors.toSet());

        students.forEach(System.out::println);
    }
}
