package ex8_work;

public class Ex8_work {
public static void main(String[] args) {
	//2�� for���� ����Ͽ� �� 1 ~5�� ��� 
	 
	for (int i = 1; i <= 5; i++) { //���η� 5��
		 for (int j =1;j<=i ;j++ ) {			 
		 System.out.print("* ");}
		 System.out.println();		
	}
	 
	
	
	
	
		 
		 System.out.println("----------------------------------------------------");
		 
		 
		 
		 
		 
		 // �Ƕ�̵��� 1 3 5 7 9

	    for (int i = 0; i<5; i++) {
	    	 
	    	for (int j = 0; j<i+5; j++) {
	    		if (i+j > 3) {
	    			System.out.print("*");
	    		}else {
	    			System.out.print(" ");
	    		
	    		}
	    		
	    	}
	    System.out.println();}
	    		
System.out.println("--------------------------------------------------------------------------------");
	           
	              for (int k =3; k >=0; k--) {
	        	   
	        	   for (int j = 0 ; j <5+k; j++) {
	        	   if(k+j >3) {
	        		   System.out.print("*");
	        	   }else {
	        		   System.out.print(" ");
	        	   }
	        	 }System.out.println();
	        	 
	              }
	              
	    }

}
	        	   
	        	   
	           
