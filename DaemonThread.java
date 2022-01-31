package mtdemo;

public class DaemonThread extends Thread{
    public DaemonThread(String name){
        super(name);                            //Take name from parent class
    }

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()){
            System.out.println("It is a Daemon thread");
        }
        else {
            System.out.println("It is user thread");
        }
    }

    public static void main(String[] args) {
        DaemonThread d1 = new DaemonThread("Thread 1");         //Creating new object
        DaemonThread d2 = new DaemonThread("Thread 2");
        DaemonThread d3 = new DaemonThread("Thread 3");

        //Setting user thread t1 t0 Daemon
        d1.setDaemon(true);

        //Starting first 2 threads
        d1.start();
        d2.start();
        //Setting user thread d3 to Daemon
        d3.setDaemon(true);
        d3.start();
    }
}
