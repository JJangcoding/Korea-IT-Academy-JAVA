package ex3_account;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		
		Atm atm = new Atm();
		int money = 0;
		Scanner sc = new Scanner(System.in);
		
	out:	while(true) {
			
			System.out.println("1. ��      �� : ");
			System.out.println("2. ��      �� : ");
			System.out.println("3. �ܾ�Ȯ�� : ");
			System.out.println("etx.��    �� : ");
			System.out.print(">>  ");
		    int select = sc.nextInt();
			
		    switch(select) {
		    
		    case 1:
		    	System.out.println("----------�Ա�----------");
		    	System.out.print("�Աݾ� : ");
		    	money = sc.nextInt();
		    	atm.deposit(money);
		    	break;
		    
		    case 2:
		    	System.out.println("----------���----------");
		    	System.out.print("��ݾ� : ");
		    	money = sc.nextInt();
		    	atm.withdraw(money);
		    	break;
		    	
		    case 3:
		    	System.out.println("-----�ܾ�------");
		    	atm.showMoney();		    	 	
		       break;
		    	
		   default:
			   System.out.println("atm�� �����մϴ�");
		       break out;
		    }
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
