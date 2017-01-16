class Programa implements Runnable {

	private int id;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("Programa " + id + " valor: " + i);
		}
	}
}

public class TesteThreads {
	public static void main(String[] args) {

		Programa p1 = new Programa();
		p1.setId(1);

		Thread t1 = new Thread(p1);
		t1.start();

		Programa p2 = new Programa();
		p2.setId(2);

		Thread t2 = new Thread(p2);
		t2.start();

	}
}
