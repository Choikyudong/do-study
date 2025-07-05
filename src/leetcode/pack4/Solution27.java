package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/goal-parser-interpretation/description/">
 * 문제링크
 * </a>
 */
public class Solution27 {

	public static void main(String[] args) {
		Solution27 solution = new Solution27();

		// 테스트1 : "Goal"
		System.out.println(solution.interpret("G()(al)"));

		// 테스트2 : "Gooooal"
		System.out.println(solution.interpret("G()()()()(al)"));
	}

	public String interpret(String command) {
		StringBuilder sb = new StringBuilder();
		int length = command.length();
		for (int i = 0; i < length; i++) {
			char c = command.charAt(i);
			if (c == 'G') {
				sb.append("G");
			} else if (c == '(' && i + 1 < length) {
				if (command.charAt(i + 1) == ')') {
					sb.append("o");
					i++;
				} else if (i + 3 < length) {
					if (command.charAt(i + 1) == 'a') {
						if (command.charAt(i + 2) == 'l') {
							if (command.charAt(i + 3) == ')') {
								sb.append("al");
								i += 3;
							} else {
								sb.append(c);
							}
						} else {
							sb.append(c);
						}
					} else {
						sb.append(c);
					}
				} else {
					sb.append(c);
				}
			} else {
				sb.append(c);
			}
		}

		return sb.toString();
	}

}
