package b_smple_swing;
import java.awt.*;
import javax.swing.*; // awt 업글

// swing
// 
//

public class Test_Has_a {
	//멤버변수 선언
	JFrame f; //null값 들어있다/. //Frame은 윈도우 창을 만든다
	JButton b; // swing은 대문자 J를 꽅붙혀줘야한다.
	JLabel l;
	JTextField txt;
	JTextArea a;
	JCheckBox c, c2;
	JList li;
	
	public Test_Has_a() { // 생성자
		//객체 생성
		f = new JFrame("나의창"); // has-a방식
		b = new JButton("OK");
		l = new JLabel("NAME");
		txt = new JTextField("이름은 5자 미만입니다", 40); // (String, int)순서가 안맞으면 에러 존재하진않기때문에
		a = new JTextArea(); // 몇행 몇렬//내용
		c = new JCheckBox("Male");
		c2 = new JCheckBox("Female", true); // true 체크 역할
		String [] data = {"Wow","Nice","Oh","GOOD"}; // String[] {}배열로 만들어줘야함
		li = new JList(data);
		
		
		f.setLayout(new BorderLayout()); //영역에 정해짐 반드시 고정하는곳에 영역정해야함
		f.add(b, BorderLayout.WEST); //
		f.add(l, BorderLayout.EAST);
		f.add(a, BorderLayout.CENTER);
		JPanel p = new JPanel(); // Layout을 제외한 화면에 J를 붙혀야함
		
		
		p.add(c); //BorderLayout 사용시 한영역에 하나밖에 사용 못함 사용시 덧붙혀짐.
		p.add(c2); //Panel 붙혀할 곳에 판넬로 붙혀줌
		
		JPanel p2 = new JPanel();
		p2.add(txt);
		p2.add(li);
		
		f.add(p, BorderLayout.SOUTH);
		f.add(p2, BorderLayout.NORTH);
		
		
		//화면출력
		f.setVisible(true); // 
		f.setSize(500, 400); // 크기를 지정 //종료시 빨간버튼 필수 그외는 종료안됨
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//화면 종료 나가기
	}

	public static void main(String[] args) {

		Test_Has_a t = new Test_Has_a(); // 생성 메모리 //제어권 5라인 넘김 함수다시받음
		
	}
}
