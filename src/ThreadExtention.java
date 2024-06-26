public class ThreadExtention {
    public static class MyThread extends Thread{
        public void run(){
            System.out.println("Running");
            System.out.println("Stopped");
        }

    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
