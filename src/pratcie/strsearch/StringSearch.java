package pratcie.strsearch;

public class StringSearch {

	public static void main(String[] args) {
		bruteForce("ABABCDEFGHAA", "ABC");
	}

	static void bruteForce(String text, String pattern) {
		int pt = 0; // 원본 String(text)의 포인터
		int pp = 0; // pattern의 포인터

		while (pt != text.length() && pp != pattern.length()) {
			if (text.charAt(pt) == pattern.charAt(pp)) {
				pt++;
				pp++;
			} else {
				pt = pt - pp + 1; // 1을 더하는 이유는 한칸 전진용
				pp = 0;
			}
		}
		
		// 결과
		int result = pp == pattern.length() ? pt - pp : -1;
		if (result == -1) {
			System.out.println("패턴이 없음");
		} else {
			int len = 0;
			for (int i = 0; i < result; i++) {
				len += text.substring(i, i + 1).getBytes().length;
			}
			len += pattern.length();
			System.out.println((len + 1) + "번째 문자부터 일치");
		}
	}

}
