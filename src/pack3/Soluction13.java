package pack3;

/**
 * Question : Your order, please
 * Writer : Kyudong
 * Date : 2022-11-22
 * Time : 오후 11:10
 */
public class Soluction13 {

	public static void main(String[] args) {
		System.out.println(order("is2 Thi1s T4est 3a"));
		System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
		System.out.println(order(""));
	}

	/**
	 * 각 단어에 포함된 숫자를 기준으로 문자를 재정렬한다.
	 *
	 * 예시)
	 * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
	 * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
	 * ""  -->  ""
	 *
	 * @param words 문자열
	 * @return 재정렬된 문자열
	 */
	public static String order(String words) {
		String[] strArr = words.split("\\s+");

		if (strArr.length < 2) {
			return words;
		}

		String[] resultArr = new String[strArr.length];
		for (var str : strArr) {
			int index = Integer.parseInt(str.replaceAll("[a-zA-Z]", ""));
			resultArr[index - 1] = str;
		}

		return String.join(" ", resultArr);
	}

}
