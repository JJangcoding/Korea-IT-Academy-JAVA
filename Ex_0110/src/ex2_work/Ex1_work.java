package ex2_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {

		// Ű���忡�� �Է¹��� ����ŭ �Ǻ���ġ ���� ����ϱ�
		// �Է�: 5
		// 1 1 2 3 5 8 13 21 34 55 89

		// ���� ==>

		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�: ");
		int num = sc.nextInt();

		int[] arr;
		arr = new int[num];

		int n1= 1;
		int n2= 0;
		int n3= 0;
				
		for (int i = 0; i < arr.length; i++) {
		
			n2=n3;
			n3=n1;
			n1=n2+n3;
			System.out.printf("%d ", n3);
		}


		
		
		
		
	}// main

}
