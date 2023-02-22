package baekjoon.pack1;

import java.util.Scanner;

/**
 * Question : 바구니 뒤집기
 * Writer : Kyudong
 * Date : 2023-02-22
 * Time : 오후 11:38
 */
public class Soluction10 {

	// 바구니
	private static int[] buket;

	// 입출력
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// 바구니 크기 지정
		int balls = scanner.nextInt();
		buket = new int[balls];

		// 바구니에 순서대로 공 넣음
		for (int i = 0; i < buket.length; i++) {
			buket[i] = i + 1;
		}

		// 바구니 교환
		int changeBucketCount= scanner.nextInt();
		for (int i = 0; i < changeBucketCount; i++) {
			changeBucket();
		}

		// 출력용
		for (var b : buket) {
			System.out.printf("%s ", b);
		}
	}

	/**
	 * startRange부터 finishRange까지
	 * 배열의 값을 역순으로 변경한다.
	 */
	public static void changeBucket() {
		int startRange = scanner.nextInt() - 1;
		int finishRange = scanner.nextInt() - 1;
		int totalRange = (finishRange - startRange) / 2 + 1;
		int tempBox;
		for (int i = 0; i < totalRange; i++) {
			tempBox = buket[finishRange];
			buket[finishRange--] = buket[startRange];
			buket[startRange++] = tempBox;
		}
	}

}
