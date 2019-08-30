public class RunnableThread implements Runnable {

    int count=0;
    @Override
    public void run() {
        System.out.println("Thread starting ....");

        while (count<5){
            try {
                Thread.sleep(600);
                System.out.println("In Thread, count is " +count);
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Thread interrupted ....");
            }
        }
        System.out.println("Thread terminated ....");
    }

    public static void main(String[] args) {
        RunnableThread runnableThread = new RunnableThread();
        Thread thread = new Thread(runnableThread);
        thread.start();

        while (runnableThread.count != 5){
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
