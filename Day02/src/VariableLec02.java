
public class VariableLec02 {

	public static void main(String args[]) {
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
	
		if(args.length < 2) {
			System.out.println("사용법 : java VariableLec02 x y 입니다.");
			return;
		}
		
		System.out.println(x + "+" + y + "=" + (x+y));
		
				
	}
}
