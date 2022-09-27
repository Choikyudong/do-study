package pack;

/**
 * Question :
 * Writer : Kyudong
 * Date : 2022-09-27
 * Time : 오후 11:18
 */
public class Soluction29 {

	public static void main(String[] args) {
		System.out.println(boolToWord(true));
		System.out.println(boolToWord(false));
	}

	/**
	 * b가 true라면 Yes를 false라면 No를 반환한다.
	 *
	 * @param b boolean
	 * @return 변환된 String
	 */
	public static String boolToWord(boolean b) {
		return b ? "Yes" : "No";
	}

}
