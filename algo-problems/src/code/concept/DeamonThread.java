package code.concept;

public class DeamonThread extends Thread {

	public DeamonThread() {
		setDaemon(true);
	}

	@Override
	public void run() {
		System.out.println("This is deamon thread");
	}

	public static void main(String[] args) throws InterruptedException {
		DeamonThread deamonThread = new DeamonThread();
		deamonThread.start();
		deamonThread.join();
	}
}
