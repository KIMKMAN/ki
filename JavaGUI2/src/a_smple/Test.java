package a_smple;
import java.awt.*;

// has a 방식
// 
//

public class Test {
	//멤버변수 선언
	Frame f; //null값 들어있다/. //Frame은 윈도우 창을 만든다
	Button b;
	Label l;
	TextField txt; // 텍스트 필드 변수를 선언
	TextArea a;
	Checkbox c, c2;
	List li;
	
	public Test() { // 생성자 //화면만들기// 객체생성
		//객체 생성
		f = new Frame("나의창"); // has-a방식
		b = new Button("OK"); // 화면에 뜨기 전에 버튼이 붙어 있어야 버튼이 보인다. 맨앞부터 보인다고 생각
		l = new Label("NAME");
		txt = new TextField("이름은 5자 미만입니다", 40); // (String, int)순서가 안맞으면 에러 존재하진않기때문에
		a = new TextArea(); // 몇행 몇렬//공백 줄거리..내용
		c = new Checkbox("Male");
		c2 = new Checkbox("Female", true); // true 체크 역할
		li = new List(); //리스트를 만들어 스크롤로.
		li.add("Wow");
		li.add("Nice");
		li.add("Oh");
		li.add("GOOD");
		
		//붙이기 //화면 출력전에 먼저 버튼을 붙여야한다.
		// Layout : 붙이는 방식  
		//f.setLayout(new FlowLayout()); // 배치 // FlowLayout() 중앙수직위로 정렬
		//f.setLayout(new GridLayout(4,2)); // 4행 2열로 변경 늘리면 크기도 변경된다.
		f.setLayout(new BorderLayout()); //영역에 정해짐 반드시 고정하는곳에 영역정해야함
		f.add(b, BorderLayout.WEST); //
		f.add(l, BorderLayout.EAST);
		f.add(txt, BorderLayout.NORTH);
		f.add(a, BorderLayout.CENTER);
		Panel p = new Panel(); // 두개를 하나로 붙혀줌
		// p.setLayout(new GridLayout(2,1)); //한줄로  위아래 정렬
		
		p.add(c); //BorderLayout 사용시 한영역에 하나밖에 사용 못함 사용시 덧붙혀짐.
		p.add(c2); //Panel 붙혀할 곳에 판넬로 붙혀줌
		f.add(p, BorderLayout.SOUTH);
		//f.add(li);
		
		//화면출력
		f.setVisible(true); // 
		f.setSize(500, 400); // 크기를 지정 //종료시 빨간버튼 필수 그외는 종료안됨
	}

	public static void main(String[] args) {

		Test t = new Test(); // 생성 메모리 //제어권 5라인 넘김 함수다시받음
		
	}
}
