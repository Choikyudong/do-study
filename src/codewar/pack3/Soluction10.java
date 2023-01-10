package codewar.pack3;

import java.util.Locale;

/**
 * Question : Duplicate Encoder
 * Writer : Kyudong
 * Date : 2022-11-15
 * Time : 오후 11:02
 */
public class Soluction10 {

	public static void main(String[] args) {
		System.out.println(encode("Prespecialized"));
		System.out.println(encode("   ()(   "));
		System.out.println(encode("Success"));
		System.out.println(encode("(( @"));
	}

	/**
	 * 주어진 문자열의 문자들을 특수문자 (, )로 변환한다.
	 * 문자열에 중복된 단어가 있다면 해당 문자들을 )로 변환한다.
	 *
	 * 예시)
	 * "din"      =>  "((("
	 * "recede"   =>  "()()()"
	 * "Success"  =>  ")())())"
	 * "(( @"     =>  "))((" 
	 *
	 * @param word 문자열
	 * @return 변환된 문자열
	 */
	static String encode(String word){
		String[] arr = word.toLowerCase(Locale.ROOT).split("");

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i].equals(arr[j])) {
					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate) {
				sb.append(")");
			} else {
				sb.append("(");
			}
		}

		return sb.toString();
	}

}
