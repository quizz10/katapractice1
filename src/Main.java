import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        hello(sc.nextLine());
//        System.out.println("Give me a number!");
//        int number = sc.nextInt();
//        even_or_odd(number);
        System.out.println("How big a square do you want?");
        square(sc.nextInt());
    }

    private static void square(int squareSize) {
        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

//    private static void even_or_odd(int number) {
//        if (number % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
//    }

//    public static void hello(String name) {
//        System.out.println("Hello " + name);
//    }

}
