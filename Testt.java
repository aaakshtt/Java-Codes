package mtdemo;

public class Testt implements Runnable {
    public void run(){
        System.out.println("Run method and Thread task");

    }

    public static void main(String[] args) {
        Testt tt = new Testt();
        Thread th  = new Thread(tt);
        th.start();
        Testt tt2 = new Testt();
        tt2.run();
    }
}
