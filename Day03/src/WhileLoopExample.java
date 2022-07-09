
public class WhileLoopExample {
	
	public static void main(String[] args) {
		
		boolean goLoop = false;
		
		while(goLoop) {
			System.out.println("하이");
		}
		
		//-- do while을 사용하는 경우는 거의없음.
		
		do {
			System.out.println("헬로");
		} while(goLoop);
	int x = 10;
	while(x<20) {
		//System.out.println(x);  무한루프
		System.out.println(x++);
	}
	
	x = 10;
	while(true) {
		System.out.println("x=" + x++);
	
	}
	
	}

}
