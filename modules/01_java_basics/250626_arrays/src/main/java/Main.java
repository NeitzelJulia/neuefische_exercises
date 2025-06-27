public class Main {
    public static void main(String[] args) {
        // Array mit Namen
        String[] names = {"Florian", "Martin", "Dominic", "Sara"};

        // Array mit Zahlen
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // alle Zahlen im Array ausgeben
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();

        // größte Zahl im Array ausgeben
        int biggestNumber = numbers[0];
        for(int number : numbers){
            if (biggestNumber < number) {
                biggestNumber = number;
            }
        }
        System.out.println(biggestNumber);

        // zweites Array mit Zahlen
        int[] numbers2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int[] numbers3 = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers3[i] = numbers[i] + numbers2[i];
        }
        for(int number : numbers3){
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
