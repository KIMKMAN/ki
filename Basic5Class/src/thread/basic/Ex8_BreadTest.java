package thread.basic;

class Bread {
	String bread;

	// ##
	boolean isCheck = false;

	public void setBread(String bread) {
		this.bread = bread;
		// ##
		isCheck = true;
		synchronized (bread) {
			notifyAll();
		}
	}

	public String getBread() {
		// ##
		if (isCheck == false) {
			try {
				synchronized (bread) {
					wait();
				}
			} catch (Exception ex) {
			}

		}
		return bread;
	}
}

class Baker extends Thread // 빵패
{
	Bread bbang;

	Baker(Bread bbang) {
		this.bbang = bbang;
	}

	public void run() {
		bbang.setBread("진열된 완성된 맛있는 빵");
	}
}

class Customer extends Thread // 빵을사감
{
	Bread bbang;

	Customer(Bread bbang) {
		this.bbang = bbang;
	}

	public void run() {
		System.out.println("빵을 사감 : " + bbang.getBread());
	}
}

class Ex8_BreadTest {
	public static void main(String[] args) {
		Bread bread = new Bread();

		Baker baker = new Baker(bread);
		Customer customer = new Customer(bread);
		customer.start();
		baker.start();

		try {
			customer.join();
			baker.join();
		} catch (Exception ex) {
		}

	}
}
