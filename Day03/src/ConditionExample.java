/**
 * 조건문(Condition)
 * 
 *-> 1. if 구문 2. switch
 *a.
 *if(조건식) {
 *	.... 실행문
 *}
 *--> 조건식이 참일 경우에만...실행문이 실행 됩니다.
 *b. if(조건식) {
 *	...실행문
 * } else {
 *	...실행문
 * }
 * c. if(조건식) {
 * 	...실행문
 *  } else if(조건식) {
 *  ...실행문
 * }
 * 
 * 
 * @author TJ
 *
 */


public class ConditionExample {
	
	public static void main(String[] args) {
				
		int gainedPoint = 89; //Integer.parseInt(args[0]);
		gainedPoint = 80;
		
		System.out.println("당신이 얻은 점수는" + gainedPoint + "점 입니다.");
		
		if(gainedPoint >= 90) {
			System.out.println("입사하세요.");
		} else if (gainedPoint >= 80) {
			System.out.println("인턴 3개월");
		} else {
			System.out.println("집에가세요.");
		}
		
		//-------------------------아래 두개는 같은 조건식이다--------
		
		boolean result = 10 > 1 ? true : false; //1번
		
		if(10>1) {                              //2번
			result = true;
		} else {
			System.out.println("인턴 3개월");
		}
		
		// 1. 나이가 6세 이상
		// 2. 키가 120 이상
		// 3. 심장병이 없을때
		
		int age = 6;
		int height = 120;
		boolean heartAttacted = false;
		
		if(age >= 6 && height >=120 && !heartAttacted) {
			System.out.println("타라");					 			
		} else {
			System.out.println("못타");
		}
		
		if(age >= 6) 
			
			if( height >= 120) 
				
				if(!heartAttacted) {
					System.out.println("타라");
				} else {
					System.out.println("못타요");
				}
			
		
		
		
	}

}
