package homework;

import java.util.Scanner;

public class UseAWhileScanner {

    public static void main(String[] args) {

        System.out.println("Enter your name : ");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String a = scanner.next();
            System.out.println("Hello " + a);

        }
    }
}
