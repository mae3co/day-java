package homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Continual_Calculate {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int a = 0;
            String c = "";
            ArrayList arrayList = new ArrayList<>();
            System.out.println("param : ");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                arrayList.add(a);
            }else {
                c = scanner.next();

                calculate(arrayList, c);
            }
        }
    }

    public static void calculate(ArrayList arrayList, String c) {
            int result = 0;
            switch (c) {
                case "+":
                    result = add(arrayList);
                    break;
//                case "-":
//                    result = min(a, b);
//                    break;
//                case "*":
//                    result = mul(a, b);
//                    break;
//                case "/":
//                    if (b == 0) {
//                        result = 0;
//                        break;
//                    }
//                    result = div(a, b);
//                    break;
            }
            System.out.println("결과 : " + result);
    }

    public static int add(ArrayList arrayList) {
        for (integer item : arrayList){
            return item;
        }
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

