package ex8_work;

import java.util.Random;

public class GraphMain {
public static void main(String[] args) {
	// 0 에서 9사이의 난수를 100개 만들어서 저장 (100개를 보내고. 갯수를 돌려받자!!)
	// 각각의 갯수를 판단하여라
	// 0의 갯수: ###### 6
	// 1의 갯수: ######### 9
	//   ...
	// 9의 갯수: #### 4
	
	
	Random rnd = new Random();
	int [] arr = new int [100];
	
	for(int i=0;i<arr.length;i++)
	{arr[i] = rnd.nextInt(10);}  
	
	Count function= new Count();
	function.getCount(arr);
	
	/* 
	
	int[] nArr = new int[10]; (0번 방부터 9번방까지 각 숫자의 갯수가 담긴 값이 있다.)
	for(int i = 0; i <100; i++){
	int r = rnd.nextInt(10);
	system.out. print(r)
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
}//main
	
	
	
	
	
	
	
	
	
	
	
	
}
