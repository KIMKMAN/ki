package e_static_sample;

public class DBConnet {

	static DBConnet con; // =null 자동으로 되어있다.
	
	private DBConnet() { // 일부러 생성자 함수를 못부르게 위해 private 사용
		
		
		System.out.println("실제로 디비 연결");
	}
	
	public static DBConnet getIntance() {// 첫번째 함수 호출 다음 함수는 호출되도 메모리가 변경되기 때문에 수행못함
		if(con==null) con = new DBConnet(); // 코딩에의해서 객체를 단 한번 생성
		// 메모리에 단 하나만 올리기 if 를 사용함 // 이것이 코딩으로 DBC를 하나만 올리는 것.
		// 이 함수에서는 같은 클래스의 생성자 함수를 사용 할 수 있기 때문에 new DBConnet(); 를 사용 할 수 있다.
		
		return con;					
	}
}


// 싱글즈 패턴 Calendar new를 생성하지 않는다. 이미 값이 있기때문에..
// Web에서는 싱글즈 패턴 사용 만명이 접속이 될때 객체하나만 띄울려고 사용