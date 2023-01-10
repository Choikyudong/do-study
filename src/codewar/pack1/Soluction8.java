package codewar.pack1;

/**
 * Question : Remove First and Last Character
 * Writer : Kyudong
 * Date : 2022-09-11
 * Time : 오후 9:29
 */
public class Soluction8 {

	public static void main(String[] args) {
		System.out.println(remove("eloquent"));
		System.out.println(remove("country"));
		System.out.println(remove("person"));
		System.out.println(remove("place"));
	}

	/**
	 * 주어진 문자열의 첫글자와 마지막 글자를 제거하고 반환한다.
	 *
	 * 해당 문제에서 2자 미만의 문자열은 주어지지 않는다.
	 * final을 매개변수에 넣으므로써 remove 메서드내에서
	 * 재할당을 못하게 하여 코드를 더 깔끔하게 만들면 좋다고 한다.
	 *
	 * @param str 문자열
	 * @return 첫글자와 마지막 글자를 제거한 문자열
	 * @throws StringIndexOutOfBoundsException 2자 미만의 문자열이 주어진다면
	 */
	public static String remove(final String str) {
		if (str.length() < 2) {
			throw new StringIndexOutOfBoundsException();
		}
		return str.substring(1, str.length() - 1);
	}

}
