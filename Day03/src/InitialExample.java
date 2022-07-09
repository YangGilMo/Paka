/**
 * 할당(대입연산)
 * @author TJ
 *
 *int a = 10; 프로그램은 좌에서 우로 인동
 *10 = a // 에러
 *
 *int a <-- 선언 (변수선언)
 *= 할당
 *10
 *-> int(인티져) a를 선언하고 10을 할당하겠다.
 *
 */


public class InitialExample {
	public static void main(String[] args) {
		
		int a = 10; //할당/대입
		System.out.println(a);
		
		// = += -= *= /= %=
		
		int b = 100; // 단순 할당 ( 100을 입력)
		b += 10; // b = b + 10;
		System.out.println(b); // <-- 110
		b -= 10; // b = b - 10;
		System.out.println(b); // <--100
		b *= 100; // b = b * 100;
		System.out.println(b); // <--10000
		b /= 100; // b = b / 100;
		System.out.println(b); // <--100
		b %= 100; // b = b % 100;
		System.out.println(b); // <--0
		// 위 할당은 자바와 C와 같은 일부에서만 사용(베이직 같은 경우는 없음)
			
		
	}

}
