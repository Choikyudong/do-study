package pack3;

/**
 * Question : Stop gninnipS My sdroW!
 * Writer : Kyudong
 * Date : 2022-10-27
 * Time : 오후 11:49
 */
public class Soluction5 {

	public static void main(String[] args) {
		System.out.println(spinWords("Welcome"));
		System.out.println(spinWords("Hey fellow warriors"));
	}

	/**
	 * 주어진 문장에서 5글자가 넘는 단어는 반대로 출력한다.
	 *
	 * 예시)
	 * "Hey fellow warriors" => "Hey wollef sroirraw"
	 * "This is a test" => "This is a test"
	 * "This is another test" => "This is rehtona test"
	 *
	 * @param sentence String
	 * @return 조건에 맞춰서 반환한 문자열
	 */
	static String spinWords(String sentence) {
		StringBuilder sb = new StringBuilder();
		String[] arr = sentence.split("\\s+");
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			if (word.length() > 4) {
				String[] longWord = word.split("");
				for (int j = longWord.length - 1; j >= 0; j--) {
					sb.append(longWord[j]);
				}
			} else {
				sb.append(word);
			}
			if (arr.length - 1 > i) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

}
