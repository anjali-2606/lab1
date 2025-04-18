package test;
import java.lang.*;

class simple1 extends Thread{
	public void run() {
		System.out.println("Task1");
	}
}
class simple2 extends Thread{
	public void run() {
		System.out.println("Task2");
	}
}


public class MultiToMulti {

	public static void main(String[] args){
		simple2 t1 = new simple2();
		t1.start();
		simple1 t2 = new simple1();
		t2.start();

	}

}
