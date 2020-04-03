package g_access;

import g_access.sub.Access; // 패키지 가지고 오기 위해  import 패키지명을 가져올 수있다.

// 2. 다른 패키지에서 확인
class Main
{
	public static void main(String[] args) 
	{
		Access me = new Access();
		me.a = "프라이빗 변경"; 
		me.b = "퍼블릭 변경"; // 다른 패키지에서도 적용됨
		me.c = "프로텍티트 변경"; // 다른 패키지에도 적용가능하지만 특별한경우만 적용 (상속 관계)
		me.d = "디폴트 변경"; // 동일한 패키지만 적용됨
		
		me.output();
	}
}

