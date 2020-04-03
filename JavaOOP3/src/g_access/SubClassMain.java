package g_access;

import g_access.sub.Access;


//3. 다른 패키지이지만 상속 관계라면
public class SubClassMain  extends Access //상속 할 때 extends를 붙여주고 클래스명 // java에서는 하나만 클래스 상속된다.
{
	public static void main(String[] args) 
	{
		// 자식 클래스로 객체를 생성해야 한다.
		SubClassMain me = new SubClassMain();
		//me.a = "프라이빗 변경"; // 해당되는 클래스만 적용됨
		me.b = "퍼블릭 변경"; // 다른 패키지에서도 적용됨
		me.c = "프로텍티트 변경"; // 다른 패키지에서도 적용가능하지만 특별한경우만 적용(상속 관계)
		//me.d = "디폴트 변경"; // 동일한 패키지만 적용됨
	
		me.output();
	}
}
