package ex1_scanner;

import java.util.Scanner; //스캐너 임포트 필수 !!!!!! 

public class Ex1_Scanner {
	public static void main(String[] args) {
		
	
	//키보드에서 값을 입력받을 수 있도록 해주는 클래스
	Scanner	sc = new Scanner(System.in);//필수!!!!!!!
		
	System.out.print("정수 : ");// 입력창 바로옆에 출력받으려면 prinln말고 print를 쓰자!!!
	int num = sc.nextInt();//입력받은 값을 출력  => A는 금지
	System.out.println("입력받은 값 : " + num);
	
	System.out.print("문장 : ");
	String str = sc.next();//정수 123이 아닌 문장 123을 받는다.
	System.out.println("결과 : " + str );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}//main
	
	
	

}
