package ex5_work;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
		//키보드에서 금액을 입력받고
		//해당 금액 범위안에서 마실수 있는 음료의 목록만 화면에 출력
		//음료를 선택하면 제공 및 잔액을 반환
		
		//insert coin: 키보드에서 값을 받는다. ex 1000원
		//1000원으로 사먹을 수 있는 음료수의 이름만 보여줘!!
		//coke - 1000
		//sider- 900
		//fanta -1000
		//>>coke
		//coke (을)를 선택하셨습니다
		//잔액 : 100원
		
		
		
		Scanner sc = new Scanner(System.in);
		Vending ven = new Vending();
		ven.canInit();
		
		System.out.print("insert coin : " );
		int money = sc.nextInt();
		
		ven.showCans(money);
		
		System.out.print(">>");
		String select = sc.next();//음료수 이름 입력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
