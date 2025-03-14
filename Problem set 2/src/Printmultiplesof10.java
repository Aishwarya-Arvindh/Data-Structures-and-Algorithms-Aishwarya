
/*
Write a program to take x and print multiples of x till 1000.
*/
import java.util.Scanner;
public class Printmultiplesof10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = 0; x*i<=1000; i++) {
            System.out.println(x*i);
        }
    }
}