package ex5_printf;

public class Ex2_work {
public static void main(String[] args) {
	
	int dan = 5;
	
	if (dan>=2 && dan <= 9) {
				
	for (int i = 1; i <= 9; i++) {
			System.out.printf(" %d * %d = %d\n", dan,i, dan*i );
			}
			
		}else {System.out.println("2~9사이의 값만 입력해주세요");}	
}				
				
	
}//main

