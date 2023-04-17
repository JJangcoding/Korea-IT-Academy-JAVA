package ex2_string;

import java.util.Scanner;

public class Ex2_work {
public static void main(String[] args) {
	//키보드에서 아무값이나 입력받고 소문자 a의 갯수를 출력!!!!
	
	//입력: aljsdfjlasdfjlsdafjklkasdjf
	//a의 갯수 : 
	
	Scanner sc = new Scanner(System.in);
	System.out.print("입력: ");
	String input = sc.next();
	
//	int count =0;
//	
//	while (input.indexOf('a') >=0) 
//	{input=input.substring(input.indexOf('a')+1);
//	count++;}
//	
//	System.out.print("a의 갯수 :" + count);
//	
	
	
	int count =0;
	
	for(int i = 0; i < input.length();i++) {
		
		
		//a를 찾아낼 때마다 카운트를 증가
		if(input.charAt(i)=='a') 
		{count++;}
	}	
	System.out.println("a의 갯수: " + count);   
































	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//main
}
