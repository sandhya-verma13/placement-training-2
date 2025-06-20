import java.util.Scanner; 
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter an integer: "); 
        int number = scanner.nextInt(); 
        int sum = 0; 
        int tempNumber = number; 
        while (tempNumber != 0) {
            int digit = tempNumber % 10; 
            tempNumber /= 10; 
        }
        System.out.println("The sum of the digits is: " + sum); 
        scanner.close(); 
    }
}
