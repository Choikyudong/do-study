package baekjoon.pack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Soluction19 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Set<Integer> set = new TreeSet<>();
		for (var num : arr) {
			set.add(num);
		}

		Map<Integer, Integer> temp = new HashMap<>();

		int index = 0;
		for (var num : set) {
			if (!temp.containsKey(num)) {
				temp.put(num, index++);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(temp.get(arr[i])).append(" ");
		}
		System.out.print(sb);
	}

}
