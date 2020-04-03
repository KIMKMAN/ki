package thread.basic;

class Count{
	int i;

	void increment() { // 동기화 synchronized 대기상태로 만들어지고 순차적으로 만들어지고 반드시 값은 나온다. 하지만 너무 느리다
		synchronized(this) {// synchronized 반드시 객체를 줘야한다. this 락을 걸기위해서..synchronized
		i++;
		}
		// 다른 코딩이 많은 경우
		
	}
}

class ThreadCount extends Thread {
	Count cnt;

	ThreadCount(Count cnt) {
		this.cnt = cnt;
	}

	public void run() {
		for (int i = 0; i < 100000000; i++) {
			cnt.increment();
		}
	}
}

public class Ex5_SyuchTest {
	public static void main(String[] args) {
		Count cnt = new Count();
		ThreadCount tc1 = new ThreadCount(cnt);
		tc1.start();
		ThreadCount tc2 = new ThreadCount(cnt);
		tc2.start();
		try {
		tc1.join();
		tc2.join();
		}catch(Exception ex){}
	
		System.out.println("i의 결과:" + cnt.i);
	}
}
