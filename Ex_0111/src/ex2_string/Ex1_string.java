package ex2_string;

import java.util.Scanner;

public class Ex1_string {

	public static void main(String[] args) {
		
		//�ֹι�ȣ�� �Է��ϼ���
		//��)901122-2011345
		//>>000918-3456789
		//����� 00�� 9�� 18�Ͽ� �¾ �����Դϴ�.
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
		System.out.println("��)901122-2011345");
		System.out.print(">>");
		
		String id = sc.next();
		
		if (id.trim().length() < 14 || id.trim().charAt(6) != '-') {
	        System.out.println("�ֹι�ȣ ������ �ùٸ��� �ʽ��ϴ�.");	
		
		}else {
			String y = id.substring(0,2);
			String m = id.substring(2,4);
		    String d = id.substring(4,6);
		    String gender = id.substring(7,8);
		
		    if (gender.contentEquals("1")||gender.contentEquals("3")) {
				gender = "����";
			}else if (gender.contentEquals("2")||gender.contentEquals("4")) {gender = "����";}
		    
		    System.out.printf("����� %s�� %s�� %s�Ͽ� �¾ %s�Դϴ�.", y, m ,d, gender);
		    
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
	
}
