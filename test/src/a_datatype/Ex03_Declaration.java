package a_datatype;

public class Ex03_Declaration {

	public static void main(String[] args) {
		
		// 국어점수를 저장할  변수 선언 - 값 대입
//		int kor;
//		kor = 90;
//		
//		// 초기화 : 변수 선언시 값 대입
//		int eng = 88;
	// -- 원하는 만큼 주석을 하면 crtl shift c
		
				
		//  kor와 eng 두개 이상의 변수를 한 번에 선언
		int kor=90 , eng=90;
		System.out.print("국어:" + kor + " , 영어:" +eng +"\n"); //println의 ln 온라인이라는 뜻 한 줄이 띄어지고 안 띄어지고의 차이 이다.
		System.out.printf("국어: %d, 영어 : %d", kor, eng); // 또는  "\n" 로 줄을 한 줄 뗄 수 있다.


		
		//---------------------------------------------------
		// 점수바꾸기 - swap 맞바꾸기. 
		// 반드시 임시 변수가 필요하다. 임시 변수에 값 하나를 옮기고 값이 옮겨진 곳에 나머지 하나를 저장 그리고 임시변수를 나머지 하나로 가져오면 된다.
		int temp;
		temp = kor; //1
		kor = eng; //2
		eng = temp; //3
		System.out.print("\n" + "국어:" + kor + " , 영어:" + eng +"\n");
		
		if ( kor == eng ) { //같다는 연산은 == 두개다
			System.out.println("동일한 점수");
		}else {
			System.out.println("다른점수");
			
		}
		
	}

}
