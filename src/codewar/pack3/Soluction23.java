package codewar.pack3;

import java.util.*;

/**
 * Question : Count the smiley faces!
 * Writer : Kyudong
 * Date : 2022-12-09
 * Time : PM 5:06
 */
public class Soluction23 {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<>();
		a1.add(":)"); a1.add(":D"); a1.add(":-}"); a1.add(":-()");
//		System.out.println(countSmileys(a1));

		List<String> a2 = new ArrayList<>();
		a2.add(":)"); a2.add("XD"); a2.add(":0}"); a2.add("x:-"); a2.add("):-"); a2.add("D:");
//		System.out.println(countSmileys(a2));

		List<String> a3 =  new ArrayList<>();
		a3.add(":)"); a3.add(":D"); a3.add("X-}"); a3.add("xo)"); a3.add(":X"); a3.add(":-3"); a3.add(":3");
//		System.out.println(countSmileys(a3));

		List<String> a4 =  new ArrayList<>();
		a4.add(":)"); a4.add(":)"); a4.add("x-]"); a4.add(":ox"); a4.add(";-("); a4.add(";-)"); a4.add(";~("); a4.add(":~D");
//		System.out.println((countSmileys(a4)));

		List<String> a5 =  new ArrayList<>();
		a5.add("p)"); a5.add(";D"); a5.add("(p"); a5.add("48x"); a5.add(":~P");
		a5.add("oD"); a5.add(";)"); a5.add(":)"); a5.add("pD"); a5.add(";2~D");
		a5.add("'D"); a5.add(":x)"); a5.add("pD"); a5.add("pp"); a5.add(";-d");
		a5.add("'D"); a5.add("()"); a5.add(";P"); a5.add(":~x"); a5.add("8x");
		a5.add("5)"); a5.add("'8)"); a5.add("o~)"); a5.add("8D"); a5.add(":2)");
		a5.add(":~D)"); a5.add(";D"); a5.add(";P"); a5.add(";)"); a5.add("oD,"); a5.add("8;-");
		System.out.println((countSmileys(a5)));
	}

	/**
	 * 해당 배열에 웃고있는 수를 카운트한다.
	 *
	 * 웃는기준)
	 * 눈 ->  or, ;
	 * 입 -> ) or D
	 *
	 * 완성된 예시)
	 * :) :D ;-D :~)
	 *
	 * 중간에 코모양 - or ~ 은 필수값이 아니다.
	 *
	 * @param arr 배열
	 * @return 웃고 있는 수
	 */
	public static int countSmileys(List<String> arr) {
		int countSmileing = 0;
		for (var smile : arr) {
			char[] chars = smile.toCharArray();
			if (chars.length > 3)
				continue;
			if (chars[0] == ':' || chars[0] == ';'){
				boolean isShort = chars.length > 2;
				if (isShort) {
					if (!(chars[1] == '-' || chars[1] == '~'))
						continue;
					if (chars[2] == ')' || chars[2] == 'D')
						countSmileing++;
				} else {
					if (chars[1] == ')' || chars[1] == 'D')
						countSmileing++;
				}
			}
		}
		return countSmileing;
	}

}
