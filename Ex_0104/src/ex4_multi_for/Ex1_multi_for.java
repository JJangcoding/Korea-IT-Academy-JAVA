package ex4_multi_for;

public class Ex1_multi_for {
public static void main(String[] args) {
	
	//���� for��: for�� �ȿ� for���� �߰��Ǿ� �ִ� ��� (i,j,k.....) => 1. �ٱ� for�� �ѹ� ���� 2. ���� for�� Ǯ���� 3. ���� for�� �ι�° ����
	//123
	//123
	for (int i=1; i<=3; i++) { //��(Y)�� ����
		
		for(int j=1;j<=5; j ++) { //�� (X)�� ����
			
			System.out.print(j + " "); // print vs println (�ٹٲ�)
		}//inner
	
	       System.out.println(); //���� for�� ������ ����Ǵ� ���� ��
	
	
	}//outer
	
	System.out.println("-------------------------------------------------------");
	
	///123
	///456
	///789
    int k = 1;
	for (int i = 1; i <= 3; i++) {
		for (int j = 1; j <= 3; j++) {
			System.out.print(k++ + " ");
		}
	        System.out.println();	
	}
	  
	  System.out.println("-------------------------------------------------------");
	  
	  
	  char l = 'A'; // �ƽ�Ű �ڵ带 ���� ã�� �ʿ䰡 ����.
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(l++ + " ");
			}
		        System.out.println();	
		}
	
	
	
	
	
	
	
	
	
}//main
}
