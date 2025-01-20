public class Traingle1 {
    public static void main(String[] args) {
        int n = 7; // Number of rows

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars with spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
