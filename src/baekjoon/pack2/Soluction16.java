package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Soluction16 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		while (n != -1) {
			int total = 0;
			List<Integer> list = new ArrayList<>();
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					total += i;
					list.add(i);
				}
			}
			if (total == n) {
				String result = list.stream()
						.map(String::valueOf)
						.collect(Collectors.joining(" + "));
				System.out.printf("%d = %s%n", n, result);
			} else {
				System.out.printf("%d is NOT perfect.%n", n);
			}
			n = Integer.parseInt(br.readLine());
		}
	}

}
