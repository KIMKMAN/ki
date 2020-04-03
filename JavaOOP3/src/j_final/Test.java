package j_final;

 final class Parent{ // 부모클래스에 final을 작성하면 오류가 생김
	 final String field = "부모님꺼";
	 final public void jib (){
	  System.out.println("부모님이 만드신거");
	 }
	} 
class Child extends Parent{
	
	Child(){// 멤버변수는 다이렉트로 계산
//		super.field = "내꺼";
	}
//	public void jib (){
//		System.out.println("물려받아서 탕진한집");
//	}
}

public class Test {
	 public static void main(String[] args) {
		 Child p = new Child();
		  System.out.println(p.field);
		  p.jib();
	 }
	}
