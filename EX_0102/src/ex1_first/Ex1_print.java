package ex1_first;

public class Ex1_print {

	public static void main( String[] args) {
		//�ּ�: �����Ͻ� JVM�� �������� ���ϴ� �޸� �뵵�� �ؽ�Ʈ ����
		//main�޼���: �����Ͻ� ���� ���� ȣ��Ǵ� ����
		System.out.println(100); // <-- ������ ������ �ݵ�� ;(�����ݷ�)���� ����������!!
		System.out.println(200);
		
		System.out.println("�ȳ��ϼ���"); // ������ �Է��ϰ��� �Ҷ��� �ֵ���ǥ�� ����ؾ� �Ѵ�.
		
		System.out.println(10+10); // ������ �ذ���� ����
		System.out.println(10*10);
		
		System.out.println("10*10"); // ���ڷ� �νĵ�
		System.out.println("10*10 = " + 10*10); // ���ϱ� ��ȣ�� ���� ��(""�ֵ���ǥ)�� ���� �� �̾� �ٿ��ش�.
		System.out.println("5 + 1 = " + 5 + 1 ); // 5+1 = 51 (����� ���ϱ�� �ڸ� ���� �̾� ���̱�� ó���Ѵ�.
	    System.out.println("5-1 = " + (5-1)); // ��ȣ ���� ó��!!
	    System.out.println(1+1+ "1+1 = " +1 +1); //*,-�� ����� �Բ� ó�� XXX
		
		
	}
	
}
