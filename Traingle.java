public class Traingle {
    public static void main(String[] args) {

        for (int i = 1; i <=7; i++) {
            // Print leading spaces
            for (int k=1; k < i; k++) {
                System.out.print(" ");
            }
            // Print stars with spaces
            for (int j = 7; j >= i; j--) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }

        for (int i = 1; i <=7; i++) {
            // Print leading spaces
            for (int j = 1; j < 7 - i ; j++) {
                System.out.print(" ");
            }
            // Print stars with spaces
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}

