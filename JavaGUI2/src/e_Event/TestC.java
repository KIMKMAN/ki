package e_Event;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

import e_Event.TestA.MyEvent;

import java.awt.event.*;

public class TestC extends JFrame  { // A방식에 축약
	JButton b;
	JTextField txt;

	public void eventProc() { // JMC으로 사용자가 event를 발생했을때 실행
		// (1)이벤트 핸들러 구현
		// (2) 이벤트 핸들러 객체생성
		// MyEvent me = new MyEvent(); //축약
		// b.addActionListener(me) // 축약
		// (3) 이벤트 연결
		b.addActionListener(new ActionListener()
		{//new Myevent를 재정의
			public void actionPerformed(ActionEvent e) {
				String msg = b.getText(); // 버튼 1개에 이벤트를 내용을 가져옴
				JOptionPane.showMessageDialog(null, msg + "이벤트발생1");// 창띄우기
				
			}
		}
		); // 객체생성하면서 연결 축약식
		txt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = txt.getText();
				JOptionPane.showMessageDialog(null, msg +"나이스");
			}
		});
		// ActionListener 인터페이스여서 객체생성 X

	}

//// (1) 이벤트 핸들러
//	class MyEvent implements ActionListener { //
//		public void actionPerformed(ActionEvent e) {
//			String msg = b.getText(); // 버튼 1개에 이벤트를 내용을 가져옴
//			JOptionPane.showMessageDialog(null, msg + "입력하였습니다");// 창띄우기
//		}
//
//	}

	void display() {
		b = new JButton("확인");
		txt = new JTextField(10);

		setLayout(new FlowLayout());

		add(b);
		add(txt);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		TestC c = new TestC();
		c.display();
		c.eventProc();
	}

}
