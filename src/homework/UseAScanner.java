package homework;

import java.util.Scanner;

public class UseAScanner {

    public static void main(String[] args) {

        System.out.println("Enter your name : ");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

        String a = scanner.next();

            if (args.length > 0) {
                for (String i : args
                ) {
                    System.out.println("Hello " + i);
                }

            } else {
                System.out.println("인자값이 없어요.");

            }
        }
    }


}
