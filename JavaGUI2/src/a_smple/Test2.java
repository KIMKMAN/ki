package a_smple;

import java.awt.*;
import javax.swing.*;
// is-a 방식

public class Test2 extends JFrame {// 부모 상속 // Java는 단일 상속이기때문에 하나만 된다.
	// 멤버변수 선언
	//JButton b; // 상속 받지 않기 때문에 멤버변수를 선언해줘야한다.
	//"남자" 라디오 버튼 / "여자"라디오버튼
	// "성인" 라디오 버튼 / "미성년" 라디오 버튼
	JRadioButton rb_male,rb_female,rb_adult,rb_child;
	
	public Test2() {
		super("나의 창2"); // 무조건 첫번째라인에 들어와함
		// 객체생성 // 자동으로 기본생성자 super가들어옴 값 바꾸고 싶으면 super작성후 값 변경
		rb_male = new JRadioButton("남자", true);
		rb_female = new JRadioButton("여자");
		rb_adult = new JRadioButton("성인");
		rb_child = new JRadioButton("미성년", true);
		
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(rb_male);
		bg1.add(rb_female);
		
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(rb_adult);
		bg2.add(rb_child);
		
		
		
		// 붙이기
		setLayout(new FlowLayout());
		add(rb_male);// Frame을 상속받기때문에 Test2 자체가 Frame으로 된다.
		add(rb_female);
		add(rb_adult);
		add(rb_child);
		
		// 화면출력
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Test2 t = new Test2();

	}

}
