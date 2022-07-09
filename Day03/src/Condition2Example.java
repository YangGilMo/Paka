/**
 * 
 * Switch 문
 * 
 * switch(변수/값) {
 * 	case 값 :
 * 		... 실행문
 *		break
 * 
 * @author TJ
 *
 */
public class Condition2Example {

	public static void main(String[] args) {
		
		int a = 10;
		a = 9;
		switch(a) {
		case 5 :
			System.out.println("5입니다.");
			break;
		case 10 :
			System.out.println("10입니다.");
			break;
		default:  // 디폴트는 없어도 문제가 되지는 않는다.
			System.out.println("맞는 숫자가 없습니다.");
		}
		
		String name = "삐약";
		switch(name) {
		case "삐" : 
		System.out.println("삐!!");
		break;
		
		} 
		
		if(a == 5) {
		} else if(a == 10) {
			
		} else {
			
		}
	}
	
}
