import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }

    public static String revertString(String string){
        return new StringBuilder(string).reverse().toString();
    }

    public static int[] sortArray(int[] unsortedArray){
        int[] sortedArray = unsortedArray.clone();
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    public static int[] bubbleSort(int[] array){
        if (array == null || array.length < 2) return array;
        for (int n = array.length; n > 1; n--){
            boolean isSwap = false;
            for (int i = 0; i < n - 1; i++){
                if (array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) return array;
        }
        return array;
    }

    public static String[] splitString(String string){
        return string.split(",");
    }

    public static int checksum(Integer number){
        int checksum = 0;
        if (number < 0) number = number * -1;
        while (number != 0){
            checksum += number % 10;
            number = number / 10;
        }
        return checksum;
    }

    public static String romanNumber(int number){
        if (number < 1 || number > 100){
            throw new IllegalArgumentException("only numbers between 1 and 100");
        }

        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String result = "";

        for (int i = 0; i < values.length; i++){
            while ( number >= values[i]){
                result += roman[i];
                number -= values[i];
            }
        }
        return result;
    }
}
