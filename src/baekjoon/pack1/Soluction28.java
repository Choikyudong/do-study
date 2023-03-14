package baekjoon.pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Question : 그룹 단어 체커
 * Writer : Kyudong
 * Date : 2023-03-14
 * Time : 오후 10:44
 */
public class Soluction28 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int length = Integer.parseInt(br.readLine());

		String str;
		boolean check;
		int count = 0;
		for (int i = 0; i < length; i++) {
			str = br.readLine();
			check = true;

			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				for (int k = j + 1; k < str.lastIndexOf(c); k++) {
					if (c != str.charAt(k)) {
						check = false;
						break;
					}
				}
				if (!check) {
					break;
				}
			}

			if (check) {
				count++;
			}
		}

		System.out.print(count);
	}

}
