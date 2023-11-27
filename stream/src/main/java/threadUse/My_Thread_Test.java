package threadUse;

class SampleThread1 extends Thread{

	public void run() {
		System.out.println("Thread is under Running...");
		for(int i= 1; i<=10; i++) {
			System.out.println("SampleThread1 i = " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
	}	
}
class SampleThread2 extends Thread{

	public void run() {
		System.out.println("Thread is under Running...");
		for(int i= 1; i<=10; i++) {
			System.out.println("SampleThread2 i = " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
	}	
}
public class My_Thread_Test {

	public static void main(String[] args) {
		SampleThread1 t1 = new SampleThread1();
		System.out.println("Thread1 about to start...");
		t1.start();
		
		SampleThread2 t2 = new SampleThread2();
		System.out.println("Thread2 about to start...");
		t2.start();
	}
}
