/**
 * 증감연산
 * ++, --
 *대표적인 단한연산
 *++x, x++
 *--y, y--
 *+=, -=
 *++x -> x = x + 1;
 *++y -> y = y + 1;
 *--x -> x = x - 1;
 *--y -> y = y - 1;
 * * 
 * 
 * @author TJ
 *
 */
public class IncrementExample {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a);
		++a;
		System.out.println(a);
		
		//-- 증감연산자의 전위, 후위 수식
		++a; //-- 피연산자의 앞에 수식이 붙는경우
		a++; //-- 피연산자의 뒤에 수식이 붙는경우
		     //-- 뜻은 동일하다 x = x + 1;
		
		a=100;
		System.out.println("a++ = " + a++);
		System.out.println("++a = " + ++a);
		
		
	}
}
