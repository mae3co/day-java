package homework;

public abstract class ManyParam {

    public static void main(String[] args) {

        if (args.length > 0) {
            for (String i: args
                    ) {
                System.out.println("Hello "+i);
            }

        } else {
            System.out.println("인자값이 없어요.");
        }
    }

}
