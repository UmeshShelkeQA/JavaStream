package threadUse;

class My_Thread_Test1 implements Runnable{


	public void run() {
		System.out.println("Thread is under Running...");
		for(int i= 1; i<=10; i++) {
			System.out.println("My_Thread_Test1 i = " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
	}	
}
class My_Thread_Test2 implements Runnable{


	public void run() {
		System.out.println("Thread is under Running...");
		for(int i= 1; i<=10; i++) {
			System.out.println("My_Thread_Test2 i = " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
	}	
}

public class ThreadClass {

	public static void main(String[] args) {
		My_Thread_Test1 threadObject1 = new My_Thread_Test1();
		My_Thread_Test1 threadObject2 = new My_Thread_Test1();

		Thread thread1 = new Thread(threadObject1);
		Thread thread2 = new Thread(threadObject2);

		System.out.println("Thread about to start...");
		thread1.start();
		thread2.start();

		//	using lambda expression
		Runnable rn = () ->{ 
			for(int i= 1; i<=10; i++) {
				System.out.println("Runnable Interface Using Lambda Expression i = " + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) { e.printStackTrace(); }
			} 
		};
		//starting Thread of lambda expression
		System.out.println("Thread of lambda expression to start...");
		new Thread(rn).start();
	}
}
