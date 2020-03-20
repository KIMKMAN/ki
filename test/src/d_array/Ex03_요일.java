package d_array;

import java.util.Calendar;

public class Ex03_요일 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); // 얻어오면?? new를 선언하지 않는다 // 얻어오는 명령어 get
		int y = cal.get(Calendar.YEAR);// 얻어오는데 저장이  안되기 때문에 저장시킨다
		int m = cal.get(Calendar.MONTH);// 월
		int d = cal.get(Calendar.DATE);// 일
		System.out.println(y+"년"+ m+"월"+d +"일"); // 문자열 ex)jun 0
		
		// 시 분 초 출력
		int h = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println(h+"시" + mi+ "분" + s + "초");
		
		//요일 
		String[]day = {"일", "월", "화", "수", "목", "금", "토"};
		int 날 = cal.get(Calendar.DAY_OF_WEEK)-1; 
		System.out.println( day[날] + " 요일");//(같은의미)System.out.println( [day[cal.get(Calendar.DAY_OF_WEEK)-1] + " 요일");
		
				 
				
		
		
	}

}
