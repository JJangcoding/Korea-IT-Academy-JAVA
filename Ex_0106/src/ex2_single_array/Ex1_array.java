package ex2_single_array;

public class Ex1_array {

	
	public static void main(String[] args) {
		
		
		//�迭: "���� �ڷ���" ���� ��Ƶ� �ϳ��� ����
		//ȿ������ �ڷ������ ���� "�ݵ��" �˰� �־�� �ϴ� ����
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		// => ��ȿ���� => �迭�� �����ϴ� ����
		
		//1)�迭 ����
		int [] arr;
		
		//2)�迭 ����
		arr = new int[4];// new - ������ �ƴ� �� �޸𸮿� �Ҵ�. �ε����� 0������ ����. �ε����� �迭 ��� �� -1���̴�.
		                 // arr[�ε���]= ��;  arr = �ڷ��� ��ġ�ؾ��Ѵ�.[��� ��] ��� �� ���� �Ұ���
		//3)�ʱ�ȭ
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		//�迭�� �������� �ʴ� �ε������� ���� �߰��ϰų� ������ �� �� ����. ������ ���� �Ǵ� ����
		
		System.out.println("20�ʿ��� : " + arr[1]);
		
		System.out.println("----------------------------------------------");
		// i < �ε��� +1(��Ҽ�)
		for (int i = 0; i < arr.length; i++) {//arr.length => �迭�� ��� ����
			arr[i]=(i+1)*100; //=>��Ģ�� �ִ� ���� �迭�� ���� ��	
			System.out.println(arr[i]);
			
		}		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	}//main	
	
}
