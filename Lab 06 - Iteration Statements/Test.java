class Test {
    public static void main(String args[]) {
        // Demonstrating for loop
        System.out.println("Demonstrating 'for' loop:");
        System.out.println("-------------------------");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Using for loop, iteration count : " + i);
        }

        // Demonstrating while loop
        System.out.println("\nDemonstrating 'while' loop:");
        System.out.println("---------------------------");
        int j = 1;
        while (j <= 5) {
            System.out.println("Using while loop, iteration count : " + j);
            j++;
        }

        // Demonstrating do...while loop
        System.out.println("\nDemonstrating 'do...while' loop:");
        System.out.println("--------------------------------");
        int k = 1;
        do {
            System.out.println("Using do...while loop, iteration count : " + k);
            k++;
        }while (k <= 5);

    }
}