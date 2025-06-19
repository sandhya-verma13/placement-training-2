import java.util.Scanner;

public class TrianglePattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the number of rows for the triangle: ");
        int numRows = input.nextInt(); 
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); 
            }
            System.out.println();
        }
        input.close(); 
    }
}
