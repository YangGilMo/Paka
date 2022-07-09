/**
 * 산술연산
 * 
 * @author TJ
 *1. 기본적으로는 이항연산 
 *x 연산자 y -> ?
 * a+b, b-c ....
 * +,-,/,*,%
 * % <-- 나머지 연산
 * 
 */

public class MathExample {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 11;
		
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x / 10.1 = " + (x / 10.1)); // Double(더큰 데이터 타입으로 찾아감)
		System.out.println(11%10); // 
		System.out.println(10%2);		
		//-- (%)나머지 연산 (11에서 10을 나눴을때 나머지 값이 얼마?)
		
		System.out.println("나의 집은 시흥대로" + 100 + 52 + "길 입니다."); // <--(괄호) 사용유의 할 것
		System.out.println("나의 집은 시흥대로" + (100 + 52) + "길 입니다.");

		
		
	}
	
}
