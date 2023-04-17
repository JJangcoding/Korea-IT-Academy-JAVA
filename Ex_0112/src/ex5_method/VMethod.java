package ex5_method;

public class VMethod {

	public void v_test(int...n) {//parameter 갯수 제한을 두지않는 방법임. => variable arguments .  알아서 n[] 배열이 형성된다.
		                         
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		
	}
}
