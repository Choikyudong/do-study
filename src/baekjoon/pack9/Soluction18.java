package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction18 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int minPackagePrice = 100_000_000;
		int minPerPrice = 100_000_000;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			minPackagePrice = Math.min(minPackagePrice, Integer.parseInt(st.nextToken()));
			minPerPrice = Math.min(minPerPrice, Integer.parseInt(st.nextToken()));
		}

		int money = 100_000_000;
		int tempN = n;
		int price = 0;
		// 패키지로만 계산
		while (tempN > 0) {
			tempN -= 6;
			price += minPackagePrice;
		}
		money = Math.min(money, price);

		// 낱개로만 계산
		price = n * minPerPrice;
		money = Math.min(money, price);

		// 낱개와 패키지 혼합
		price = 0;
		tempN = n;
		while (tempN > 5) {
			tempN -= 6;
			price += minPackagePrice;
		}
		price += tempN * minPerPrice;
		money = Math.min(money, price);
		System.out.println(money);
	}

}
