package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] patterns = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String text = br.readLine();
		for (String pattern : patterns) {
			if (text.contains(pattern)) {
				text = text.replaceAll(pattern, "!");
			}
		}

		System.out.println(text.length());
	}

}
