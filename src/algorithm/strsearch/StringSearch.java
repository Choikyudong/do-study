package algorithm.strsearch;

public class StringSearch {

	public static void main(String[] args) {
		bruteForce("ABABCDEFGHAA", "ABC");
		kmp("ABABCDEFGHAA", "ABC");
		boyerMoore("AABCXDEZCABACABAC", "ABAC");
	}

	static void bruteForce(String text, String pattern) {
		int pt = 0; // 원본 String(text)의 포인터
		int pp = 0; // pattern의 포인터

		int result = -1;
		while (pt != text.length() && pp != pattern.length()) {
			if (text.charAt(pt) == pattern.charAt(pp)) {
				pt++;
				pp++;
			} else {
				pt = pt - pp + 1; // 1을 더하는 이유는 한칸 전진용
				pp = 0;
			}
			if (pp == pattern.length()) {
				result = pt - pp;
				break;
			}
		}
		
		// 결과
		if (result == -1) {
			System.out.println("패턴이 없음");
		} else {
			System.out.println(result + "번째 문자부터 일치");
		}
	}

	static void kmp(String text, String pattern) {
		int pt = 1;
		int pp = 0;
		int[] skip = new int[pattern.length() + 1]; // 건너뛰기 표

		// 건너뛰기 표 작성
		skip[pt] = 0;
		while (pt != pattern.length()) {
			if (pattern.charAt(pt) == pattern.charAt(pp)) {
				skip[++pt] = ++pp;
			} else if (pp == 0) {
				skip[++pt] = pp;
			} else {
				pp = skip[pp];
			}
		}

		pt = pp = 0;
		while (pt != text.length() && pp != pattern.length()) {
			if (text.charAt(pt) == pattern.charAt(pp)) {
				pt++;
				pp++;
			} else if (pp == 0) {
				pt++;
			} else {
				pp = skip[pp];
			}
		}

		// 결과
		int result = pp == pattern.length() ? pt - pp : -1;
		if (result == -1) {
			System.out.println("패턴이 없음");
		} else {
			System.out.println(result + "번째 문자부터 일치");
		}
	}

	static void boyerMoore(String text, String pattern) {
		int pt;
		int pp;
		int textLength = text.length();
		int patternLength = pattern.length();
		int[] skip = new int[Character.MAX_VALUE + 1];

		for (pt = 0; pt <= Character.MAX_VALUE; pt++) {
			skip[pt] = patternLength;
		}
		for (pt = 0; pt < patternLength - 1; pt++) {
			skip[pattern.charAt(pt)] = patternLength - pt - 1;
		}

		int result = -1;
		outer: while (pt < textLength) {
			pp = patternLength - 1;
			while (text.charAt(pt) == pattern.charAt(pp)) {
				if (pp == 0) {
					result = pt;
					break outer;
				}
				pp--;
				pt--;
			}
			pt += Math.max(skip[text.charAt(pt)], patternLength - pp);
		}
		
		if (result == -1) {
			System.out.println("패턴이 없음");
		} else {
			System.out.println(result + "번째 문자부터 일치");
		}
	}
}
