// Aaron Prince Anu

class factors {
    public static void main(String[] args) {
        
        while (true) {
        // ask for n 
            System.out.println("\nWhat is your n number (-1 to exit)?");
            int n = In.getInt();
            System.out.println(); // separator for numbers

            if (n == -1) {
                System.out.println("Exiting...\n");
                break;
            } else {
                System.out.println("Output:");
                leastFactor(n);
            }
        }
    }

    public static int leastFactor (int n) {

        // print the number of 2s 
        while (n % 2 == 0) {
            System.out.println(2 + " ");
            n /= 2;
        }

        // skip n element
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n /= i;
            }
        }

        // if n is a prime > 2
        if (n > 2) {
            System.out.println(n);
        }
        return n;
    }
}