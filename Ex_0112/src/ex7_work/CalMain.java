package ex7_work;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		
		//��1,��2, �����ڸ� Calculator�� getResult()�޼���� �����Ͽ� ����� ����Ͻÿ�.
		
		//��1: 5
		//��2: 10
		//������ : +
		//5 + 10 = 15
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("��2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("������ : ");
		String cal = sc.next();
		
		Calculator function = new Calculator();
		function.getResult(num1,num2,cal);
		
		
	}
}
