public class Main implements Runnable {

    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        thread.isAlive();
        System.out.println("this is not not a thread");
    }

    public void run() {
        System.out.println("this is in a thread");
    }
}