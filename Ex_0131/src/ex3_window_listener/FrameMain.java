package ex3_window_listener;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		//f.setSize(300, 300);
		//f.setLocation(400, 200);
		f.setBounds( 400, 200, 300, 300 );
		
		//�����ӿ��� �� ��� ��ưŬ���� �����ϴ� �̺�Ʈ �����ڸ� ����
		f.addWindowListener( new MyListener() );
		
		f.setVisible(true);
	}//main
}

























