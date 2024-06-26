public class ThreadImplementRunnable {

    public static class MyRunnable implements Runnable{
        @Override
        public void run(){
            System.out.println("Running");
            System.out.println("Stop");
        }
    }

    public static void main(String[] args) {
     Thread thread = new Thread(new MyRunnable());
     thread.start();
    }
}
