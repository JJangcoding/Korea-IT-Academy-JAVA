package ex3_work;

public class Ex2_work {
	public static void main(String[] args) {

//최댓값 구하기
//		int[] arr = new int[6];
//		arr[0] = 4;
//		arr[1] = 13;
//		arr[2] = 7;
//		arr[3] = 19;
//		arr[4] = 1;
//		arr[5] = 15;
// 컨트롤 / => 전체 주석처리
		
		int[] arr = {4,13,7,19,1,15};
		int max = arr[0];  // max = 4
		
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
			}
			
			
			
			
		}System.out.println("가장 큰 값: " + max);
		
		System.out.println("---------------------------------------------------------");
		
		//작은 숫자부터 큰 숫자로 오름차순 정렬
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i; j < arr.length; j++) {
			
			if(arr[j] < arr[i] ) {
				int tmp= arr[i];
				arr[i] = arr[j];
				arr[j]=tmp;
			 }
						
			}
		}
				
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");}
		
		
		
		
		
		
		// for문 1개

	}// main

	}
