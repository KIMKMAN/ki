package thread.basic;

public class Ex2_RunnalbeTest {

	public static void main(String[] args) {
		MakeCar2 mc1 = new MakeCar2("차틀만들기");
		Thread t1 = new Thread(mc1);
		t1.start();

		// Thread t2; //축약형
		new Thread(new MakeCar2("엔진부착")).start();
	}

}

class MakeCar2 implements Runnable {
	String work;

	MakeCar2(String work) {
		this.work = work;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(work + "작업중");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

}