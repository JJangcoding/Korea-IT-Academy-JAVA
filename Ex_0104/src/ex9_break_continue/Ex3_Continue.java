package ex9_break_continue;

public class Ex3_Continue {
public static void main(String[] args) {

	
	
	//continue문 : 반복문 내에서 특정 문장을 무시하고 건너뛰고자 할 때 사용되는 키워드
	
	for (int i = 1; i <=2; i++) {
		for (int j = 1; j <=5; j++) {
			
			//j++ => 의도적으로 증감식을 여기에 쓰면 조건식으로 건너 뛴다.
			if (j % 2 == 0) {
				continue;//가장 가까운 for문 식으로 올라간다 (건너뛰고)
				//continue 밑은 그 어떠한 코드도 추가될 수 없다.
			}
			
		
			System.out.printf("%d " , j);
		}
		
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}//main
}
