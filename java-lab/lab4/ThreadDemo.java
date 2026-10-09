// 5. Write a java program to create a thread by extending the Thread
// class. Override run() and start the thread.

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " | Count: " + i);
            try {
                Thread.sleep(500); // pause for 500ms between prints
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        System.out.println(Thread.currentThread().getName() + " has finished execution.");
    }
}

public class ThreadDemo {

    public static void main(String[] args) {
        System.out.println("Main thread started: " + Thread.currentThread().getName());

        MyThread thread1 = new MyThread();
        thread1.setName("MyThread-1");

        thread1.start(); // starts the thread, run() executes in a new call stack

        System.out.println("Main thread continues execution...");
    }
}
