/**
 * 
 * 배열은 참조변수(object)
 * @author TJ
 *
 */


public class ArrayCopyForReferExample {

	public static void main(String[] args) {
		
		int arrInt[] = {10,20,30};
		int arrInt2[] = arrInt;
		
		for(int i = 0; i < arrInt.length; i++) {
			System.out.println("arrInt[" + i + "]=" + arrInt[i]);
		}
		
		for(int i = 0; i < arrInt.length; i++) {
			System.out.println("arrInt[" + i + "]=" + arrInt[i]);
		
		}
		
	
	}
}