package pack3;

/**
 * Question : Valid Braces
 * Writer : Kyudong
 * Date : 2022-12-13
 * Time : PM 10:12
 */
public class Soluction26 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		
		System.out.println(isValid("()"));
		System.out.println(isValid("[(])"));
		System.out.println(isValid("(){}[]"));
		System.out.println(isValid("([{}])"));
		System.out.println(isValid("{}({})[]"));
		System.out.println(isValid("())({}}{()][]["));

		long end = System.nanoTime();
		System.out.println(end - start);
	}

	/**
	 * 주어진 문자열(braces)에 괄호가 닫힘이 일치하는지 확인한다.
	 * 예시)
	 * "(){}[]"   =>  True
	 * "([{}])"   =>  True
	 * "(}"       =>  False
	 * "[(])"     =>  False
	 * "[({})](]" =>  False
	 * @param braces 문자열
	 * @return boolean
	 */
	public static boolean isValid(String braces) {
		char[] chars = braces.toCharArray();

		for (int i = 0; i < chars.length - 1; i++) {
			char c1 = chars[i];
			if (c1 == ' ') {
				continue;
			}
			Loop : for (int j = i + 1; j < chars.length; j+= 2) {
				char c2 = chars[j];
				switch (c1) {
					case '(' :
						if (c2 == ')') {
							chars[i] = ' ';
							chars[j] = ' ';
							break Loop;
						}
						break;
					case '[' :
						if (c2 == ']') {
							chars[i] = ' ';
							chars[j] = ' ';
							break Loop;
						}
						break;
					case '{' :
						if (c2 == '}') {
							chars[i] = ' ';
							chars[j] = ' ';
							break Loop;
						}
						break;
					default:
						break;
				}
			}
		}

		for (var c : chars) {
			if (c != ' ')
				return false;
		}

		return true;
	}

}
