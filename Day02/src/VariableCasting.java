/**
 * Type Casting (형변환)
 * @author TJ
 *
 */

public class VariableCasting {

	//-- java Application Starting Point (Entry Point)
	public static void main(String[] args) {
		//-- 묵시적 형변환
		byte a = 127;
		short b = a; // short(2) ? byte(1)
		
		long c = 1000;
		float d = c; // 실수형은 정수형보다 무조건 큼.
		
		System.out.println("long to float : "+ d);
		
		
		//-- 명시적 형변환 큰곳에서 작은곳으로 갈때
		short aa = 127;
		byte bb = (byte)aa;
		
		System.out.println("short to byte(명시적) : "+ bb);
		
		aa = 128;
		bb = (byte)aa;
		
		System.out.println("short to byte(명시적) byte 범위 넘김 : "+ bb);
		
		//--- 실수 -> 정수로 형변환을 하는 경우는
		//--- 소숫점 이하 버림.
		double aaa = 3.541562;
		int bbb = (int)aaa;
		System.out.println("double to float:" + bbb);
		
				
		
	}
	
	
}
