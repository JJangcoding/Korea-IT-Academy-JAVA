package ex2_string;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		// ȸ���� �Ǵ��ϱ�
		// ȸ������ ������ �о �ڿ��� �о �Ȱ��� ������ ����
		// ��: a1221a
		// a1221a (��)�� ȸ�����Դϴ�.
		// ��: abc
		// abc (��)�� ȸ������ �ƴմϴ�. 111

		Scanner sc = new Scanner(System.in);
		System.out.print("��: ");
		String input = sc.next();// ������
		String input2 = "";// ������ ��. �� �ֵ���ǥ�� �ʱ�ȭ ���ִ°� ����.

//	int j =0;
//	
//	for (int i = 0; i < input.length()/2; i++) {
//		
//	if (input.charAt(i)!=input.charAt(input.length()-1-i)) {
//	j++;	
//	}}
//	
//	if (j>0){
//		System.out.print(input + " (��)�� ȸ������ �ƴմϴ�.");
//	}
//	else System.out.print(input + " (��)�� ȸ�����Դϴ�.");

		for (int i = input.length()-1; i >= 0; i--) {

			input2 += input.charAt(i);
			
		} // for

		if (!input.equals(input2)) {
System.out.println("ȸ������  �ƴմϴ�.");			
		}else {System.out.println("ȸ���� �Դϴ�.");
			
		}
		
	}// main
}
