package codewar.pack4;

/**
 * Question : Scramblies
 * Writer : Kyudong
 * Date : 2023-01-05
 * Time : 오후 11:11
 */
public class Soluction6 {

	public static void main(String[] args) {
		long start = System.nanoTime();

		System.out.println(scramble("rkqwodlw","world"));
		System.out.println(scramble("cedewaraaossoqqyt","codewars"));
		System.out.println(scramble("katas","steak"));
		System.out.println(scramble("scriptjavx","javascript"));
		System.out.println(scramble("scriptingjava","javascript"));
		System.out.println(scramble("scriptsjava","javascripts"));
		System.out.println(scramble("javscripts","javascript"));
		System.out.println(scramble("aabbcamaomsccdd","commas"));
		System.out.println(scramble("commas","commas"));
		System.out.println(scramble("sammoc","commas"));

		String s1 = "abcdefghijklmnopqrstuvwxyz".repeat(10_000);
		String s2 = "zyxcba".repeat(9_000);
		System.out.println(scramble(s1, s2));

		long end = System.nanoTime();
		System.out.println(end - start);
	}

	/**
	 * str1을 조립해서 str2가 가능한지 확인한다.
	 * <pre>
	 * 예시)
	 * scramble('rkqodlw', 'world') ==> True
	 * scramble('cedewaraaossoqqyt', 'codewars') ==> True
	 * scramble('katas', 'steak') ==> False
	 * </pre>
	 * ps) 속도를 훨씬 빠르게 하려면 Map을 사용해야 한다.
	 * @param str1 섞은 문자열
	 * @param str2 목표 문자열
	 * @return true일 경우 가능
	 */
	public static boolean scramble(String str1, String str2) {
		String[] strs1 = str1.split("");
		StringBuilder sb = new StringBuilder(str2);

		String text = sb.toString();
		for (var word : strs1) {
			if (text.contains(word)) {
				int index = text.indexOf(word);
				sb.deleteCharAt(index);
				text = sb.toString();
			}
			if (text.length() == 0) {
				return true;
			}
		}

		return false;
	}

}
