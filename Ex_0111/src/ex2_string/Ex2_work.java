package ex2_string;

import java.util.Scanner;

public class Ex2_work {
public static void main(String[] args) {
	//Ű���忡�� �ƹ����̳� �Է¹ް� �ҹ��� a�� ������ ���!!!!
	
	//�Է�: aljsdfjlasdfjlsdafjklkasdjf
	//a�� ���� : 
	
	Scanner sc = new Scanner(System.in);
	System.out.print("�Է�: ");
	String input = sc.next();
	
//	int count =0;
//	
//	while (input.indexOf('a') >=0) 
//	{input=input.substring(input.indexOf('a')+1);
//	count++;}
//	
//	System.out.print("a�� ���� :" + count);
//	
	
	
	int count =0;
	
	for(int i = 0; i < input.length();i++) {
		
		
		//a�� ã�Ƴ� ������ ī��Ʈ�� ����
		if(input.charAt(i)=='a') 
		{count++;}
	}	
	System.out.println("a�� ����: " + count);   
































	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//main
}
