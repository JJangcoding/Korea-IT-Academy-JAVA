package ex3_account;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		
		Atm atm = new Atm();
		int money = 0;
		Scanner sc = new Scanner(System.in);
		
	out:	while(true) {
			
			System.out.println("1. 입      금 : ");
			System.out.println("2. 출      금 : ");
			System.out.println("3. 잔액확인 : ");
			System.out.println("etx.종    료 : ");
			System.out.print(">>  ");
		    int select = sc.nextInt();
			
		    switch(select) {
		    
		    case 1:
		    	System.out.println("----------입금----------");
		    	System.out.print("입금액 : ");
		    	money = sc.nextInt();
		    	atm.deposit(money);
		    	break;
		    
		    case 2:
		    	System.out.println("----------출금----------");
		    	System.out.print("출금액 : ");
		    	money = sc.nextInt();
		    	atm.withdraw(money);
		    	break;
		    	
		    case 3:
		    	System.out.println("-----잔액------");
		    	atm.showMoney();		    	 	
		       break;
		    	
		   default:
			   System.out.println("atm을 종료합니다");
		       break out;
		    }
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
