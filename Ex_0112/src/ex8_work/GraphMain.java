package ex8_work;

import java.util.Random;

public class GraphMain {
public static void main(String[] args) {
	// 0 ���� 9������ ������ 100�� ���� ���� (100���� ������. ������ ��������!!)
	// ������ ������ �Ǵ��Ͽ���
	// 0�� ����: ###### 6
	// 1�� ����: ######### 9
	//   ...
	// 9�� ����: #### 4
	
	
	Random rnd = new Random();
	int [] arr = new int [100];
	
	for(int i=0;i<arr.length;i++)
	{arr[i] = rnd.nextInt(10);}  
	
	Count function= new Count();
	function.getCount(arr);
	
	/* 
	
	int[] nArr = new int[10]; (0�� ����� 9������� �� ������ ������ ��� ���� �ִ�.)
	for(int i = 0; i <100; i++){
	int r = rnd.nextInt(10);
	system.out. print(r)
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
}//main
	
	
	
	
	
	
	
	
	
	
	
	
}
