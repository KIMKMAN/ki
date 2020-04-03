package d_cal;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;

//has-a

public class CalculatorTest implements ActionListener {
	// 1. 멤버변수 선언
	JFrame f;
	JButton[] b = new JButton[15];
	JTextField txt;
	JTextArea Are;
	int prev; // 이전값
	String op; // 연산자

	public CalculatorTest() {
		// 2. 객체생성

		f = new JFrame("계산기");
		f.setLayout(new BorderLayout());

		txt = new JTextField();
		Are = new JTextArea();

	}

	// 3. 화면 구성 및 출력하기
	public void display() {
		for (int i = 0; i < 10; i++) {
			b[i] = new JButton(String.valueOf(i));
		}

		b[10] = new JButton("+");
		b[11] = new JButton("-");
		b[12] = new JButton("*");
		b[13] = new JButton("/");
		b[14] = new JButton("=");

		JPanel p = new JPanel(new GridLayout(5, 3));
		for (int i = 1; i < 10; i++) {
			p.add(b[i]);
		}
		p.add(b[10]);
		p.add(b[0]);
		p.add(b[14]);
		p.add(b[11]);
		p.add(b[12]);
		p.add(b[13]);

		f.add(p, BorderLayout.CENTER);
		f.add(txt, BorderLayout.NORTH);

		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void eventProc() {
		for (int i = 0; i < b.length; i++) {
			b[i].addActionListener(this);
		}

	}

	public void actionPerformed(ActionEvent e) {
		JButton evt = (JButton) e.getSource();

		// 숫자가 눌렸을 때
		for (int i = 0; i < 10; i++) {
			if (evt == b[i]) {

				String su = txt.getText();
				su += b[i].getText();

				txt.setText(su);
			}
		}
		// 연산자가 눌렸을 때
		if (evt == b[10]) {// 더하기
			prev = Integer.parseInt(txt.getText());
			txt.setText(null);
			op = evt.getText();
		} else if (evt == b[11]) {// 빼기
			prev = Integer.parseInt(txt.getText());
			txt.setText(null);
			op = evt.getText();
		} else if (evt == b[12]) { // 곱하기
			prev = Integer.parseInt(txt.getText());
			txt.setText(null);
			op = evt.getText();
		} else if (evt == b[13]) { // 나누기
			prev = Integer.parseInt(txt.getText());
			txt.setText(null);
			op = evt.getText();
		}

		// '=' 버튼이 눌렸을때
		if (evt == b[14]) {
			switch (op) {
			case "+":
				int second = Integer.parseInt(txt.getText());
				int result = prev + second;
				txt.setText(String.valueOf(result));
				break;
			case "-":
				int third = Integer.parseInt(txt.getText());
				int resul = prev - third;
				txt.setText(String.valueOf(resul));
				break;
			}
		}
	}

	public static void main(String[] args) {
		CalculatorTest t = new CalculatorTest();
		t.display();
		t.eventProc();
	}

}
