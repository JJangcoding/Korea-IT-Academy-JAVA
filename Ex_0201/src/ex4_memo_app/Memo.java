package ex4_memo_app;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Memo {

	public static void main(String[] args) {
		
		Frame frame = new Frame("메모장");
		frame.setBounds(500,200,250,400);
		frame.setLayout(null);//자동배치 끄기
		frame.setBackground(Color.GRAY);
		
		Font font = new Font("",Font.PLAIN, 20);
		
		//상단에 자리잡을 컴포넌트들---------------------------------
		
		TextField tf = new TextField();
		tf.setBounds(10,35,180,20);
		
		Button btn = new Button("ok");
		btn.setBounds(195,35,45,20);

		//---------------------------------
		//중앙에 자리잡을 컴포넌트------------------
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10,60,230,280);
		ta.setFont(font);
		ta.setEditable(false);//ta에 직접적으로 값을 입력하는 것을 방지
		
		//----------------------------------
		
		//ta.setText("값");
		//ta.getText(); --> ta에 쓰여있는 내용을 가져온다
		
		//하단에 자리잡을 컴포넌트------------------
		Button btnSave = new Button("저장");
		btnSave.setBounds(20,345,100,40);
		
		Button btnClose = new Button("닫기");
		btnClose.setBounds(130,345,100,40);
		//닫기 버튼에 프레임을 종료하는 감지자 등록
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		//----------------------------------
		//frame에 컴포넌트들 추가
		frame.add(tf);
		frame.add(btn);
		frame.add(ta);
		frame.add(btnSave);
		frame.add(btnClose);
		
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				System.exit(0);// 열려있는 모든 프레임을 종료

			};

		});
		
		frame.setResizable(false);//만들어진 프레임의 크기 조정이 불가
		frame.setVisible(true);
		
		
	}//main
}
