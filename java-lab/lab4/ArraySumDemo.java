// 8. Write a program that sums all elements of a large array(size 1000)
// using 4 threads. Each thread sums a portion of the array, and the
// main thread combines the results. Use join() to wait for threads.

class SumThread extends Thread {

    private int[] array;
    private int startIndex;
    private int endIndex; // exclusive
    private long partialSum; // stores this thread's result

    public SumThread(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        long sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum += array[i];
        }
        partialSum = sum;
        System.out.println(getName() + " summed indices [" + startIndex + ", " + endIndex + ") = " + partialSum);
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class ArraySumDemo {

    public static void main(String[] args) throws InterruptedException {
        final int SIZE = 1000;
        final int NUM_THREADS = 4;
        int[] array = new int[SIZE];

        // Fill array with values 1 to 1000
        for (int i = 0; i < SIZE; i++) {
            array[i] = i + 1;
        }

        int chunkSize = SIZE / NUM_THREADS; // 250 elements per thread
        SumThread[] threads = new SumThread[NUM_THREADS];

        // Create and start each thread on its portion of the array
        for (int i = 0; i < NUM_THREADS; i++) {
            int start = i * chunkSize;
            // Last thread takes any remaining elements (handles non-divisible sizes too)
            int end = (i == NUM_THREADS - 1) ? SIZE : start + chunkSize;

            threads[i] = new SumThread(array, start, end);
            threads[i].setName("Thread-" + (i + 1));
            threads[i].start();
        }

        // Wait for all threads to finish before combining results
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i].join();
        }

        // Combine partial sums from all threads
        long totalSum = 0;
        for (int i = 0; i < NUM_THREADS; i++) {
            totalSum += threads[i].getPartialSum();
        }

        System.out.println("\nTotal sum of array (computed by threads): " + totalSum);

        // Verification using simple sequential sum
        long expectedSum = 0;
        for (int value : array) {
            expectedSum += value;
        }
        System.out.println("Expected sum (verified sequentially): " + expectedSum);
    }
}
