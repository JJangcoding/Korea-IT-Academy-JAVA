package ex2_coin;

import java.util.Random;
import java.util.Scanner;

public class Ex1_coin {
	public static void main(String[] args) {
		//���� money�� 10~5000������ ������ ����� �ִ´�.
	    //��, 1�� �ڸ� ���ڴ� �ݵ�� 0���� ��������� �Ѵ�.
		//�߻��� ���� money�� �������� �ٲ��� ��,
		//500��, 100��, 50��, 10��¥�� ������ ���� �� �� �Ž��������� �Ǵ��ϴ� �ڵ带 ����
		//��, ������ �� ���� ���� �������� �Ž��� �ٰ�.
		
		//�ݾ�: 2590
		//500: 5
		//50: 1
		//10: 4
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int money=0;
		int coin1, coin2, coin3,coin4;
		
		coin1= 500;
		coin2= 100;
		coin3= 50;
		coin4= 10;
		
		int[] coin = {500,100,50,10};
		
		do { money= rnd.nextInt(4991) + 10;
		    			
		} while (money%10!=0);
		
		System.out.println(money + "��");
		
	    System.out.println("500�� :" + money/coin1 + "�� \t " 
	                 + "100��: " +(money%coin1)/coin2 + "�� \t "
			         + "50��: " +((money%coin1)%coin2)/coin3 + "�� \t" 
	                 + "10��: " + (((money%coin1)%coin2)%coin3)/coin4 + "�� \t");
	    
	    System.out.println("------------------------------------------------------------");
	    
	    for(int i = 0; i<coin.length;i++) {
	    	int res = money/ coin[i];
	    	
	    	if(res>0 ) {
	    		System.out.printf("%d��  : %d\n", coin[i],res);
	    		money %=coin[i];
	    	}
	    }
		
		
	
		
		
		
		
		
	}// main

}
