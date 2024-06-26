public class ThreadLamda {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Running");
            System.out.println("Stop");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
