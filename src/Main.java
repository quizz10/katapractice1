import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        hello(sc.nextLine());
        System.out.println("Give me a number!");
        int number = sc.nextInt();
        even_or_odd(number);
    }

    private static void even_or_odd(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

//    public static void hello(String name) {
//        System.out.println("Hello " + name);
//    }

}
