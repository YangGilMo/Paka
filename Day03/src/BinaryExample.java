/**
 * 비트연산
 * @author TJ
 *
 */


public class BinaryExample {
	
	public static void main(String[] args) {
		
		int x = 2;
		int y = 3;
		//System.out.println(Integer.toBinaryString(x));
		//인티져 x를 2진수 문자열로 바꿔주는 메서드 ( toBinaryString )
		System.out.println("x&y=" +(x&y));
				
		// 1. x를 2진수로 바꾸면 0010
		// 2. y를 2진수로 바꾸면 0011
		// 3. x&y = 0010 = 2
		
		System.out.println("x|y=" +(x|y));
		
     	// 1. x를 2진수로 바꾸면 0010
	    // 2. y를 2진수로 바꾸면 0011
	    // 3. x|y = 0011 = 3

		System.out.println("x^y=" +(x^y));
		
     	// 1. x를 2진수로 바꾸면 0010
	    // 2. y를 2진수로 바꾸면 0011
	    // 3. x^y = 0001 = 1 

	}

}
