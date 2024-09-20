package baekjoon.pack4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Soluction21 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Set<String> users = new HashSet<>();
		int result = 0;
		for (int i = 0; i < n; i++) {
			String text = br.readLine();
			if ("ENTER".equals(text)) {
				result += users.size();
				users.clear();
				continue;
			}
			users.add(text);
		}
		System.out.println(result + users.size());
	}

}
