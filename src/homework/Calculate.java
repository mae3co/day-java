package homework;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 param : ");
            int a = scanner.nextInt();
            System.out.println("2 param : ");
            int b = scanner.nextInt();

            System.out.println("Choose one \n 1 : add \n 2 : min  \n 3 : mul \n 4 : div");
            int c = scanner.nextInt();
            int result = 0;
            String operator = null;
            switch (c) {

                case 1:
                    result = a + b;
                    operator = "+";
                    break;
                case 2:
                    result = a - b;
                    operator = "-";
                    break;
                case 3:
                    result = a * b;
                    operator = "*";
                    break;
                case 4:
                    if (b == 0) {
                        result = 0;
                        break;
                    }
                    result = a / b;
                    operator = "/";
                    break;
            }

            System.out.println("결과 = " + a + " " + operator + " " + b + " = " + result);

        }while (true);
    }
}

