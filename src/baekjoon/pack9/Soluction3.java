package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int e = Integer.parseInt(st.nextToken()); // 지구
		int s = Integer.parseInt(st.nextToken()); // 태양
		int m = Integer.parseInt(st.nextToken()); // 달

		int calE = 1;
		int calS = 1;
		int calM = 1;
		int year = 1;
		while (e != calE || s != calS || m != calM) {
			calE++;
			calS++;
			calM++;
			if (calE > 15) {
				calE = 1;
			}
			if (calS > 28) {
				calS = 1;
			}
			if (calM > 19) {
				calM = 1;
			}
			year++;
		}
		System.out.println(year);
	}

}
