package ex7_while;

import java.util.Random;

public class Ex2_do_while {
public static void main(String[] args) {
	
	//do-while: ��ó��, �ĺ� => �ּ� �ѹ��� ����� �Ѵ�.
	//����� �� �����ϰ� ;���� ���ξ�� �Ѵ�
	//do {
	//���ǽ��� ���� �� ����Ǵ� ����
	//}while(���ǽ�);
	
	int i =11;
	
	do {
		System.out.println(i);
		//i++;
		
	} while (i<=10);
	
	System.out.println("-------------------------------------------------------");
	
	//���� java, jsp, android�� ��������
	//0~130������ ���� ��´�
	// �������� ������ ��� 0~100���� �϶��� ���� ���� ������ ���
	 Random rnd = new Random();
	
	 int java= 0;
     int jsp = 0;
     int android = 0;
	 
			do {
			    java = rnd.nextInt(131)+0;
				jsp = rnd.nextInt(131)+0;
				android = rnd.nextInt(131)+0;
				
			
		} while (java > 100 || jsp>100 || android >100);
			System.out.println("�ڹ�: " +java);
			System.out.println("jsp: " +jsp);
			System.out.println("�ȵ�: "  + android);
					
			
			
			
	}

			
	
	
	
	
	
	
	
	
	
	
} //main

