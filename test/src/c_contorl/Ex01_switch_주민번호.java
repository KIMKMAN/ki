package c_contorl;

public class Ex01_switch_주민번호 {

	public static void main(String[] args) {

		String id = "020202-4525685";
		char chul = id.charAt(8); // 
		String home = "";
		
		switch(chul) {
		default : home = "한국인"; // default break; 앞에서 덮어가기 때문에 작성, 밑에 있을 경우 break; 필요없음
			case '0' : home = "서울"; break; // 0인 경우 서울이 참이되지만 결과값은 경기도 2가된다. break; 구분하고 멈춘다
			case '1' : home = "인천/부산"; break;
			case '2' : home = "경기도"; break;
		}
		System.out.println("출신지-" + home);
		
 


	}

}
