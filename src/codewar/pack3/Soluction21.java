package codewar.pack3;

/**
 * Question : Find the missing letter
 * Writer : Kyudong
 * Date : 2022-12-07
 * Time : PM 11:57
 */
public class Soluction21 {

	public static void main(String[] args) {
		System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f' }));
		System.out.println(findMissingLetter(new char[] { 'O','Q','R','S' }));
	}

	/**
	 * 주어진 연속된 알파벳으로 구성된 배열에서 누락된 문자를 반환한다.
	 *
	 * 예시)
	 * ['a','b','c','d','f'] -> 'e'
	 * ['O','Q','R','S'] -> 'P'
	 *
	 * @param array 배열
	 * @return 빠진 문자
	 */
	public static char findMissingLetter(char[] array) {
		char result = array[0];
		for (var wordTransNumber : array) {
			if (result != wordTransNumber) {
				break;
			}
			result++;
		}
		return result;
	}
}
