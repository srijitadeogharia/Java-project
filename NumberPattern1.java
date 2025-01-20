public class NumberPattern1 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            // Print numbers with spaces
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
