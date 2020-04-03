package h_inherit;

import java.util.Scanner;

public class Normal {
public static void main(String[] args) {
	language i = null;
	Scanner input = new Scanner(System.in);
	System.out.println("언어선택()1. 한국어 2. 영어 3. 일본어");
	int sel = input.nextInt();
	
	switch(sel) {
	
	case 1: i = new Korean("안녕하세요", "나의 이름은 홍 길 동", "열심히하자"); break;
	case 2: i = new English("Hello", "My name is Gil Dong HONG", "fire"); break;
	case 3: i = new Jappnes("こんにちは", "ホン・ギルドン", "がんばろう"); break;
	}
	System.out.println("메세지를 선택하세요!()1. 인사 2. 소개 3. 하고싶은말");
	int cho = input.nextInt();
	switch(cho) {
	case 1: i.greeting(); break;
	case 2: i.introduce(); break;
	case 3: i.mention(); break;
	}

	
	
}
}
