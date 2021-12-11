import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        hello(sc.nextLine());
//        System.out.println("Give me a number!");
//        int number = sc.nextInt();
//        even_or_odd(number);
//        System.out.println("How big a square do you want?");
//        square(sc.nextInt());
//        triangle(sc.nextInt());
        findTheLongestString(new String[]{"Bajsmacka", "Kebabapa" ,"Fittkinesåsnehoransgurglande kuvert", "åsnekuk", "nationalencyklopedin"});
    }

    private static void findTheLongestString(String[] longestString) {
        String longest = Arrays.stream(longestString).max(Comparator.comparingInt(String::length)).get();
        System.out.println(longest);
        int index = 0;
        int elementLength = longestString[0].length();
        for(int i=1; i < longestString.length; i++) {
            if(longestString[i].length() > elementLength) {
                index = i;
                elementLength = longestString[i].length();
            }
        }
        System.out.println(longestString[index]);
    }

//    private static void triangle(int triangleSize) {
//        for (int i = 1; i <= triangleSize; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("#");
//
//            }
//            System.out.println();
//        }
//    }

//    private static void square(int squareSize) {
//        for (int i = 0; i < squareSize; i++) {
//            for (int j = 0; j < squareSize; j++) {
//                System.out.print("#");
//            }
//            System.out.println();
//        }
//    }

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
