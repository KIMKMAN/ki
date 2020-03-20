package study;

import java.util.Scanner;

public class 연습04_1 {

	public static void main(String[] args) {
		// (변수 i를 생성하고 3으로 초기화 하라)
		// 안녕하세요
		// 반갑습니다
		// 변수 i 는  3 입니다.
//		int i = 3;
//		System.out.println("안녕하세요");
//		System.out.println("반갑습니다");
//		System.out.println("변수 i 는 "+i+" 입니다");
		
		
		//실수 2개의 a,b 변수를 생성하고 키보드로 입력을 받아 초기화 해라.
		// 출력  : a + b = (결과값) 
//		double a = 0;
//		
//		
//		Scanner input = new Scanner(System.in); //사용자가 키보드를 입력할 때 Scanner 사용
//		a = input.nextDouble(); //nextInt 정수입력, nextdouble 실수입력, next 공백(엔터포함)이 입력될때까지 nextLine 엔터가 입력 될때까지
//		double b = input.nextDouble();
//		double c = a+b;
//		System.out.println("a + b = "+a+b);//(문자열)+(실수)+(실수) ==>(문자열+실수=>문자열)+실수 ==> 문자열
//		System.out.printf("a + b = %f%f",a,b);//System.out.println("a + b = "+a+b); 와 같은 거임.
//		System.out.println(a+b+"=a+b");	//(실수)+(실수)+(문자열) ==> (실수를 먼저 계산한뒤) + (문자열) ==> 문자열
//		System.out.println("안녕"+"하세요");//(문자열)+(문자열) ==> (문자열)
//		System.out.println("안녕"+(a+b));//(문자열) + (실수) 이지만 괄호가 우선순위가 높아 먼저 연산된뒤 출력을 한다.
//		System.out.printf("안녕 %d", a+b);//System.out.println("안녕"+(a+b)); 와 같은거임
	
		
		// int형 변수를 생성하여 3.1을 강제로 int형으로 넣어라
		int a = (int)3.1; // 작은 범위에서 큰범위로 덜정밀한 자료형에서 정밀한 자료형으로 갈 때 형변환이 일어난다.
		System.out.println(a);
		
		//연산자의 종류 
		a++;//a=a+1; 8()<<2()
		
		//비교연산자는 ture, false로 나누어진다. <, >, <=, >=, == , !=
		// 논리형 연산자 &&(그리고), ||(또는) 참, 거짓값을 구분  & |
		// 대입연산자 =, +=,  삼항연산자(조건)?(참일때값):(거짓일때값) ex>a= (b>0) ? 1:0
		
		
	}

}
