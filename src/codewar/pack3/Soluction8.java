package codewar.pack3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Question : Counting Duplicates
 * Writer : Kyudong
 * Date : 2022-11-03
 * Time : 오후 9:56
 */
public class Soluction8 {

	public static void main(String[] args) {
		System.out.println(duplicateCount("abcde"));
		System.out.println(duplicateCount("abcdea"));
		System.out.println(duplicateCount("indivisibility"));
		System.out.println(duplicateCount("abcdeaa"));
		System.out.println(duplicateCount("hHk7HB1sv1Bzh4tSDrwCvyqfJNvDPgdJ"));
		System.out.println(duplicateCount("1a2Aa"));
	}

	/**
	 * 중복된 문자의 갯수를 반환한다.
	 *
	 * 예시)
	 * "abcde" -> 0 # no characters repeats more than once
	 * "aabbcde" -> 2 # 'a' and 'b'
	 * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
	 * "indivisibility" -> 1 # 'i' occurs six times
	 * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
	 * "aA11" -> 2 # 'a' and '1'
	 * "ABBA" -> 2 # 'A' and 'B' each occur twice
	 *
	 * @param text 문자열
	 * @return 중복된 수
	 */
	public static int duplicateCount(String text) {
		String[] arr = text.toLowerCase(Locale.ROOT).split("");
		List<String> duplicateList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (!duplicateList.contains(arr[i])) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i].equalsIgnoreCase(arr[j])) {
						duplicateList.add(arr[i]);
						break;
					}
				}
			}
		}
		return duplicateList.size();
	}

}
