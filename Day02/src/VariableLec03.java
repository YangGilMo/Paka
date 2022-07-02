
public class VariableLec03 {

	public static void main(String args[]) {
		
		//-- 선언과 동시에 초기화
		int a = 10;
		char b = 20;
		short c = 100;
		long d = 1000;
		
		//-- 선언과 초기화를 별도로
		int aa;
		char bb;
		short cc;
		long dd;
		
		aa = 10;
		bb = 20;
		cc = 100;
		dd = 1000;
		
		int aaa;
		aaa = 100; // <--초기화가 되어야 한다.
		System.out.println(aaa); // 초기화 하지 않은 값 aaa는 에러를 발생시킨다.
		
		//-- 선언의 방식
		int aaaa, bbbb, cccc, dddd;
		char aaaa_c, bbbb_c, dddd_c;
		
		byte testCharLength;
		//testCharLength = 128; // 127까지니까 에러
		
		testCharLength = 127;
		testCharLength ++; // -- ++뜻은 testCharLength = testCharLength + 1
		
		System.out.println(testCharLength);
		
	}
}
