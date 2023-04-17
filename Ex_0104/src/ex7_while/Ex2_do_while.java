package ex7_while;

import java.util.Random;

public class Ex2_do_while {
public static void main(String[] args) {
	
	//do-while: 선처리, 후비교 => 최소 한번은 출력을 한다.
	//제어문들 중 유일하게 ;으로 끝맺어야 한다
	//do {
	//조건식이 참일 때 실행되는 영역
	//}while(조건식);
	
	int i =11;
	
	do {
		System.out.println(i);
		//i++;
		
	} while (i<=10);
	
	System.out.println("-------------------------------------------------------");
	
	//변수 java, jsp, android에 랜덤으로
	//0~130사이의 값을 담는다
	// 세과목의 점수가 모두 0~100사이 일때만 과목별 랜덤 성적을 출력
	 Random rnd = new Random();
	
	 int java= 0;
     int jsp = 0;
     int android = 0;
	 
			do {
			    java = rnd.nextInt(131)+0;
				jsp = rnd.nextInt(131)+0;
				android = rnd.nextInt(131)+0;
				
			
		} while (java > 100 || jsp>100 || android >100);
			System.out.println("자바: " +java);
			System.out.println("jsp: " +jsp);
			System.out.println("안드: "  + android);
					
			
			
			
	}

			
	
	
	
	
	
	
	
	
	
	
} //main

