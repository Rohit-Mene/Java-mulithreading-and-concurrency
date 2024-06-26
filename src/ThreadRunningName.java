public class ThreadRunningName {

    public static void main(String[] args) {
        Runnable runnable = () ->{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " running");
        };

        Thread thread = new Thread(runnable,"The thread");
        thread.start();

        Thread thread2 = new Thread(runnable,"The thread 2");
        thread2.start();
    }
}
//You are not guaranteed in which order the threads will be executed