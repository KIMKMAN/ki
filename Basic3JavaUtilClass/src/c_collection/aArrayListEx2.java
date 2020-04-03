package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(4); // 명확하게 자료형 표시 generics
		list.add("rabbit");
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics 지정
		for(String data:list) { // 향상된 포문 더 빠르다 자료구조와 generics가 있어야 사용된다
			System.out.println(data); // 형태가 동일해야 사용가능
		}
		
		
		
		for (int i = 0; i < list.size(); i++) {
			String data = (String)list.get(i); // get 함수는 Object형으로 리턴하고 사용할 때 형변환 사용
			System.out.println(data); // 보편적인 포문
		}

	}

}
