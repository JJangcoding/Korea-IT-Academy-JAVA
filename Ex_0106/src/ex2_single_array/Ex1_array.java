package ex2_single_array;

public class Ex1_array {

	
	public static void main(String[] args) {
		
		
		//배열: "같은 자료형" 끼리 모아둔 하나의 묶음
		//효율적인 자료관리를 위해 "반드시" 알고 있어야 하는 개념
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		// => 비효율적 => 배열이 존재하는 이유
		
		//1)배열 선언
		int [] arr;
		
		//2)배열 생성
		arr = new int[4];// new - 스택이 아닌 힙 메모리에 할당. 인덱스는 0번부터 시작. 인덱스는 배열 요소 수 -1개이다.
		                 // arr[인덱스]= 값;  arr = 자료형 일치해야한다.[요소 수] 요소 수 변경 불가능
		//3)초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		//배열에 존재하지 않는 인덱스에는 값을 추가하거나 가져다 쓸 수 없다. 변수가 통일 되는 장점
		
		System.out.println("20필요해 : " + arr[1]);
		
		System.out.println("----------------------------------------------");
		// i < 인덱스 +1(요소수)
		for (int i = 0; i < arr.length; i++) {//arr.length => 배열의 요소 갯수
			arr[i]=(i+1)*100; //=>규칙성 있는 값을 배열에 넣을 때	
			System.out.println(arr[i]);
			
		}		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	}//main	
	
}
