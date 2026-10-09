// 6. Write a program that sets three threads with priorities
// MIN_PRIORITY, NORM_PRIORITY, MAX_PRIORITY and observes
// execution order.

class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " (Priority: " + getPriority() + ") | Count: " + i);
        }
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {
        PriorityThread lowThread = new PriorityThread("Low-Priority-Thread");
        PriorityThread normalThread = new PriorityThread("Normal-Priority-Thread");
        PriorityThread highThread = new PriorityThread("High-Priority-Thread");

        // Assigning priorities
        lowThread.setPriority(Thread.MIN_PRIORITY);       // 1
        normalThread.setPriority(Thread.NORM_PRIORITY);   // 5
        highThread.setPriority(Thread.MAX_PRIORITY);      // 10

        System.out.println("Starting threads with different priorities...\n");

        // Starting all threads
        lowThread.start();
        normalThread.start();
        highThread.start();
    }
}
