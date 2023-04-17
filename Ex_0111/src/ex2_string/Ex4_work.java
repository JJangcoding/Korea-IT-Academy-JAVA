package ex2_string;

import java.util.Scanner;

public class Ex4_work {

	public static void main(String[] args) {

		String[][] actor = { { "[song]", "박쥐", "괴물", "관상" }, { "[lee]", "백두산", "내부자들", "광해" },
				{ "[ryu]", "올빼미", "럭키", "타짜" } };

		// 검색할 배우 : song
		// [song]
		// 박쥐
		// 괴물
		// 관상
		// ===================================== 검색이 올바르게 된 경우

		// 검색할 배우 : park
		// 해당 배우가 없습니다.
		// ===================================== 검색결과 없는 경우

		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 배우 : ");
		String Str = sc.next();

//		if (Str.equalsIgnoreCase(actor[0][0].substring(1, 5))) {
//
//			System.out.println(actor[0][0]);
//			System.out.println(actor[0][1]);
//			System.out.println(actor[0][2]);
//			System.out.println(actor[0][3]);
//            
//		}
//
//		else if (Str.equalsIgnoreCase(actor[1][0].substring(1, 4))) {
//
//			System.out.println(actor[1][0]);
//			System.out.println(actor[1][1]);
//			System.out.println(actor[1][2]);
//			System.out.println(actor[1][3]);
//
//		}
//
//		else if (Str.equalsIgnoreCase(actor[2][0].substring(1, 4))) {
//
//			System.out.println(actor[2][0]);
//			System.out.println(actor[2][1]);
//			System.out.println(actor[2][2]);
//			System.out.println(actor[2][3]);
//
//		}
//
//		else {
//			System.out.println("해당 배우가 없습니다.");
//		}


//		------------------------------------------------------------------------
//		if (Str.equalsIgnoreCase(actor[0][0].substring(1, 5))) {
//
//			for (int i = 0; i < 4; i++) {
//				System.out.println(actor[0][i]);
//				
//			}
//            
//		}
//
//		else if (Str.equalsIgnoreCase(actor[1][0].substring(1, 4))) {
//
//			for (int i = 0; i < 4; i++) {
//				System.out.println(actor[1][i]);
//				
//			}
//
//		}
//
//		else if (Str.equalsIgnoreCase(actor[2][0].substring(1, 4))) {
//
//			for (int i = 0; i < 4; i++) {
//				System.out.println(actor[2][i]);
//				
//			}
//
//		}
//
//		else {
//			System.out.println("해당 배우가 없습니다.");
//		}
	

		//length 배열에서 쓰는것은 소괄호를 안씀. (메서드 아님.)
  
		int cnt = 0;
		
		for(int i =0; i <actor.length;i++) {
		if(actor[i][0].equalsIgnoreCase("[" +Str+ "]")) {
			
			for(int j = 0; j< actor[i].length;) {
				
				System.out.println(actor[i][j]);
				
			}//innter
			
			}else {
				cnt++;
				
				if(cnt == actor.length)
				{System.out.println("해당 배우의 이력이 등록되어 있지 않습니다.");}
			}
			
		
		
  }//outer
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}// main

}
