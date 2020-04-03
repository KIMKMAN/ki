package f_innerclass;

class Outer
{
	class Inner // 멤버변수처럼 취급 Class를 //클래스안에 클래스도 멤버변수면 static 적용 할 수 있다.
	{
		void naJabara(){
			System.out.println("잡아보슈~~");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) 
	{
		Outer o =  new Outer();
		Outer.Inner in = o.new Inner(); //$하나의 class Inner class에 많이 사용
		//in.naJabara();
		//Outer.Inner in = new Outer.Inner(); //$하나의 class Inner class에 많이 사용
		in.naJabara();
		//Outer.Inner.naJabara();
	}
}


