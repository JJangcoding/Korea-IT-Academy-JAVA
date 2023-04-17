package ex9_break_continue;

public class Ex1_Break {public static void main(String[] args) {
	
	//break문 : 반복문 내에서 강제적으로 가장 가까운 반복문을 빠져나갈 때 사용하는 키워드
	for( int i = 1; i <=2; i++) {
		
		for (int j = 1; j <=10; j++) {
			
			if (j%2==0) { 
				//가장 가까운 반복문을 탈출 (break를 포장하고 있는 문장) => 2행 10열짜리 결과가 안나옴
				break;
				//브레이크 밑쪽에 그 어떠한 코드도 등록할 수 없다.
			}
			
			System.out.printf("%d ", j);
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
}//main

}
