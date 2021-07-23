import java.util.Scanner;

public class SIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        /**
         * Solution 1
         */
        if (N >= 2 && N <= 5) {
            if (N % 2 == 0) {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        } else if (N >= 6 && N <= 20) {
            if (N % 2 == 0) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        } else {
            if (N % 2 == 0) {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        }

        /**
         * Solution 2
         */
        if (N % 2 == 1) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && (N >= 2 && N <= 5)) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && (N >= 6 && N <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        scanner.close();
    }

}
