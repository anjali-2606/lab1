package test;
import java.lang.*;

public class implementationThread implements Runnable { // Fixed class name
	
    public void run() {
        System.out.println("Thread is running using Runnable interface");
    }

    public static void main(String[] args) {
        implementationThread t1 = new implementationThread(); // Fixed class name
        Thread th = new Thread(t1);
        th.start();
    }
}

