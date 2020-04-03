package b_encapsulation;

public class CalculatorExpr { //여기는 메인함수가 없음
								// 그림을 보고 클래스를 만듬 + 는 퍼블릭
		
		private int num1; // 클래스다이어그램에서 -의 뜻은 private
		private int num2;
		
		
		//메소드 앞에 +가 붙어있다고 가정.
	public int getAddition() {
		return num1+num2;
	}
	public int getSubtraction() {
		return num1-num2;
	}
	public int getMultiplication() {
		return num1*num2;
	}
	public double getDivision() {
		return (double)num1/num2; //둘중에 하나만 더블이어야함
	}
	// setters 와 getters를 만든 것
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}


}	

