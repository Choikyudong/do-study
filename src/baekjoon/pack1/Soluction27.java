package baekjoon.pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Question : 너의 평점은
 * Writer : Kyudong
 * Date : 2023-03-13
 * Time : 오후 10:56
 */
public class Soluction27 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		double credits;
		double result = 0d;
		double sum = 0d;
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			st.nextToken();
			credits = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			sum += credits;
			if ("P".equals(grade)) {
				continue;
			}
			result += getGrade(grade, credits);
		}
		System.out.printf("%3f", result / sum);
	}

	public static double getGrade(String grade, double credits) {
		switch (grade) {
			case "A+" :
				return 4.5 * credits;
			case "A0" :
				return 4.0 * credits;
			case "B+" :
				return 3.5 * credits;
			case "B0" :
				return 3.0 * credits;
			case "C+" :
				return 2.5 * credits;
			case "C0" :
				return 2.0 * credits;
			case "D+" :
				return 1.5 * credits;
			case "D0" :
				return credits;
			default:
				return 0;
		}
	}

}
