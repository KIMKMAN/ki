package a_basic;

public class Student { // 이렇게 서로다른 변수와 함수등을 한 데 묶은 것을  클래스라고 한다.
	// 멤버 변수(member field )
	String name;
	int kor, eng, math;
	private int total; //private 선언 아무도 접근 안됨 변수가 올수없다 값변경 차단
	private double avg; // private 선언시 외부 접근 안됨
	// 멤버함수 (member method / member function)
	int calTotal() {
		total = kor + eng + math;
		return total;
	}



	double calAve() {
		avg = (double) total / 3;
		return avg;
	}

}
