package baekjoon.pack1;

import java.util.Scanner;

/**
 * Question : 공 넣기
 * Writer : Kyudong
 * Date : 2023-02-20
 * Time : 오후 10:31
 */
public class Soluction8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 바구니 갯수
		int[] buket = new int[scanner.nextInt()];
		// 공을 넣는 횟수
		int putInCount= scanner.nextInt();

		// scanner.nextInt()에 변수를 대입하자니 메모리 낭비일꺼 같아서 이렇게 해봄
		for (int i = 0; i < putInCount; i++) {
			soluction(buket, scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		}

		// 출력용
		for (var b : buket) {
			System.out.printf("%s ", b);
		}
	}

	/**
	 * i부터 j까지 k를 집어넣는다.
	 * @param b 바구니
	 * @param i 시작 바구니
	 * @param j 끝나는 바구니
	 * @param k 공 번호
	 */
	public static void soluction(int[] b,int i, int j, int k) {
		for (int l = i - 1; l < j; l++) {
			b[l] = k;
		}
	}

}
