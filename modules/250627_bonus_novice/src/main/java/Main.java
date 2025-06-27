import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myName = "Julia";

        for (int i = 1; i <= 5; i++) {
            System.out.println(myName);
        }

        System.out.println("Bitte Zahl eingeben:");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println(isPositivNumber(number1));

        System.out.println("Zahl zum Quadrieren eingeben:");
        int number2 = sc.nextInt();
        System.out.println(square(number2));

        System.out.println("Gib deinen Namen ein:");
        String name = sc.next();
        System.out.println("Hallo " + name);

    }

    public static boolean isPositivNumber(int number) {
        return number > 0;
    }

    public static int square(int number) {
        return number * number;
    }
}
