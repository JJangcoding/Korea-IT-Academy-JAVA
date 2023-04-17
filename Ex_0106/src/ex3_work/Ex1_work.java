package ex3_work;

public class Ex1_work {
	public static void main(String[] args) {

		// 선언과 생성을 한줄로 표기할 수 있다.
		// arr값의 합을 출력

		// 선언과 생성과 초기화까지 한 줄로 가능
		// 선언과 생성을 한줄로 표기할 수 있다.
		// int[] arr = {10,24,7,16,10};
		int[] arr = new int[5];

		arr[0] = 10;
		arr[1] = 24;
		arr[2] = 7;
		arr[3] = 16;
		arr[4] = 10;

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}
		System.out.println(sum);

	
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
		char[] cArr= {'j', 'A', 'V', 'A'};
		//char[] cArr = nes char[4];
		//cArr[0] = 'j';
		//.......
		
		//for (int i = 0; i < cArr.length; i++) {
			//System.out.println(cArr[i]);
			
		//개선된 roof(향상된 for문..) i값이 없어서 제어(if) 사용 불가능  => 모든 내용에 접근하고자 하는 목적으로 만들어짐
        for (char c : cArr)	{
        	System.out.println(c);
        }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main

}
