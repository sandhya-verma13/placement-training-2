import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < rows; i++) {            
            for (int j = 0; j < rows - i; j++) {
                System.out.print("  "); 
            }

            int number = 1; 
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number); 
                number = number * (i - j) / (j + 1); 
            }
            System.out.println(); 
        }
    }
}
