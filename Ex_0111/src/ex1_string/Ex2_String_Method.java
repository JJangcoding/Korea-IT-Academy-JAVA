package ex1_string;

public class Ex2_String_Method {
	public static void main(String[] args) {
	
		//StringŬ������ �޼���(���)��
		//�޼���� � �۾��� �����ϱ� ���� ��ɹ����� ����. 
		//�ݵ�� �Ұ�ȣ�� ������ �ִ�.
		//�ݺ������� ���Ǵ� �ڵ带 ���̱� ���� ���� ���.		
		// https://docs.oracle.com/javase/8/docs/api/overview-summary.html => �޼��� ����
		
		
		String name= "Hong Gil Dong";
		int len = name.length(); // ()�ȿ� Ŀ���� �ű�� ��Ʈ�� �����̽��� �ϸ� ��ȯ ���� ������ �˷��ش�.!!!!
		System.out.println("������ ���� : " + len);// ���� ���� ���ڼ� ��� => �����ϰ� 1���� ����� �����ϴ� �޼���
		
		int index = name.indexOf('o');
		System.out.println("�� ù��° o�� ��ġ: " +index);//0���� ��� ����
		
		index = name.lastIndexOf('o');
		System.out.println("�� ���� o�� ��ġ : " + index);
		
		char c = name.charAt(5);//() �ȿ� ���� �־�� �ϸ� ��ȣ ���� ��Ģ�� ���Ѿ� �Ѵ�. vs �ȳ־ �Ǵµ� ������ ������ �߻��Ѵ�.
		System.out.println("������ ���� : " + c);//�ε����� �ش��ϴ� �ѱ��ڸ� ������.
		
		String s1 = name.substring(5);
		System.out.println(s1); //�ش� �ε��������� ���� (���� ��������)
		
		s1 = name.substring(5,10);
		System.out.println(s1);//���� -1 �ε������� ����!!!!!!!!!!
		
		name = "Hong. Gil. Dong";
		s1 = name.replace('.','/');// .�� /�� ġȯ�ϴ� �޼���
		System.out.println(s1);
		s1 = name.replace("on", "ii");
		System.out.println(s1);// ���ڿ� ��ü �ֵ���ǥ ���!!!! 
		                       // �Ͻ������� �ٲܻ�.. ���������� �ٲٷ��� name������ ����!!!!!!!
		
		name = name.replaceAll("ii","on");
		System.out.println(name);
		
		name = "kim. Lee. Park.";
		String name2 = "Kim. Lee. Park.";
		
		name = name.replace('.','/');
		System.out.println(name);
		
		name2 = name2.replaceAll(".","/"); // .�� ������ ���� �� ����� ����� => replace�� �� ����. �ͼ������� ��������
		System.out.println(name);
		
		String id = " hi hello ";// �߰� ������ �ǹ̰� ������ �糡 ������ �ǹ̰� ����.
		id = id.trim();//���� �糡�� �ǹ̾��� ������ �������ش�.
		System.out.println(id.length());
		
		String[] id2 = id.split(" ");
		System.out.println(id2[0] + "/" + id2[1]);// Ư�� ������ �������� �迭���·� ������ �������ִ� �޼���
		
		String answer = "Apple";
		
		if (answer.equals("apple")) {
			System.out.println("���� ����");
		}    //=> ��ҹ��ڸ� �����ϱ� ������ �ٸ� ������ �ν��Ѵ�.  => equalsIgoreCase => ��ҹ��� ������ �����ϰ� �ܾ ���ٸ� ��ġ 
		
		
		//��Ʈ�� Ŭ������ �޼���� �ƴ�����, ������ ���� ����ϰԵ� �޼���
		//���������� ���ڿ���(String)�� ������ ������ ���� ������ �ٲ㺸��!! (�⺻ �ڷ����� �����ϴ� ����(�θ�)Ŭ������ �ִ�.) => Ŭ������ .�޼��� Ȱ���� �����ϴ�.
		String num = "10"; 
		int a = Integer.parseInt(num); // �ݵ�� "����"�� �����ϴ�.
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
