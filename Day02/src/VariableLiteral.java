/**
 * 리터럴( escape sequence )
 * @author TJ
 *
 */
public class VariableLiteral {

	public static void main(String[] args) {
		
		// 1. 문자열 나는 "양길모" 입니다.
		System.out.println("나는 \"양길모\" 입니다.");
		System.out.println("나는 '양길모' 입니다.");
		
		// 2. * 3개를 찍는데 7칸씩(tab) 띄워서 출력하고 싶더라
		// *       *       *
		// \t (tab)
		System.out.println("*	*	*");
		System.out.println("*\t*\t*");
		
		
		// 3.* 3개를 찍는데 밑으로 찍고 싶은경우
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		
		System.out.println("*\n*\n*");
		
		
	}
}
