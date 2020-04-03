package c_info;

import javax.swing.*;
import java.awt.*;

public class InfoTest2 extends JFrame {
	//1. 멤버변수
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	
	//객체생성
	public InfoTest2(){
		
		ta = new JTextArea(300, 200);
		
		bAdd = new JButton("Add", new ImageIcon("src/png/monitor"));
		bAdd.setVerticalTextPosition(JButton.BOTTOM);
		bAdd.setHorizontalTextPosition(JButton.CENTER);
		bAdd.setPressedIcon(new ImageIcon("src/png/tablet-3"));
		bAdd.setRolloverIcon(new ImageIcon("src/png/transform"));
		bAdd.setToolTipText("사용자 정보를 입력 하세요");
		bAdd.setMnemonic('i');
		
		bShow = new JButton("Show");
		bShow = new JButton("Search");
		bShow = new JButton("Delete");
		bShow = new JButton("Cancel");
		bShow = new JButton("Exit");
		
		tfName = new JTextField(10);
		tfId = new JTextField(10);
		tfTel = new JTextField(10);
		tfSex = new JTextField(10);
		tfAge = new JTextField(10);
		tfHome = new JTextField(10);
				
	}
	//3. 화면 구성및 출력
	void display() {
		
		// 이 라벨마다 이벤트가 있고 동작이 있으면 멤버변수로 있느게 맞지만 지금 은 출력한 하고 아무것도 안 할 거니까
		// 멤버변수 안해도 됨..
		JLabel l = new JLabel("Name", new ImageIcon("src/png/window"), 2);
		
		JLabel l2 = new JLabel("Id", 10);
		JLabel l3 = new JLabel("Tel", 10);
		JLabel l4 = new JLabel("sex", 10);
		JLabel l5 = new JLabel("age", 10);
		JLabel l6 = new JLabel("Home", 10);
		
		setLayout(new BorderLayout());
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(6,2));
		p.add(l);
		p.add(tfName);
		p.add(l2);
		p.add(tfId);
		p.add(l3);
		p.add(tfTel);
		p.add(l4);
		p.add(tfSex);
		p.add(l5);
		p.add(tfAge);
		p.add(l6);
		p.add(tfHome);
		
		add(ta, BorderLayout.WEST);
		
		add(ta, BorderLayout.CENTER);
		
		JPanel p2 = new JPanel(new GridLayout(1,6));
		p2.add(bAdd);
		p2.add(bShow);
		p2.add(bSearch);
		p2.add(bDelete);
		p2.add(bCancel);
		p2.add(bExit);
		
		add(p2, BorderLayout.SOUTH);
		
		setLocation(200, 200);
		setSize(700, 560);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {

		InfoTest2 t = new InfoTest2();
		
		t.display();
		
	}

}
