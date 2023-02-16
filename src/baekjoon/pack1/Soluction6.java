package baekjoon.pack1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Question : 과제 안 내신 분..?
 * Writer : Kyudong
 * Date : 2023-02-16
 * Time : 오후 10:59
 */
public class Soluction6 {

//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int[] checkList = new int[28];
//		for (int i = 0; i < checkList.length; i++) {
//			checkList[i] = Integer.parseInt(br.readLine());
//		}
//		soluction(checkList);
//	}

	/**
	 * 30명이 있는 출석번호에서 빠진 사람 번호를 출력한다.
	 * 출력은 낮은 번호부터 출력한다.
	 * @param checkList int[]
	 */
//	public static void soluction(int[] checkList) {
//		int[] arr = new int[30];
//		for (var num : checkList) {
//			arr[num - 1] = num;
//		}
//		int[] result = new int[2];
//		for (int i = 0, j = 0, num; i < arr.length; i++) {
//			num = arr[i];
//			if (num == 0) {
//				result[j++] = i + 1;
//			}
//		}
//		if (result[0] > result[1]) {
//			System.out.println(result[1]);
//			System.out.println(result[0]);
//		} else {
//			System.out.println(result[0]);
//			System.out.println(result[1]);
//		}
//	}

	// 출석번호를 배열에 바로 집어넣은 형식
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] checkList = new boolean[30];
		for (int i = 0; i < 28; i++) {
			checkList[Integer.parseInt(br.readLine()) - 1] = true;
		}
		for (int i = 0; i < 30; i++) {
			if (!checkList[i]) {
				System.out.println(i + 1);
			}
		}
	}

}
