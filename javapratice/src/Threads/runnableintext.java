package Threads;

public class runnableintext {
    public static void main(String[] args) {
        runnableint ri = new runnableint();
        Thread t = new Thread();
        t.start();
    }
    
}
