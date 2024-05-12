package programmers.pack1;

public class Soluction28 {

	public static void main(String[] args) {
		System.out.println(solution("one4seveneight"));
		System.out.println(solution("23four5six7"));
		System.out.println(solution("2three45sixseven"));
		System.out.println(solution("123"));
	}

	/*
	public static int solution(String s) {
		StringBuilder answer = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isAlphabetic(c)) {
				sb.append(c);
				switch (sb.toString()) {
					case "zero":
						answer.append(0);
						sb = new StringBuilder();
						break;
					case "one":
						answer.append(1);
						sb = new StringBuilder();
						break;
					case "two":
						answer.append(2);
						sb = new StringBuilder();
						break;
					case "three":
						answer.append(3);
						sb = new StringBuilder();
						break;
					case "four":
						answer.append(4);
						sb = new StringBuilder();
						break;
					case "five":
						answer.append(5);
						sb = new StringBuilder();
						break;
					case "six":
						answer.append(6);
						sb = new StringBuilder();
						break;
					case "seven":
						answer.append(7);
						sb = new StringBuilder();
						break;
					case "eight":
						answer.append(8);
						sb = new StringBuilder();
						break;
					case "nine":
						answer.append(9);
						sb = new StringBuilder();
						break;
					default:
						break;
				}
			} else {
				answer.append(c);
			}
		}

		return Integer.parseInt(answer.toString());
	}
	*/

	// 정규식으로 풀이
	public static int solution(String s) {
		String[] arr = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		for (int i = 0; i < arr.length; i++) {
			s = s.replace(arr[i], Integer.toString(i));
		}
		return Integer.parseInt(s);
	}

}
