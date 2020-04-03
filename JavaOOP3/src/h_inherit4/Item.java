package h_inherit4;
/*
 * this : 자신 객체를 지칭하는 래퍼런스
 * super : 부모 객체를 지칭하는  러펀런스
 * -------------------------------
 * this() 다른 생성자함수를 호출 할 때
 * super() 부모 생성자함수를 호출 할 때
 * 
 */

public abstract class Item {

	protected String num, title;
	
	public Item(){
		System.out.println("Item 기본 생성자 ");
	}
	public Item(String num, String title){
		this.num = num;
		this.title  = title;
		
		
		
		System.out.println("Item 인자 생성자");
	}

	// private < default < protected < public
	public abstract void output(); //추상 메소드는 반드시 오버라이딩을 해줘야한다
	// 완성하려면 이름이 똑같은 함수를 써야한다 오버라이딩
}
