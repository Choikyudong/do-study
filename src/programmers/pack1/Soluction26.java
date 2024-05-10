package programmers.pack1;

public class Soluction26 {

	public static void main(String[] args) {
		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("a B z", 4));
	}

	/*
	// 날 것 그대로 이쪽이 더 빠르긴 함
	public static String solution(String s, int n) {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 32) {
				answer.append(c);
			} else if (c > 96) {
				int ci = c + n > 122 ? (c + n) - 122 + 96 : c + n;
				answer.append((char) ci);
			} else {
				int ci = c + n > 90 ? (c + n) - 90 + 64 : c + n;
				answer.append((char) ci);
			}
		}
		return answer.toString();
	}
	*/

	/**
	 * 알파벳이 26개니까
	 * c - 'a' + n = 문자가 이동할 칸 수
	 * 26을 나눠 초과시 0으로 돌아가게 한다.
	 * 'A' 또는 'a' 남은 이동 횟수를 더해 완성
	 * 위에꺼보다 느리긴 하지만 자바스러워서 좋긴한듯
	 */
	public static String solution(String s, int n) {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLowerCase(c)) {
				c = (char) ((c - 'a' + n) % 26 + 'a');
				answer.append(c);
			} else if (Character.isUpperCase(c)) {
				c = (char) ((c - 'A' + n) % 26 + 'A');
				answer.append(c);
			} else {
				answer.append(c);
			}
		}
		return answer.toString();
	}

}
