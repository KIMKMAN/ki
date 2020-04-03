package h_inherit;

import h_inherit.language;

public class English extends language { 

	public English(String greeting, String introduce, String mention) {
		super(greeting, introduce, mention);// 부모의 생성자를 가져옴
	}
		
}
