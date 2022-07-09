/**
 * 
 * 3항 연산자
 * 조건식 ? 값(연산1) : 값2(연산) : 값3(연산)
 * @author TJ
 *
 */
public class SamhangExamlpe {
	
	public static void main(String[] args) {
		
		int point = 90; // 커트라인
		int gainedPoint = 80; // 얻은점수
		int isPassed = 0; // Pass 여부 0이면 fail, 1이면 passed
		String isPassedString = "";
		
		isPassed = gainedPoint >= point ? 1 : 0;
		isPassedString = isPassed == 0? "불합격" : "합격";
		
		System.out.println("선생님은 " + isPassed + "하셨습니다.");
		System.out.println("선생님은 " + isPassedString + "하셨습니다.");
		
		
		
	}

}
