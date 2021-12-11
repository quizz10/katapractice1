import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hello(sc.nextLine());
    }

    public static void hello(String name) {
        System.out.println("Hello " + name);
    }

}
