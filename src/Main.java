import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] capacities = {1000, 10000, 100000}; // Different capacities to test
        int repetitions = 10000; // Number of repetitions for each test
        Random random = new Random();

        // Test different capacities
        for (int capacity : capacities) {
            System.out.println("Testing with capacity: " + capacity);
            ArrayList<Integer> arrayList = new ArrayList<>(capacity);

            // Fill the ArrayList
            for (int i = 0; i < capacity; i++) {
                arrayList.add(i);
            }

            // Test random access
            long startTime = System.nanoTime();
            for (int i = 0; i < repetitions; i++) {
                int index = random.nextInt(capacity);
                arrayList.get(index);
            }
            long randomAccessTime = System.nanoTime() - startTime;
            System.out.println("Random access time: " + randomAccessTime / 1_000_000.0 + " ms");

            // Test sequential access
            startTime = System.nanoTime();
            for (int i = 0; i < repetitions; i++) {
                for (int j = 0; j < capacity; j++) {
                    arrayList.get(j);
                }
            }
            long sequentialAccessTime = System.nanoTime() - startTime;
            System.out.println("Sequential access time: " + sequentialAccessTime / 1_000_000.0 + " ms");

            System.out.println();
        }
    }
}