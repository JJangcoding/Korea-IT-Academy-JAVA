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
		
		Frame frame = new Frame("�޸���");
		frame.setBounds(500,200,250,400);
		frame.setLayout(null);//�ڵ���ġ ����
		frame.setBackground(Color.GRAY);
		
		Font font = new Font("",Font.PLAIN, 20);
		
		//��ܿ� �ڸ����� ������Ʈ��---------------------------------
		
		TextField tf = new TextField();
		tf.setBounds(10,35,180,20);
		
		Button btn = new Button("ok");
		btn.setBounds(195,35,45,20);

		//---------------------------------
		//�߾ӿ� �ڸ����� ������Ʈ------------------
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10,60,230,280);
		ta.setFont(font);
		ta.setEditable(false);//ta�� ���������� ���� �Է��ϴ� ���� ����
		
		//----------------------------------
		
		//ta.setText("��");
		//ta.getText(); --> ta�� �����ִ� ������ �����´�
		
		//�ϴܿ� �ڸ����� ������Ʈ------------------
		Button btnSave = new Button("����");
		btnSave.setBounds(20,345,100,40);
		
		Button btnClose = new Button("�ݱ�");
		btnClose.setBounds(130,345,100,40);
		//�ݱ� ��ư�� �������� �����ϴ� ������ ���
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		//----------------------------------
		//frame�� ������Ʈ�� �߰�
		frame.add(tf);
		frame.add(btn);
		frame.add(ta);
		frame.add(btnSave);
		frame.add(btnClose);
		
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				System.exit(0);// �����ִ� ��� �������� ����

			};

		});
		
		frame.setResizable(false);//������� �������� ũ�� ������ �Ұ�
		frame.setVisible(true);
		
		
	}//main
}
