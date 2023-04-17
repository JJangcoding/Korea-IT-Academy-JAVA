package ex9_break_continue;

public class Ex4_Continue {
	public static void main(String[] args) {
		
		
		
		int n = 0;
		while (n<5) {
			
			n++;
			if (n%2 ==0) {
				continue;//while문 안에서의 continue는 조건식으로 건너뛴다
			}
			
		    System.out.println(n);
		
		
		}
		
		
		int num =0;
		for(num = 0; num <3; num++) {
		switch (num) {
		case 0:
			System.out.println("0");
			continue;//switch문을 반복문으로 감싸면 continue 사용가능하다.!!!
			
		case 1:
			System.out.println("1");
			continue;

		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
