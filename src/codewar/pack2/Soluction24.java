package codewar.pack2;

import java.util.regex.Pattern;

/**
 * Question : Regex validate PIN code
 * Writer : Kyudong
 * Date : 2022-10-20
 * Time : 오후 11:55
 */
public class Soluction24 {

	public static void main(String[] args) {
		System.out.println(validatePin("1234"));
		System.out.println(validatePin("098765"));
		System.out.println(validatePin("09865"));
		System.out.println(validatePin(".234"));
		System.out.println(validatePin("1.234"));
		System.out.println(validatePin("00000000"));
	}

	/**
	 * 4자리 또는 6자리의 숫자인지 확인한다.
	 *
	 * "1234"   -->  true
	 * "12345"  -->  false
	 * "a234"   -->  false
	 *
	 * | <- 를 이용해서 찾고싶은 문장을 구분지을 수 있다.
	 * 
	 * @param pin int 4자리 또는 6자리
	 * @return true일 경우 조건에 해당한다는 말
	 */
	public static boolean validatePin(String pin) {
		return Pattern.matches("\\d{4}|\\d{6}", pin);
	}

}
