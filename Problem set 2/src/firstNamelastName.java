import java.util.Scanner;

public class  firstNamelastName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstname = in.next();
        String lastname = in.next();
        int x = in.nextInt();

        for (int i = 0; i <= x; i++) {
            System.out.println(firstname +" "+ lastname);
        }
    }

}
