package ex1_multi_array;

public class Ex1_multi_array {
	public static void main(String[] args) {
		
	//다차원 배열 =>대괄호의 갯수가 차원을 결정한다. => 큰방(행) 2개에 각각 작은방(열) 3개씩 =>큰방, 작은방을  모두 선택해서 값을 넣어야 된다. => 방 증축 불가능
    //1차원 배열이 2개 모이면 2차원 배열   =>2중 for문으로 출력해야한다.(모든 값을 보고싶다면)
    //1차원 배열이 3개 모이면 3차원 배열   => 큰방 속에 중간방 속에 작은방이 있다. => 값은 작은 방에만 넣을 수 있다. (큰방, 중간방 불가능)[][][]
		
	int[][] test = new int[2][3];
	
	test[0][0] = 10;
	test[0][1] = 20;
	test[0][2] = 30;
	
	test[1][0]= 40;
	test[1][1]= 50;
	test[1][2]= 60;
	
	System.out.println(test[1][1]);
	
	System.out.println("--------------------------------------------------------------------");
	
	//2차원 배열 test의 모든 값을 출력해보자!!!!!
	//test.length => 큰 방의 갯수
	//test[i].length => 작은 방의 갯수  => 작은 방의 갯수는 모두 다를 수 있으므로 숫자를 넣지 않는다!!!!
	
	for (int i = 0; i < test.length; i++) {
		for (int j = 0; j < test[i].length; j++) {	
		
			System.out.printf("%d ", test[i][j]);
		}//inner
		
		System.out.println();
	}//outer
	
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}//main

}
