package ex1_scanner;

import java.util.Scanner;

public class Ex2_work {
public static void main(String[] args) {
	
	//Ű���忡�� n1�� n2������ ���� �������� �Է¹޴´�
	//n1���� n2������ ���� ���. ~~ n1�� n2�� ���ڰ� ���� �� Ŀ�� ����.
	
	Scanner sc = new Scanner(System.in);
	System.out.print("��1 : ");
	int num1 = sc.nextInt();
	
	System.out.print("��2 : ");
	int num2 = sc.nextInt();
	
	int sum = 0;
	
	//�������� �� ��ȯ !!!!!!!!
	
	if (num1 > num2) {
		int num3 = num1;
		num1=num2;
	    num2=num3;
	}
		
		
		for (int i = num1; i <= num2; i++) {
		sum += i;
	}
	
	System.out.println(sum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//main
	
}
