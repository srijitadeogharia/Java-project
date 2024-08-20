public class StarPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the top half of the pattern

        // Top half of the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half of the pattern
        for (int i = 1; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
