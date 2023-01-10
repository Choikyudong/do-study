package codewar.pack4;

/**
 * Question : Valid Parentheses
 * Writer : Kyudong
 * Date : 2023-01-07
 * Time : 오전 12:03
 */
public class Soluction7 {

	public static void main(String[] args) {
		System.out.println(validParentheses( "()" ));
		System.out.println(validParentheses( "())" ));
		System.out.println(validParentheses( "32423(sgsdg)" ));
		System.out.println(validParentheses( "(dsgdsg))2432" ));
		System.out.println(validParentheses( "adasdasfa" ));
		System.out.println(validParentheses( "O,)()L(lP1VEg" ));
		System.out.println(validParentheses( "())(" ));
		System.out.println(validParentheses( "()()((()" ));
		System.out.println(validParentheses( "(zN)()iHR/y(l8zs@8o(9)n+>y?`)xMO??}X" ));
	}

	/**
	 * 괄호'('가 ')'로 잘 닫히는지 확인한다.
	 * 괄호의 값이 일치하면 된다는 생각은 했으나 구현을 못해서 참고해서 만들어봄;
	 * @param parens 괄호뭉치들
	 * @return true일 경우 일치
	 */
	public static boolean validParentheses(String parens) {
		char[] chars = parens.replaceAll("[^()]", "").toCharArray();
		int count = 0;
		for (var c : chars) {
			if (c == '(') count++;
			if (c == ')') count--;
			if (0 > count) return false;
		}
		return count == 0;
	}

}
