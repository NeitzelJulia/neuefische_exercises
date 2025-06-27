import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein:");
        int number = sc.nextInt();
        System.out.println(numberToString(number));

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("#");
            }
            if (i % 5 == 0) {
                System.out.print("$");
            }
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        sc.nextLine();

        List<String> strings = new ArrayList<>();
        String input;
        while (true) {
            input = sc.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static String numberToString(int number) {
        String[] numbers = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
        return numbers[number-1];
    }
}
