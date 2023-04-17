package ex1_vending;

public class Vending {

	private int money;
	private Can[] can = new Can[5];

	public Vending() {

		can[0] = new Can("fanta", 1000);
		can[1] = new Can("cider", 1100);
		can[2] = new Can("coke", 1200);
		can[3] = new Can("hotsix", 1300);
		can[4] = new Can("orange", 1400);

	}

	//사용자가 투입한 금액 범위의 음료만 노출
	public void showCans( int money ) {
		this.money = money;

		for( int i = 0; i < can.length; i++ ) {

			if( can[i].getPrice() <= money ) {
				System.out.printf("%s - %d원\n", 
						can[i].getCanName(), can[i].getPrice());
			}

		}//for
	}

	//음료제공 및 잔돈 반환
	public int outCan( String name ) {

		for( int i = 0; i < can.length; i++ ) {

			if( can[i].getPrice() <= money ) {

				if( can[i].getCanName().equalsIgnoreCase(name) ) {
					System.out.printf("%s을(를) 선택했습니다.\n", name);
					money -= can[i].getPrice();
					System.out.printf("잔액 : %d원\n", money);
					break;
				}
				
			}else {
				System.out.println("금액이 부족합니다");
				return money;
			}
			
		}//for
		
		return money;
	}//outCan()

}

















