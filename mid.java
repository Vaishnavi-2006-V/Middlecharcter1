import java.util.Scanner;

public class middle {

    public static String findMiddle(String str) {
        int len = str.length();
        if (len % 2 == 0) {
            return str.substring(len/2 - 1, len/2 + 1);
        } else {
            return String.valueOf(str.charAt(len/2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.nextLine();

        System.out.println("Middle Character(s): " + findMiddle(input));
        sc.close();
    }
}
