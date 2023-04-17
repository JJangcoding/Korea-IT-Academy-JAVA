package ex3_choice;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Choice {
	
	static String ss = "���� A��";
	
	public static void main(String[] args) {
		
		
		
		Frame f = new Frame();
		f.setBounds(500,300,500,250);
		f.setLayout(null);
		
		//���û���(Choice)��ü ����
		Choice bt = new Choice();
		bt.add("A");
		bt.add("B");
		bt.add("O");
		bt.add("AB");
		
		//Choice��ü�� ���̰��� �ȿ� �ִ� ����� ������� �����ǹǷ�
		//0���� �ξ �����ϴ�.
		bt.setBounds(10, 35, 100, 0);
		
		//����� ������ Lable
		Label resultLable = new Label(ss);
		Font font = new Font("",Font.BOLD, 30);
		resultLable.setFont(font);
		
		resultLable.setBounds(200,100,200,50);
		
		//�������� �����ϴ� Choice��ü���� �̺�Ʈ ������ �߰�
		bt.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				 ss = bt.getSelectedItem();
				
				//���� ������ �׸��� Lable�� �������� ����
				resultLable.setText("���� " + ss + "��");
				
			}
		});
		
		
		//������Ʈ�� �����ӿ� �߰�
		f.add(bt);
		f.add(resultLable);
		
		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				System.exit(0);// �����ִ� ��� �������� ����

			};

		});
		
		f.setVisible(true);
	}//main

}
