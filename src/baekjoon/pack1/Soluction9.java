package baekjoon.pack1;

import java.util.Scanner;

/**
 * Question : 공 바꾸기
 * Writer : Kyudong
 * Date : 2023-02-21
 * Time : 오후 11:08
 */
public class Soluction9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 바구니 크기 지정
		int balls = scanner.nextInt();
		int[] buket = new int[balls];
		
		// 바구니에 순서대로 공 넣음
		for (int i = 0; i < buket.length; i++) {
			buket[i] = i + 1;
		}

		// 공을 교환
		int putInCount= scanner.nextInt();
		int tempBox;
		int first;
		int second;
		for (int i = 0; i < putInCount; i++) {
			first = scanner.nextInt() - 1;
			second = scanner.nextInt() - 1;
			tempBox = buket[first];
			buket[first] = buket[second];
			buket[second] = tempBox;
		}

		// 출력용
		for (var b : buket) {
			System.out.printf("%s ", b);
		}
	}

}
