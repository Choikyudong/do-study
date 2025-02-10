package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction24 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int chang = 100;
		int shang = 100;
		while (n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int changDice = Integer.parseInt(st.nextToken());
			int shangDice = Integer.parseInt(st.nextToken());
			if (changDice == shangDice) {
				continue;
			}

			if (changDice > shangDice) {
				shang -= changDice;
			} else {
				chang -= shangDice;
			}
		}
		System.out.println(chang);
		System.out.println(shang);
	}

}
