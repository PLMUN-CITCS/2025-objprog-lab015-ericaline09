public class VariableScope {
    // Global variable declared outside any method
    static int globalCount = 100;

    public static void main(String[] args) {
        // Print the globalCount variable from the main method
        System.out.println("Global Count (from main): " + globalCount);

        // Call the showScope method
        showScope();
    }

    // Method to demonstrate the scope of variables
    public static void showScope() {
        // Local variable declared inside showScope method
        int localCount = 50;

        // Print the globalCount variable from the showScope method
        System.out.println("Global Count (from showScope): " + globalCount);

        // Print the localCount variable from the showScope method
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
