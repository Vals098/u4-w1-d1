import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First string:");
        String str1 = scanner.nextLine();

        System.out.println("Second string:");
        String str2 = scanner.nextLine();

        System.out.println("Third string:");
        String str3 = scanner.nextLine();

        String concatInOrder = str1 + str2 + str3;
        System.out.println(concatInOrder);

        String concatInInverseOrder = str3 + str2 + str1;
        System.out.println(concatInInverseOrder);
    }

}
