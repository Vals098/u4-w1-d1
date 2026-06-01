import java.util.Scanner;

public class Es3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input width:");
        int width = Integer.parseInt(scanner.nextLine());

        System.out.println("Input height:");
        int height = Integer.parseInt(scanner.nextLine());


        int result = perimeter(width, height);
        System.out.println("Perimeter:" + result);


    }

    public static int perimeter(int width, int height) {
        return (width + height) * 2;
    }
}
