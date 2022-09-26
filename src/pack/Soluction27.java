package pack;

/**
 * Question : Remove String Spaces
 * Writer : Kyudong
 * Date : 2022-09-26
 * Time : 오후 11:50
 */
public class Soluction27 {

	public static void main(String[] args) {
		System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
		System.out.println(noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
		System.out.println(noSpace("8aaaaa dddd r     "));
		System.out.println(noSpace("jfBm  gk lf8hg  88lbe8 "));
		System.out.println(noSpace("8j aam"));
	}

	/**
	 * 주어진 문자의 공백을 모두 제거하라
	 * 
	 * @param x 문자열
	 * @return 공백이 제거된 문자열
	 */
	public static String noSpace(final String x) {
		return x.replace(" ", "");
	}

}
