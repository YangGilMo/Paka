/**
 * 배열선언
 * @author TJ
 *
 */


public class ArrayExample {

	public static void main(String[] args) {
		
		//A. 방을 만들고, 각 호실에 데이터를 따로 입력
		int[] arrInt = new int[5];
		arrInt[0] = 1; // 2. 각 호실에 값을(데이터를) 집어 넣습니다.
		arrInt[1] = 2;
		arrInt[2] = 3;
		arrInt[3] = 4;
		arrInt[4] = 5;
		// 호실(Index)은 배열길이 -1
		
		for(int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i;
		}
		
		
		
		//--배열이 없는경우
		//--5명 학생점수 평균을 내라
		int stdA = 90;
		int stdB = 100;
		int stdC = 50;
		int stdD = 30;
		int stdE = 90;
		System.out.println("평균 = " + (stdA+stdB+stdC+stdD+stdE) / 5 );
		
		//배열을 사용한다.
		// 변수명을 5개 지을 필요가 없음.
		int stdScores[]= {90,100,50,30,90};
		int totalScore = 0;
		
		for( int i=0; i < stdScores.length; i++) {
			totalScore += stdScores[i];
		}
		
		System.out.println("평균 = " + totalScore / 5);
			
		
	}
	
}
