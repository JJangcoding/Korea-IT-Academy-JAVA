package ex5_method;

public class VMethod {

	public void v_test(int...n) {//parameter ���� ������ �����ʴ� �����. => variable arguments .  �˾Ƽ� n[] �迭�� �����ȴ�.
		                         
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		
	}
}
