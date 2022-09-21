package homework;

import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.Scanner;

public class Continual_Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        String c = "";
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true) {

            System.out.println("param : ");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                arrayList.add(a);
            }else {
                c = scanner.next();
                calculate(arrayList, c);
                arrayList.clear();
            }
        }
    }

    public static void calculate(ArrayList<Integer> arrayList, String c) {
            switch (c) {
                case "+":
                    System.out.println(arrayList + " add 결과 = " + add(arrayList));
                    break;
                case "-":
                    System.out.print(arrayList);
                    System.out.println( " minus 결과 = " + min(arrayList)+"\n");
                    break;
                case "*":
                    System.out.println(arrayList + " mul 결과 = " + mul(arrayList));
                    break;
                case "/":
                    System.out.println(arrayList + " div 결과 = " + div(arrayList));
                    break;
            }
    }

    public static int add(ArrayList<Integer> arrayList) {
       int add_result = arrayList.stream().mapToInt(Integer::intValue).sum();
       return add_result;
    }

    public static int min(ArrayList<Integer> arrayList) {
        int min_result = arrayList.get(0);
        arrayList.remove(0);
        for (int i : arrayList) {
            if (i == 0) {
                min_result = arrayList.get(i);
            }
            min_result -= i;
        }
        return min_result;
    }
//
    public static int mul(ArrayList<Integer> arrayList) {
        OptionalInt mul_result = arrayList.stream().mapToInt(Integer::intValue).reduce((a, b)-> a * b );
        return mul_result.getAsInt();
    }
//
    public static int div(ArrayList<Integer> arrayList) {
        OptionalInt div_result = arrayList.stream().mapToInt(Integer::intValue).reduce((a, b) -> a / b);
        return div_result.getAsInt();
        }
}

