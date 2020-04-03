package f_numbergame;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NumberGameTest {

	public static void main(String[] args) {
		NumberGame g = new NumberGame();
		g.initChar();
		g.ShowAnswer();

	}

}

class NumberGame extends JFrame implements ActionListener { // 화면구성
	// 멤버변수
	int getsu = 4;

	JButton[][] b = new JButton[getsu][getsu];

	// 2. 버튼위에 지정할 문자 변수
	char[][] answers = new char[getsu][getsu]; // char '\u0000'

	// 5. 첫번째 버튼에 대한 저장
	JButton firstClick;
	int firstRow, firstLow;

	NumberGame() {
		// 2. 객체생성
		// 3.화면구성
		setLayout(new GridLayout(4, 4));
		for (int row = 0; row < b.length; row++) {
			for (int low = 0; low < b[row].length; low++) {
				b[row][low] = new JButton(row + ":" + low);
				add(b[row][low]);
				// 문자자 배열을 0으로 초기화
				answers[row][low] = '0';

				// 문자 배열을 0으로 초기화
				answers[row][low] = '0';

				// 이벤트연결
				b[row][low].addActionListener(this);
			}
		}

		// 화면에출력
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 임의의 알파벳을 임의의 위치에 지정
	void initChar() {
		char alpha = '0';
		BACK: for (int i = 0; i < getsu * getsu;) {

			// 임의의 알파벳 만들기
			if (i % 2 == 0) {
				alpha = (char) ('A' + (int) (Math.random() * 26));
				// 기존에 이미 이 알파벳이 있는지 확인
				for (int r = 0; r < getsu; r++) {
					for (int c = 0; c < getsu; c++) {
						if (answers[r][c] == alpha)
							continue BACK;

					}
				}

			}

			// 임의의 위치 선정하기
			boolean ok = false;
			do {
				int row = (int) (Math.random() * getsu);// 0,1,2,3, 아무거나
				int low = (int) (Math.random() * getsu);

				if (answers[row][low] == '0') {
					answers[row][low] = alpha;
					i++;
					ok = true;
				}
			} while (!ok);
		}

	}

	void ShowAnswer() {
		// 답을 보여주기
		for (int row = 0; row < getsu; row++) {
			for (int low = 0; low < getsu; low++) {
				b[row][low].setText(String.valueOf(answers[row][low]));

			}
		}

		// 1분 후에 답 가리기

		try {
			Thread.sleep(1000);// 예외발생이 가능해서 트라이캐치로 묶음 이렇게 하면 1초뒤에 덮어짐
		} catch (InterruptedException e) {
			
		}	
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				b[i][j].setText(null);
			}
		}

	}

	public void actionPerformed(ActionEvent e) {

		JButton evt = (JButton) e.getSource();
		for (int i = 0; i < getsu; i++) {
			for (int c = 0; c < getsu; c++) {
				if (b[i][c] == evt) {
					//evt.setBackground(Color.cyan);
					// 첫번째 선택인가
					if (firstClick == null) {
						firstClick = evt;
						firstRow = i;
						firstLow = c;
						evt.setBackground(Color.CYAN);
						evt.removeActionListener(this);
					} else { // 두번째 선택이라면
						if (answers[firstRow][firstLow] == answers[i][c]) {
								firstClick.setBackground(Color.GREEN);
								evt.setBackground(Color.GREEN);
						} else {
							firstClick.setBackground(null);
						}
						firstClick.addActionListener(this);
						firstClick = null;
					}
				}
			}
		}
	}
}
