import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;

        while (true) {
            System.out.print("Please, enter any number: ");
            number = scan.nextInt();
            if (number > 1) {
                break;
            } else {
                System.out.println("Wrong entry, try again!");
            }
        }

        for (int i = 0; i <= number; i += 2) {
            System.out.print(i + " ");

            if (i % 20 == 0 ) {
                System.out.println();
            }
        }
    }
}
