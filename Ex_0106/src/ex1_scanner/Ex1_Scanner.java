package ex1_scanner;

import java.util.Scanner; //��ĳ�� ����Ʈ �ʼ� !!!!!! 

public class Ex1_Scanner {
	public static void main(String[] args) {
		
	
	//Ű���忡�� ���� �Է¹��� �� �ֵ��� ���ִ� Ŭ����
	Scanner	sc = new Scanner(System.in);//�ʼ�!!!!!!!
		
	System.out.print("���� : ");// �Է�â �ٷο��� ��¹������� prinln���� print�� ����!!!
	int num = sc.nextInt();//�Է¹��� ���� ���  => A�� ����
	System.out.println("�Է¹��� �� : " + num);
	
	System.out.print("���� : ");
	String str = sc.next();//���� 123�� �ƴ� ���� 123�� �޴´�.
	System.out.println("��� : " + str );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}//main
	
	
	

}
