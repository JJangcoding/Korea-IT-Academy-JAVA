package ex8_work;

public class Ex9_2work {

	public static void main(String[] args) {
		
		//2�� for���� ����Ͽ� �Ʒ��� ����� �����Ͻÿ�
		
		//1 2 3 ....10
		//2 3 4 ....1
		//
		//10 1 2 ...9
		
		
		
	    
		
		for (int i = 1; i <= 10; i++) {
			
	    for (int j = 0; j<10; j++) {
	
	    	int num = i +j;
		
		if (num>10) {
			num -=10;
			}
		System.out.print(num + " "); 
		}
	    System.out.println();
	    }
	
		System.out.println("-------------------------------------------------");
		// 1���� n������ �� ���� ����Ͻÿ�
	
		int number = 3;
		int sum = 0;
		for (int i=1; i <=number; i++) {
			sum += i;
			}System.out.println(sum);
		
			
			
		
		
		
		
		
		
		
	}
}
