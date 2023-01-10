package codewar.pack2;

import java.util.Locale;

/**
 * Question : Mumbling
 * Writer : Kyudong
 * Date : 2022-10-11
 * Time : 오후 11:11
 */
public class Soluction16 {

	public static void main(String[] args) {
		System.out.println(accum("ZpglnRxqenU"));
		System.out.println(accum("NyffsGeyylB"));
		System.out.println(accum("MjtkuBovqrU"));
		System.out.println(accum("EvidjUnokmM"));
		System.out.println(accum("HbidVbxncC"));
	}

	/**
	 * 각 문자마다 첫글자를 대문자로 변환하고 문자의 위치만큼 소문자로 반복한다.
	 *
	 * 예시)
	 *
	 * accum("abcd") -> "A-Bb-Ccc-Dddd"
	 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
	 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
	 *
	 * @param s 문자열
	 * @return 조건에 맞춰 반환한 문자열
	 */
	static String accum(String s) {
		String[] strs = s.toLowerCase(Locale.ROOT).split("");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strs.length; i++) {
			if (i > 0) {
				sb.append("-");
			}
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					sb.append(strs[i].toUpperCase(Locale.ROOT));
				} else {
					sb.append(strs[i]);
				}
			}
		}
		return sb.toString();
	}

}
