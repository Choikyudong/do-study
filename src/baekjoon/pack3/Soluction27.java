package baekjoon.pack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Soluction27 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Set<String> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = i; j < str.length(); j++) {
				sb.append(str.charAt(j));
				set.add(sb.toString());
			}
		}
		System.out.println(set.size());
	}

}
