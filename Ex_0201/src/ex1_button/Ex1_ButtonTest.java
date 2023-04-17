package ex1_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_ButtonTest {
	public static void main(String[] args) {

		Frame f = new Frame("버튼 테스트");

		// X축 Y축 너비 높이
		f.setBounds(500, 400, 400, 400);

		// Frame클래스는 추가된 컴포넌트를 화면에 가득 채우려고 하는 속성을 가지고 있다.
		f.setLayout(null);// 자동배치를 끈다.

		// 버튼생성
		// 자동배치가 꺼져있는 Frame에 들어가게 될 자식 컴포넌트들은
		// 반드시 위치와 크기값이 설정되어 있어야 한다.
		Button btnOk = new Button("확인");
		btnOk.setBounds(70, 90, 100, 50);

		Button btnClose = new Button("닫기");
		btnClose.setBounds(230, 90, 100, 50);

		// 만들어둔 버튼들에 대해서 이벤트 감지자 추가
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ok버튼 클릭 완료");

			}
		});

		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();//프레임 종료

			}
		});

		// 생성된 버튼을 f에 추가
		f.add(btnOk);
		f.add(btnClose);

		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				System.exit(0);// 열려있는 모든 프레임을 종료

			};

		});

		f.setVisible(true);

	}// main
}
