package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction20 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()); // 라운드 수
		int kim = Integer.parseInt(st.nextToken()); // 김지민
		int lim = Integer.parseInt(st.nextToken()); // 임한수
		int round = 1;
		while (n > 0) {
			if (kim % 2 == 0 && kim - 1 == lim) {
				break;
			} else if (kim % 2 != 0 && kim + 1 == lim) {
				break;
			}

			if (kim % 2 == 0) {
				kim /= 2;
			} else {
				kim = (kim / 2) + 1;
			}

			if (lim % 2 == 0) {
				lim /= 2;
			} else {
				lim = (lim / 2) + 1;
			}

			round++;
			n /= 2;
		}
		System.out.println(round);
	}

}
