/**
 * 비교연산
 * 두 항을 비교해서 결과를 얻는 작업
 * 두 항의 결과는 항상 참,거짓(true, false)
 * boolean(데이터값)(true / false, 1 / 0)
 * A > B, A < B, A >= B, A <= B
 * A == B (A equal B)
 * A != B (A not equal B) 
 * * 
 * @author TJ
 *
 */
public class CompareExample {
	
	public static void main(String[] args) {

		boolean result = false; // or true
		result = 10 > 2;
		System.out.println(result);
		System.out.println(!result);
		
		result = 10 < 2; // 거짓
		System.out.println(result);
		result = 10 >= 2; // 참
		System.out.println(result);
		result = 10 > 10; // 거짓
		System.out.println(result);
		
		//result "길모" > "만세"; // 실수,정수 비교만 가능 
		result = "길모" == "만세"; // !=, == 은 객체등 모든 데이터타입을 비교할 수 있다.
				
	}

}
