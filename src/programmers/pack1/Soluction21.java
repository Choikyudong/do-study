package programmers.pack1;

public class Soluction21 {

	public static void main(String[] args) {
		System.out.println(solution("tRy hello world"));
		System.out.println(solution("tr he wo"));
		System.out.println(solution("  abc de   fghi   "));
		System.out.println(solution("AAAAAAAAAAA A A A A AAAAA AAA "));
		System.out.println(solution("   A   aa"));
		System.out.println(solution("   A   a    AaAaAaAaA     aAaAaAa     "));
		System.out.println(solution("aaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa "));
	}

	public static String solution(String s) {
		StringBuilder answer = new StringBuilder();

		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 32) {
				answer.append(c);
				count = 1;
				continue;
			}

			if (count % 2 == 0) {
				answer.append(c >= 97 ? c : (char) (c + 32));
			} else {
				answer.append(97 > c ? c : (char) (c - 32));
			}
			count++;
		}

		return answer.toString();
	}

}
