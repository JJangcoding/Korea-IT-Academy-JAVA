package ex2_string;

import java.util.Scanner;

public class Ex4_work {

	public static void main(String[] args) {

		String[][] actor = { { "[song]", "����", "����", "����" }, { "[lee]", "��λ�", "�����ڵ�", "����" },
				{ "[ryu]", "�û���", "��Ű", "Ÿ¥" } };

		// �˻��� ��� : song
		// [song]
		// ����
		// ����
		// ����
		// ===================================== �˻��� �ùٸ��� �� ���

		// �˻��� ��� : park
		// �ش� ��찡 �����ϴ�.
		// ===================================== �˻���� ���� ���

		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� ��� : ");
		String Str = sc.next();

//		if (Str.equalsIgnoreCase(actor[0][0].substring(1, 5))) {
//
//			System.out.println(actor[0][0]);
//			System.out.println(actor[0][1]);
//			System.out.println(actor[0][2]);
//			System.out.println(actor[0][3]);
//            
//		}
//
//		else if (Str.equalsIgnoreCase(actor[1][0].substring(1, 4))) {
//
//			System.out.println(actor[1][0]);
//			System.out.println(actor[1][1]);
//			System.out.println(actor[1][2]);
//			System.out.println(actor[1][3]);
//
//		}
//
//		else if (Str.equalsIgnoreCase(actor[2][0].substring(1, 4))) {
//
//			System.out.println(actor[2][0]);
//			System.out.println(actor[2][1]);
//			System.out.println(actor[2][2]);
//			System.out.println(actor[2][3]);
//
//		}
//
//		else {
//			System.out.println("�ش� ��찡 �����ϴ�.");
//		}


//		------------------------------------------------------------------------
//		if (Str.equalsIgnoreCase(actor[0][0].substring(1, 5))) {
//
//			for (int i = 0; i < 4; i++) {
//				System.out.println(actor[0][i]);
//				
//			}
//            
//		}
//
//		else if (Str.equalsIgnoreCase(actor[1][0].substring(1, 4))) {
//
//			for (int i = 0; i < 4; i++) {
//				System.out.println(actor[1][i]);
//				
//			}
//
//		}
//
//		else if (Str.equalsIgnoreCase(actor[2][0].substring(1, 4))) {
//
//			for (int i = 0; i < 4; i++) {
//				System.out.println(actor[2][i]);
//				
//			}
//
//		}
//
//		else {
//			System.out.println("�ش� ��찡 �����ϴ�.");
//		}
	

		//length �迭���� ���°��� �Ұ�ȣ�� �Ⱦ�. (�޼��� �ƴ�.)
  
		int cnt = 0;
		
		for(int i =0; i <actor.length;i++) {
		if(actor[i][0].equalsIgnoreCase("[" +Str+ "]")) {
			
			for(int j = 0; j< actor[i].length;) {
				
				System.out.println(actor[i][j]);
				
			}//innter
			
			}else {
				cnt++;
				
				if(cnt == actor.length)
				{System.out.println("�ش� ����� �̷��� ��ϵǾ� ���� �ʽ��ϴ�.");}
			}
			
		
		
  }//outer
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}// main

}
