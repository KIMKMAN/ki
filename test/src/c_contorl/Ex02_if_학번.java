package c_contorl; //브레이크 포인트(프로그램 정지) 디버깅 모드F11 클릭후 F6 한행씩 실행(작업 확인) 작업완료 후 디버깅 종료  ctrl + F2

import sun.applet.Main;

public class Ex02_if_학번 {
	public static void main(String[] args) {
		
		String id = "2017222789"; // 숫자 0 부터 시작
		String year = id.substring(0, 4); // 0부터 4전의 것까지 - 2017
		//id에서 입학년도에 해당하는 숫자를 불러온다. isschool = 2-2- *substring에서 end값은
		// 그 전까지 
		String calleage = id.substring(4, 5); // 변수.chartat(4);  
		String major = id.substring(5, 7); // 변수 메이저 id string 5-7번째 전까지 가지고 옴.
		String calleage_name = ""; // 변수 callage 선언
		String major_name = "";
		
		if (calleage.equals("1"))
		{
			switch(major) {
			case "11" : major_name = "컴퓨터학과"; break;
			case "12" : major_name = "소프웨워학과" ; break;
			case "13" : major_name = "모바일학과"; break;
			case "22" : major_name = "자바학과"; break;
			case "33" : major_name = "서버학과"; break;
			}
		} else if (calleage.equals("2")) {
			switch(major) {
			case "11" : major_name = "사회학과"; break;
			case "12" : major_name = "경영학과"; break;
			case "13" : major_name = "경제학과"; break;
			}
		}
			
	
		
		
		
		//System.out.println(id + "는" + year + "년도에 입학한");
		/*if (calleage.equals("1")) { // callage와 문자열의 "1" 같은지 비교 (equals) (=) 주소비교
			calleage_name = "공대";
			if (major.equals("11")) {
				major_name = "컴퓨터학과";
			}else if (major.equals("12")) {
				major_name = "소프트웨어학과";
			}else if (major.equals("13")) {
				major_name = "모바일학과";
			}else if (major.equals("22")) {
				major_name = "자바학과";
			}else if (major.equals("33")) {
				major_name = "서버학과";
			}
		}else if (calleage.equals("2")) {
			calleage_name="사회대";
			if (major.equals("11")) {
				major_name = "사회학과";
			}else if (major.equals("12")) {
				major_name = "경영학과";
			}else if (major.equals("13")) {
				major_name = "경제학과";
			}
		}*/
		System.out.println(id + "번 학생은 " + year + "년에 입학한 " + calleage_name +" "+ major_name + " 대학생");
		//		 if (daehak == '1'){
		//		college = "공대";
		//		 }else if(daehak == '2'){ 
		//		college = "사회대";

	}
}


/*우리대학의 학번(문자열)은 총 10자리로 되어 있습니다.
맨 앞의 4자리는 입학년도이고 5번째 문자는 단과대 번호입니다.
     1 : 공대 (단과대)
     2 : 사회대
그 뒤의 2자리는 각 학과번호입니다.
  공과대학인 경우는(학과)
     11 : 컴퓨터학과        12 : 소프트웨어학과          13 : 모바일학과
     22 : 자바학과         33 : 서버학과
사회대학인 경우는(major)
  11 : 사회학과         12 : 경영학과          13 : 경제학과
       ex) 2017111001 는 2017년도에 입학한 공대 컴퓨터학과 학생입니다
       ex) 2019211001 는 2019년도에 입학한 사회대 사회학과 학생입니다
       ex) 2018133001 는 2018년도에 입학한 공대 서버학과 학생입니다        */	