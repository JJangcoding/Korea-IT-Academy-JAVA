package ex3_method;

public class Method1 {
	
	//�޼����� ���� �� ����
	
	public void test1() {
		System.out.println("�ȳ��ϼ���");
	}
	
	public void test2(int n) {
		//��ȯ���� void�� �ƴ� ���, �������� �ݵ��
		//return���� ���ԵǾ� �־���Ѵ�.
		
		
		n++;
		System.out.println("n : "+ n);
	   
		
		//return���� �ݵ�� ��ȯ�� Ÿ�԰� �����ش�. (ex.int)
		//return 1;
	    //void�� �޸� �ٸ� ��ȯ���� ���ϰ��� ������ ���ư���.
	
	
	}
	
	public String test3(String s, int n ) {//��ȯ���� void�� �ƴϹǷ� ���� �ʼ�!!!!
		String str = "���� "+ s + "�̰� , " + n + "�� �Դϴ�";
	return str;
	}
	
	
	
	

}
