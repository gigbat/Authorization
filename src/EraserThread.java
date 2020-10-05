import java.io.*;

class EraserThread implements Runnable, EraserImpl {
    private boolean stop;

    /**
     *@param prompt displayed to the user
     */
    public EraserThread(String prompt) {
        System.out.print(prompt);
    }

    /**
     * Begin masking...display asterisks (*)
     */
    public void run () {
        stop = true;
        while (stop) {
            System.out.print("\010");
            try {
                Thread.currentThread().sleep(1);
            } catch(InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public void stopMasking() {
        this.stop = false;
    }
}