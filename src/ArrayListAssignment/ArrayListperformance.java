package ArrayListAssignment;

/* Write a program that compares the performance of different operations on ArrayLists with different capacities and data access patterns (random access vs. sequential access)*/


import java.util.ArrayList;
import java.util.Random;

public class ArrayListperformance {
    public static void main(String[] args) {
        int maxSize = 1000000;
        int numTrials = 1000;
        Random random = new Random();

        // Random Access Test
        System.out.println("Random Access Test:");
        for (int capacity = 1000; capacity <= maxSize; capacity *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>(capacity);
            // Fill the ArrayList with random values
            for (int i = 0; i < capacity; i++) {
                arrayList.add(random.nextInt());
            }
            long startTime = System.currentTimeMillis();
            // Perform random access operations
            for (int i = 0; i < numTrials; i++) {
                arrayList.get(random.nextInt(capacity));
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Capacity: " + capacity + ", Time: " + (endTime - startTime) + " ms");
        }

        System.out.println("\nSequential Access Test:");
        for (int capacity = 1000; capacity <= maxSize; capacity *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>(capacity);
            // Fill the ArrayList with random values
            for (int i = 0; i < capacity; i++) {
                arrayList.add(random.nextInt());
            }
            long startTime = System.currentTimeMillis();
            // Perform sequential access operations
            for (int i = 0; i < numTrials; i++) {
                for (int j = 0; j < capacity; j++) {
                    arrayList.get(j);
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Capacity: " + capacity + ", Time: " + (endTime - startTime) + " ms");
        }

    }
}
