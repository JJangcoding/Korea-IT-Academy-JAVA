package ex2_coin;

import java.util.Random;
import java.util.Scanner;

public class Ex1_coin {
	public static void main(String[] args) {
		//변수 money에 10~5000까지의 난수를 만들어 넣는다.
	    //단, 1의 자리 숫자는 반드시 0으로 만들어져야 한다.
		//발생된 난수 money를 동전으로 바꿨을 때,
		//500원, 100원, 50원, 10원짜리 동전이 각각 몇 개 거슬러지는지 판단하는 코드를 구현
		//단, 가능한 한 적은 수의 동전으로 거슬러 줄것.
		
		//금액: 2590
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
		
		System.out.println(money + "원");
		
	    System.out.println("500원 :" + money/coin1 + "개 \t " 
	                 + "100원: " +(money%coin1)/coin2 + "개 \t "
			         + "50원: " +((money%coin1)%coin2)/coin3 + "개 \t" 
	                 + "10원: " + (((money%coin1)%coin2)%coin3)/coin4 + "개 \t");
	    
	    System.out.println("------------------------------------------------------------");
	    
	    for(int i = 0; i<coin.length;i++) {
	    	int res = money/ coin[i];
	    	
	    	if(res>0 ) {
	    		System.out.printf("%d원  : %d\n", coin[i],res);
	    		money %=coin[i];
	    	}
	    }
		
		
	
		
		
		
		
		
	}// main

}
