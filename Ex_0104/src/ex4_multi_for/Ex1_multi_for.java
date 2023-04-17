package ex4_multi_for;

public class Ex1_multi_for {
public static void main(String[] args) {
	
	//다중 for문: for문 안에 for문이 추가되어 있는 경우 (i,j,k.....) => 1. 바깥 for문 한번 실행 2. 안쪽 for문 풀실행 3. 안쪽 for문 두번째 실행
	//123
	//123
	for (int i=1; i<=3; i++) { //행(Y)축 결정
		
		for(int j=1;j<=5; j ++) { //열 (X)축 결정
			
			System.out.print(j + " "); // print vs println (줄바꿈)
		}//inner
	
	       System.out.println(); //안쪽 for문 끝나고 적용되는 엔터 값
	
	
	}//outer
	
	System.out.println("-------------------------------------------------------");
	
	///123
	///456
	///789
    int k = 1;
	for (int i = 1; i <= 3; i++) {
		for (int j = 1; j <= 3; j++) {
			System.out.print(k++ + " ");
		}
	        System.out.println();	
	}
	  
	  System.out.println("-------------------------------------------------------");
	  
	  
	  char l = 'A'; // 아스키 코드를 굳이 찾을 필요가 없다.
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(l++ + " ");
			}
		        System.out.println();	
		}
	
	
	
	
	
	
	
	
	
}//main
}
