package ex1_string;

import java.util.Scanner;

public class Ex1_String {

	public static void main(String[] args) {

		// String�� �ΰ��� Ư¡�� ������ �ִ�.
		// 1) ��ü���� ����� �ΰ�����.(�Ͻ���, �����)
		// 2) �� �� ������ ���ڿ��� ������ ������ �ʴ´�.(�Һ��� Ư¡)
		
		
		// 1) Ư¡�� ���Ͽ�....
		//         stack <= s1 vs heap <= abc
	    //         <= s2  => �Ȱ���abc�� ���Ѵ�.
	    // 
		String s1 = "abc"; //=> �Ͻ��� ��ü����(�����Ͱ� ��ħ(new ��� X)) 
        String s2 = "abc";
		String s3 = new String("abc"); // new�� ����ϸ� ����� ��ü����
		String s4 = new String("abc"); // �����Ͱ� ���ĵ� ������ ������ ����!!!!!!!!!!!!!!! (�ٸ� (���ο�) abc�� ����)
		
		
		//==�� �⺻ �ڷ������� ���ϴ� ��� ���� ��
		//������ ��ü���� ==�� �ּҰ��� ��
		if (s1 == s3) {
			System.out.println("�ּҰ� ����.");
		}else {
			System.out.println("�ּҰ� �ٸ��ϴ�.");			
			
		}
		//String Ŭ������ ��ü�� �ּҺ񱳺���, ���� ���ϴ� ��찡 �ξ� ����.
		if(s1.equals(s3)) {
						System.out.println("���� �����ϴ�.");
		}
		//String �񱳴� .equals()�� ����
		
		System.out.println("------------------------------------------------------------------------------------");
//		Scanner sc = new Scanner(System.in); // ��ĳ�ʴ� �Ͻ��� ��ü ������ ���� (������ ���� ��������)
//	    s3= sc.next();
//	
//	    if(s1 == s3) {System.out.println("�����ϴ�.");}// �ٸ���.!!! (���ּҰ� �ٸ��Ƿ�..)   
	                                                //=> .equals()�� ����ϴ� ����. 
	                                                //=> ���� ���ϴ� ��찡 �ξ� �����ϱ� ������ String���� �񱳴� .equals()�� ���
        // 2) Ư¡�� ���Ͽ�........	
		String greet = "�ȳ�";
		greet += "�ϼ���";
		System.out.println(greet);
		
		// greet => stack vs �ȳ� => heap
	    //            =>  vs �ȳ��ϼ��� (���ο� ���� ����.) => heap  
	    // garbage collector �� �ڵ����� �޸� ������ ���ش�!!!!
	
		s1 = "bbb";
		s2 = "bbb";
		s2 = "ccc"; // ���� bbb�� ���� ������ä ccc��� ���ο� ���� ���´�. => �Һ��� => �ѹ� �޸𸮿� ������ ���� ������ �ʴ´�.!!!!!!!!!!!!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main

}
