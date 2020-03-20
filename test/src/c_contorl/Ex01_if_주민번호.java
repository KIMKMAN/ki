package c_contorl;

import java.util.*; // *=전체 클레스 사용

public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		
		//프로그램에서 숫자는 0 부터 셀 수도 있고 1부터 셀 수 있다.
		// 프로그램 언어 같은 경우는 거의 0부터 세고 나머지 들은 1부터 세는 경우가 많다.
		
		String id = "020602-3234567"; //일반적인 언어는 0부터 시작 예외는 1부터 시작, 숫자가 아니기 때문에 문자로 표현해준다
		char sung = id.charAt(7);	// 문자 열에서 문자 하나늘 가져 오는것이라서. charAt(n) 은 n 번째 문자열을 가져 오는 것이다.
		// sung 변수에 값이 1이면 '남자' 출력 ,1이거나 3이거나 9이면 남자
		// 그렇지 않고 값이 2이면 '여자' 출력 ,2이거나 4이거나 0이면 여자
		System.out.println("당신의 성별은?"); 
		if (sung == '1'|| sung == '3' || sung == '9') 
			// 추가 작성시 변수 항상 같이 작성 // 2진논리시 앞이 참이면 멈춤 참이 아니면 참 일때까지 계산
		{
			System.out.println("남자");
		}
		else if(sung == '2' || sung == '4'|| sung == '0'){ // 문자를 변수로 잡았기 때문에 값의 비교 또한 문자 2로 해야 한다. 중요 / 실수함.
			System.out.println("여자");
		}

		//나이를 구하기/ 나이는 주민등록번호 맨앞의 두 개를 얻어와야 하기 때문에
		// id.substring(beginIndex. endIndex) // begin 부터 end '앞'까지
		String nai = id.substring(0, 2); //start번째부터 end번째 앞까지  
		// nai = "80" 문자열 80은 계산이 안 됨 현재 문자열  80이다
		// 문자열을 정수로 변환
		int nai2 = Integer.parseInt(nai); // 문자를 10진수로 변환(정수변환)	ex) "123" => 123 문자를 숫자로 변환
		// nai2 =80

		// 올해년도 구하기
		Calendar c = Calendar.getInstance(); // 달력 구하고 연도 구하기(year) 캘린덜르 불러와서 인스턴스를 만드는 코드
		int year = c.get(Calendar.YEAR); //만들어진 캘린더에서 년도를 따와서 year 이라는 정수형 데이터 변수에 저장 한 것
		
		int age = 0;

		if (sung == '1' || sung == '2') {
			age = year - (1900 + nai2)+1;
		}
		else if(sung == '3' || sung == '4') {
			age = year - (2000 + nai2)+1;
		}
		else if(sung == '0' || sung == '9') {
			age = year - (1800 + nai2)+1;
		}
		System.out.println("나이" + age);
		
		//현재 년도에 고정되어 있어서 내년에는 못쓰는 프로그램이 되므로
		//자바에서 달력을 불러와서 년도가 바뀔 대 마다 자동으로 년도를 넣어줌
					
		
	}
}
		// 위와 같이 코딩하면 2000년대 이상 사람은 계산이 안 된다. 예를들면 오늘 태어난 아기가 있다고 했을 때