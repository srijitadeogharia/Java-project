public class Prime {
    public static void main(String[] args) {
        int low = 20, high = 50;

        while (low < high) {
            boolean flag = false;

            for (int i = 2; i <= low / 2; ++i) {
                // Check if the number is nonprime
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }

            // Print the prime number
            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");
            
            ++low;
        }
    }
}

