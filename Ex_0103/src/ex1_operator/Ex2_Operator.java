package ex1_operator;

public class Ex2_Operator {
	
	public static void main(String[] args) {
		
		//�� ������
		//���� ���ؼ� ���� ������ �Ǵ��ϴ� ������
		int n1 = 10;
		int n2 = 20;
		boolean res = n1<n2;
		System.out.println("n1 < n2 : " + res);
		
		res = n1 >= n2;
		System.out.println("n1 >= n2 : " + res );
		
		res = n1 == n2; // ���ٴ� ������ 
		System.out.println("n1 == n2 : " + res);
        
		res = n1 != n2; // ���� �ʴٴ� ������
        System.out.println("n1 != n2 : " + res);	
        
        
        //�� ������
        //�� �����ڸ� ���� ������ �� �� �̻� �ʿ��� �� ���
        int age = 30; 
        int limit = 35;
		// t && t = t
        // t && f = f
        // f && t = f
        // f && f = f
        // && �����ڴ� ���� ������ �����̸� ���� ������ �������� �ʴ´�.
        
        res = (limit - age) >= 5   &&     age > 30;
        System.out.println("&& : " + res);
     
        int i1 = 10;
        int i2 = 20;
        // t || t = t
        // t || f = t
        // f || t = t
        // f || f = f
        // || �����ڴ� ���� ������ ���̸� ���� ������ �������� �ʴ´�.
        res = (i1 += 10) > 20 || i2 - 10 == 11;
        System.out.println("||����: " + res); 
        
        //not ������: ���� �������� ������ ������ �ٲ��ִ� ������ (���������� ����. ���� �������� ���� �ȴ�.)
        System.out.println("!������ :" + !res );
        	
	}

}
