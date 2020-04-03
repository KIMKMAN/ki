package h_inherit3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
//		Book b = new Book("0001", "자바", "홍길동", "코스모");
//		b.output();
		Item i = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("상품선택()1. Book 2. Dvd 3. Cd");
		int sel = input.nextInt();
		
		switch(sel) {
		// (1)부모변수에 자식생성 가능함 // 상속관계가 만족해야함
		case 1: i = new Book("0001", "자바", "홍길동", "코스모"); break;
		case 2: i = new Dvd("002", "킹덤", "주지훈", "김은희"); break;
		case 3: i = new Cd("00001", "아는노래", "지코"); break;
		}
		
		// (2)overriding 출력*** // overriding 생성
		i.output();//다양성 경우에 따른 수가 생김 // 조건 두가지 만족해야함
		
	
	
	
	
	
	
	
	
	
	
	}
	
}




