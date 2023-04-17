package ex9_break_continue;

public class Ex6_label {
 public static void main(String[] args) {
	
 label : for (int i = 1; i <= 3; i++) {//레이블의 증감식으로 continue문이 적용된다 & 엔터문을 만날일이 없다.!!
		 for (int j = 1; j <= 5; j++) {
			
			
			if(j%2 ==0) {
				continue label;
				
			}
			
			System.out.printf("%d ",j);
			
			
		}System.out.println();
			
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}//main
	
	
}
