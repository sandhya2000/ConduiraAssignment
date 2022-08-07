package myFirstPro;

public class Task2 extends Thread{
	public void run()
	{
		System.out.println("Thread created, Name of the thread is:");
	}
	
	public static void main(String[] args) {
		Task2 obj= new Task2();
		System.out.println(obj.getName());
		obj.start();
		
	}

}
