package SuriTesting;

class Counter {
    // Static Variable
    static int count = 0;

    // Instance Variable
    int instanceCount = 0;

    void increment() {
        // Local Variable
        int localCount = 0;

        count++;          // Shared
        instanceCount++;  // Unique to object
        localCount++;     // Reset every time method is called

        System.out.println("Local: " + localCount);
    }
}

public class CheckVaiable {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.increment();
        c1.increment();
        c2.increment();

        System.out.println("--- Final Results ---");
        System.out.println("c1 Instance Variable: " + c1.instanceCount);
        System.out.println("Static Variable (Class): " + Counter.count);
    }
}