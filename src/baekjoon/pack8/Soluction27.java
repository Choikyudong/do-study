package baekjoon.pack8;

public class Soluction27 {

	public static void main(String[] args) {
		boolean[] bools = new boolean[10_001];
		int maxNum = 10_000;
		for (int i = 1; i <= maxNum; i++) {
			int num = i;
			int sum = i;
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			if (sum > maxNum) {
				continue;
			}
			bools[sum] = true;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= maxNum; i++) {
			if (!bools[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}

}
