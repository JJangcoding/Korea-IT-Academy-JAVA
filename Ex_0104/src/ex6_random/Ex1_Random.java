package ex6_random;

import java.util.Random;

public class Ex1_Random {
 public static void main(String[] args) {

	 //������ ������ִ� Ŭ���� Random
	 Random rnd = new Random();                    //��Ʈ�� ����Ʈ ������O  => import ����Ű 
	 
	 //1 ~ 3 ������ ����
	 //rnd.nextInt(������ ����) + ���ۼ�;  => ���� = ����
	 //������ ���� ��� ���� : ���� - ���ۼ� + 1
	 int num = rnd.nextInt(3) + 1;
	 System.out.println(num);
	 
	 System.out.println("-------------------------------------------------------------");
	 
	 //���� : ���� ����
	 
	 int alphabet = rnd.nextInt('Z'-'A'+1) + 'A';
	 System.out.println((char)alphabet);
			 
	 
	 
	 
	 
	 
}//main
}
