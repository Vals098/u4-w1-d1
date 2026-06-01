import java.util.Arrays;

public class Es1 {
    public static void main(String[] args) {
        int result = multiply(4, 5);
        System.out.println(result);

        String result2 = concat("Hi", 5);
        System.out.println(result2);

        String[] words = {"Sono", "Valeria", "oggi", "sono", "felice"};
        String[] result3 = addInArray(words, "e");
        System.out.println(Arrays.toString(result3));
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;

    }

    public static String concat(String text, int number) {
        return text + number;
    }

    public static String[] addInArray(String[] array, String newString) {
        String[] newArray = new String[6];
        newArray[0] = array[0];
        newArray[1] = array[1];
        newArray[2] = newString;
        newArray[3] = array[2];
        newArray[4] = array[3];
        newArray[5] = array[4];

        return newArray;
    }


}
