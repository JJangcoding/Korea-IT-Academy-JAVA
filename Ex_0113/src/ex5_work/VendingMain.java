package ex5_work;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
		//Ű���忡�� �ݾ��� �Է¹ް�
		//�ش� �ݾ� �����ȿ��� ���Ǽ� �ִ� ������ ��ϸ� ȭ�鿡 ���
		//���Ḧ �����ϸ� ���� �� �ܾ��� ��ȯ
		
		//insert coin: Ű���忡�� ���� �޴´�. ex 1000��
		//1000������ ����� �� �ִ� ������� �̸��� ������!!
		//coke - 1000
		//sider- 900
		//fanta -1000
		//>>coke
		//coke (��)�� �����ϼ̽��ϴ�
		//�ܾ� : 100��
		
		
		
		Scanner sc = new Scanner(System.in);
		Vending ven = new Vending();
		ven.canInit();
		
		System.out.print("insert coin : " );
		int money = sc.nextInt();
		
		ven.showCans(money);
		
		System.out.print(">>");
		String select = sc.next();//����� �̸� �Է�
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
