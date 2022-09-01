package homework;

import java.util.Scanner;

public abstract class ManyParam {

    public static void main(String[] args) {


        System.out.println("Enter your name : ");
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        args = a.split(" ");

        System.out.println(args[0]);
            for (String i :
                    args) {
                System.out.println("Hello " + i);
            }
    }
}
