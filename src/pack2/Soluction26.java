package pack2;

/**
 * Question : Printer Errors
 * Writer : Kyudong
 * Date : 2022-10-22
 * Time : 오전 1:28
 */
public class Soluction26 {

	public static void main(String[] args) {
		System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
	}

	/**
	 * a 부터 m 까지의 문자가 아닌 갯수를 알맞은 형태로 반환한다.
	 *
	 * 예시)
	 * s="aaabbbbhaijjjm"
	 * printer_error(s) => "0/14"
	 *
	 * s="aaaxbbbbyyhwawiwjjjwwm"
	 * printer_error(s) => "8/22"
	 *
	 * @param s a-z를 가진 문자열
	 * @return %d/%d의 문자열
	 */
	public static String printerError(String s) {
		return String.format("%d/%d", s.replaceAll("[a-m]", "").length(), s.length());
	}

}
