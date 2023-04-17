package ex7_work;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		
		//수1,수2, 연산자를 Calculator의 getResult()메서드로 전달하여 결과를 출력하시오.
		
		//수1: 5
		//수2: 10
		//연산자 : +
		//5 + 10 = 15
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 : ");
		String cal = sc.next();
		
		Calculator function = new Calculator();
		function.getResult(num1,num2,cal);
		
		
	}
}
