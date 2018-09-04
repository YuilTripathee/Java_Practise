class Test {
    public static void main(String args[]) {
        // Demonstrating break statement
        System.out.println("Demonstrating 'break' statement:");
        System.out.println("--------------------------------");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // terminates the loop as counter reaches 3
            }
            System.out.println("Loop count : " + i);
        }

        // Demonstrating continue statement
        System.out.println("\nDemonstrating 'continue' statement:");
        System.out.println("-----------------------------------");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                continue; // skip the task and continue the loop as counter reaches 3
            }
            System.out.println("Loop count : " + j);
        }
        // Demonstrating return statement
        System.out.println("\nDemonstrating 'return' statement:");
        System.out.println("---------------------------------");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                return; // work as 'break' statement, usually applied to terminate from modules
            }
            System.out.println("Loop count : " + k);
        }
    }
}