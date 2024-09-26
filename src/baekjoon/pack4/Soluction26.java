package baekjoon.pack4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Soluction26 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] frequency = new int[8001];
		double sum = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			sum += num;
			frequency[num + 4000]++;
		}
		Arrays.sort(arr);

		int maxFreq = 0;
		for (int num : frequency) {
			maxFreq = Math.max(num, maxFreq);
		}

		List<Integer> maxFreqList = new ArrayList<>();
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] == maxFreq) {
				maxFreqList.add(i - 4000);
			}
		}
		Collections.sort(maxFreqList);
		int frequencyResult = maxFreqList.size() > 1 ? maxFreqList.get(1) : maxFreqList.get(0);

		// 산술평균
		System.out.println(Math.round(sum / n));
		// 중앙값
		System.out.println(arr[n / 2]);
		// 최빈값
		System.out.println(frequencyResult);
		// 범위
		System.out.println(arr[n - 1] - arr[0]);
	}

}
