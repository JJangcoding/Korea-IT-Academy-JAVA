package ex4_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {

		// 1~50������ ������ �߻�!
		// ����Ŭ�������� �������� �Է¹޴´�
		// �Է¹��� ���� up, down ���������� �Ǵ�!
		// ������ ��� mainŬ������ while���� ������������ ó��

		// ���� : 30
		// Down
		// ���� : 15
		// up
		// ���� : 25
		// 3ȸ���� ����!!!!

		Scanner sc = new Scanner(System.in);
		Updown ud = new Updown();
		
		
		while (true) {
			
			System.out.print("���� : ");
			int n = sc.nextInt();
			boolean res = ud.checkResult(n);
			
			if(res) {//res == true} 
			
			 break;//������ ���� ��� while���� ����������.
			}
			
			
			
			
			
			
			
		}

	} // main
}
