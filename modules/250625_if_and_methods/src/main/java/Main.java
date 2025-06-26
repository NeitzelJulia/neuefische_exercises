public class Main {

    public static void main(String[] args) {

        System.out.println("\nIf-Else Exercise");
        System.out.println("Altersprüfung:");
        int age = 39;
        if (age > 18) {
            System.out.println("Du bist älter als 18");
        } else if ( age == 18) {
            System.out.println("Du bist 18");
        } else {
            System.out.println("Du bist jünger als 18");
        }


        System.out.println("\nNamenslänge:");
        String name = "Julia";
        int length = name.length();
        if(length > 10) {
            System.out.println("Dein Name hat mehr als 10 Zeichen");
        } else if (length == 10) {
            System.out.println("Dein Name hat genau 10 Zeichen");
        } else {
            System.out.println("Dein Name hat weniger als 10 Zeichen");
        }


        System.out.println("\nBonus:");
        System.out.println("gerade oder ungerade:");
        int number = 35;
        if (number % 2 == 0) {
            System.out.println("Die Zahl ist gerade");
        } else {
            System.out.println("Die Zahl ist ungerade");
        }

        System.out.println("\nNote:");
        int grade = 91;
        if (grade >= 90) {
            System.out.println("Note A");
        } else if (grade >= 70) {
            System.out.println("Note B");
        } else if (grade >= 50) {
            System.out.println("Note C");
        } else if (grade >= 20) {
            System.out.println("Note D");
        } else {
            System.out.println("Note F");
        }

        System.out.println("\npositiv oder negativ:");
        int anotherNumber = 0;
        if (anotherNumber < 0) {
            System.out.println(anotherNumber + " ist eine negative Zahl");
        } else if (anotherNumber > 0) {
            System.out.println(anotherNumber + " ist eine positive Zahl");
        } else {
            System.out.println(anotherNumber + " ist weder eine negative noch eine positive Zahl");
        }


        System.out.println("\n\nMethoden");
        System.out.println("Begrüßungsmethode:");
        System.out.println(greeting(name));

        System.out.println("\nEinfache Berechnung:");
        int number1 = 17;
        int number2 = 24;
        System.out.println(add(number1, number2));

        System.out.println("\nZusätzliche Funktionen:");
        System.out.println("add-Methode mit double");
        double number3 = 3.14;
        double number4 = 1.79;
        System.out.println(addDouble(number3, number4));

        System.out.println("\nsubstract-Methode:");
        System.out.println(substract(number1, number2));

        System.out.println("\nmakePositive-Methode:");
        double number5 = -7;
        System.out.println(makePositive(number5));
        System.out.println(makePositive(number1));

        System.out.println("\n\nBonus");
        System.out.println("nur subtrahieren, wenn die 1. Zahl größer ist:");
        if (number1 > number2) {
            System.out.println(substract(number1, number2));
        } else {
            System.out.println(add(number1, number2));
        }

        System.out.println("\nverdopple ungerade Zahlen:");
        System.out.println(doubleOddNumber(number1));
        System.out.println(doubleOddNumber(number2));

        System.out.println("\nauf Palindrom prüfen:");
        String palindrome = "Anna";
        String noPalindrome = "Anne";
        System.out.println(isPalindrome(palindrome));
        System.out.println(isPalindrome(noPalindrome));

    }

    public static String greeting (String name)
    {
        return "Hallo, " + name + "!";
    }

    public static int add (int a, int b)
    {
        return a + b;
    }

    public static double addDouble (double a, double b)
    {
        return a + b;
    }

    public static int substract(int a, int b)
    {
        return a - b;
    }

    public static double makePositive (double a)
    {
        if (a < 0) {
            return a * -1;
        }
        return a;
    }

    public static double doubleOddNumber(double a)
    {
        if (a % 2 != 0) {
            return a * 2;
        }
        return a;
    }

    public static boolean isPalindrome (String string)
    {
        String lowerCaseString = string.toLowerCase();
        String reverseString = new StringBuilder(lowerCaseString).reverse().toString();

        return reverseString.equals(lowerCaseString);
    }
}