package ex3_work;

public class Ex1_work {
	public static void main(String[] args) {

		// ����� ������ ���ٷ� ǥ���� �� �ִ�.
		// arr���� ���� ���

		// ����� ������ �ʱ�ȭ���� �� �ٷ� ����
		// ����� ������ ���ٷ� ǥ���� �� �ִ�.
		// int[] arr = {10,24,7,16,10};
		int[] arr = new int[5];

		arr[0] = 10;
		arr[1] = 24;
		arr[2] = 7;
		arr[3] = 16;
		arr[4] = 10;

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}
		System.out.println(sum);

	
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
		char[] cArr= {'j', 'A', 'V', 'A'};
		//char[] cArr = nes char[4];
		//cArr[0] = 'j';
		//.......
		
		//for (int i = 0; i < cArr.length; i++) {
			//System.out.println(cArr[i]);
			
		//������ roof(���� for��..) i���� ��� ����(if) ��� �Ұ���  => ��� ���뿡 �����ϰ��� �ϴ� �������� �������
        for (char c : cArr)	{
        	System.out.println(c);
        }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main

}
