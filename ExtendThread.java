package test;
import java.lang.*;

public class ExtendThread extends Thread {  // Change implements to extends
	
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ExtendThread t1 = new ExtendThread(); // Use correct class name
        t1.start();
    }
}

