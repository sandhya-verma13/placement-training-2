import java.util.Scanner; // Import the Scanner class for user input

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int num = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        scanner.close();
    }
}
