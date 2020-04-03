package e_Event;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import java.awt.event.*;


// (1) 이벤트 핸들러
public class TestB extends JFrame implements ActionListener {

	JButton b;
	JTextField txt;

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

	public void actionPerformed(ActionEvent e) {
		Object evt = e.getSource(); // Object 경우가 달라서
		if (evt == b) {
			String msg = b.getText(); // 버튼 1개에 이벤트를 내용을 가져옴
			JOptionPane.showMessageDialog(null, msg + "이벤트발생");// 창띄우기
		} else if (evt == txt) {
			String msg = txt.getText();
			JOptionPane.showMessageDialog(null, msg + "를 입력하셨습니다");// 창띄우기

		}
	}

	void eventProc(){
		
		//(3) 이벤트 연결
	b.addActionListener(this);
	txt.addActionListener(this);
	}
	
	public static void main(String[] args) {
		//(2) 이벤트핸들러 객체 생성
		TestB b = new TestB();
		b.display();
		b.eventProc();
	}

}
