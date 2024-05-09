package programmers.pack1;

public class Soluction25 {

	public static void main(String[] args) {
		System.out.println(solution("3141592","271"));
		System.out.println(solution("500220839878","7"));
		System.out.println(solution("10203","15"));
		System.out.println(solution("10203323442352345235235235","423840923840923809"));
		System.out.println(solution("10203323442352345235","0238409923809"));
		System.out.println(solution("102033234423523452322115","409923809"));
		System.out.println(solution("23523452322115","4009"));
	}

	public static int solution(String t, String p) {
		int answer = 0;
		long strPtoLong = Long.parseLong(p);
		for (int i = 0; i < t.length() - p.length() + 1; i++) {
			long strNum = Long.parseLong(t.substring(i, i + p.length()));
			if (strPtoLong >= strNum) {
				answer++;
			}
		}
		return answer;
	}

}
