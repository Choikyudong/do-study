package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction29 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] woodPieces = new int[5];
		for (int i = 0; i < 5; i++) {
			woodPieces[i] = Integer.parseInt(st.nextToken());
		}

		StringBuilder sb = new StringBuilder();
		boolean isSorted = true;
		while (isSorted) {
			isSorted = swapAndPrint(woodPieces, sb);
		}
		System.out.println(sb);
	}

	static boolean swapAndPrint(int[] arr, StringBuilder sb) {
		boolean isSorted = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isSorted = true;
				int temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;

				for (int n : arr) {
					sb.append(n).append(" ");
				}
				sb.append("\n");
			}
		}
		return isSorted;
	}

}
