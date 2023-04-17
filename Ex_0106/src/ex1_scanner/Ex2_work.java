package ex1_scanner;

import java.util.Scanner;

public class Ex2_work {
public static void main(String[] args) {
	
	//키보드에서 n1과 n2변수에 각각 정수값을 입력받는다
	//n1부터 n2까지의 합을 출력. ~~ n1과 n2중 숫자가 뭐가 더 커도 노상관.
	
	Scanner sc = new Scanner(System.in);
	System.out.print("수1 : ");
	int num1 = sc.nextInt();
	
	System.out.print("수2 : ");
	int num2 = sc.nextInt();
	
	int sum = 0;
	
	//변수간의 값 교환 !!!!!!!!
	
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
