package homework;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 param : ");
            int a = scanner.nextInt();
            System.out.println("2 param : ");
            int b = scanner.nextInt();
            System.out.println("Choose one : ");
            String c = scanner.next();
            calculate(a, b, c);
        }
    }

    public static void calculate(int a, int b, String c) {
            int result = 0;
            switch (c) {
                case "+":
                    result = add(a, b);
                    break;
                case "-":
                    result = min(a, b);
                    break;
                case "*":
                    result = mul(a, b);
                    break;
                case "/":
                    if (b == 0) {
                        result = 0;
                        break;
                    }
                    result = div(a, b);
                    break;
            }
            System.out.println("결과 : " + a + " " + c + " " + b + " = " + result);
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int min(int a, int b) {
        return a-b;
    }

    public static int mul(int a, int b) {
        return a*b;
    }

    public static int div(int a, int b) {
        return a/b;
    }
}

