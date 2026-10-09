// 7. Write a complete procedure-consumer program using inter-thread
// communication. The procedure produces numbers 1 to 10, the
// consumer consumes them. Use wait() and notify() to ensure proper
// co-ordination.

class SharedBuffer {

    private int number;
    private boolean available = false; // flag: is there a number ready to consume?

    // Producer calls this to put a number in the buffer
    public synchronized void produce(int value) {
        // Wait if buffer already has an unconsumed number
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        number = value;
        available = true;
        System.out.println("Produced: " + value);

        notify(); // wake up the consumer waiting for a number
    }

    // Consumer calls this to take a number from the buffer
    public synchronized int consume() {
        // Wait if no number is available yet
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        available = false;
        System.out.println("Consumed: " + number);

        notify(); // wake up the producer waiting to produce next number
        return number;
    }
}

class Producer extends Thread {

    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(200); // simulate time taken to produce
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer extends Thread {

    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.consume();
            try {
                Thread.sleep(300); // simulate time taken to consume
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
