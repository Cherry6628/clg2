package threadpri;

class Numbers implements Runnable {
    Thread t;

    public Numbers(String name, int p) {
        t = new Thread(this, name);
        t.setPriority(p);
        t.start();
    }

    public void run() {
        System.out.println("\n" + t + " start");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println(t + " exiting");
    }
}

class SquareRoot implements Runnable {
    Thread t;

    public SquareRoot(String name, int p) {
        t = new Thread(this, name);
        t.setPriority(p);
        t.start();
    }

    public void run() {
        System.out.println("\n" + t + " start");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * i);
        }
        System.out.println(t + " exiting");
    }
}

public class ThreadPri {
    public static void main(String args[]) {
        new Numbers("Numbers HIGH PRIORITY", Thread.MAX_PRIORITY);
        new SquareRoot("Square MIDDLE PRIORITY", Thread.NORM_PRIORITY);
        Thread t = Thread.currentThread();
        t.setPriority(Thread.MIN_PRIORITY);
        t.setName("Cube LOW PRIORITY");
        System.out.println("\n" + t + " start");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * i * i);
        }
        System.out.println(t + " exiting");
    }
}
