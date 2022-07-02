
public class VariableLec01 { // 클래스 선언부(파일명과 동일,대소문자 구분)
	
	public static void main(String[] args) { // 자바 어플리케이션 스타팅 포인트
		
		System.out.println("Hello Var!");
		
		int score = 10;
		System.out.println(score);
		
		//--- 1. 변수명은 영어,숫자,특수문자,한글사용가능(오류발생 문제가 있어 한글사용 지용)
		//int Age;
		int age; // 변수의 시작은 소문자로 하는것을 원칙으로 한다.
		//int aGE;
		int student4Age; // 숫자도 사용 가능하다.
		int student4_age; // 특수문자도 가능하다.
		int $_age; // 특수문자 가능
		
		// --- 2. 변수명은 숫자로 시작할 수 없다.
		//int 4Age; // --컴파일 에러 발생
		
		//---3. 공백사용불가
		//int student age; //--error
		int studentAge;
		int student_age;
	
		//4. 대소문자 구분
		int studentAge2;
		int StudentAge2;
		int sTudentAGE2;
		int stUDentage2;
		
		//---5. 예약어는 변수명으로 사용할 수 없다.(*예약어 : 자바에서 사용 중인 단어)
		
		//int static; //static은 예약어라 에러발생
		
		//--- 6. 의미를 부여하자
		int a = 40; //-- 친구의 나이
		int friendAge = 40; //--- 이렇게 의미를 변수명에 부여하는게 좋다.
		
		//-- char 사용해보기
		
		char alpha = 65;
		System.out.println((int)alpha + ":" + (char)alpha);
		
		for(char i=65; i<=90; i++) {
			System.out.println(i + "=" + (int)i);
		}
		
	    System.out.println(10);
		
		float abc;
		abc = 1.11f; //-- double이 기본형 실수이므로 숫자 뒤에 float의 f를 붙여준다.(f를 표시하지 않을 시 기본형으로 인식함)
					
	}
	
}

