package codewar.pack3;

import java.util.Arrays;

/**
 * Question : Build Tower
 * Writer : Kyudong
 * Date : 2022-12-08
 * Time : PM 10:26
 */
public class Soluction22 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(towerBuilder(1)));
		System.out.println(Arrays.toString(towerBuilder(2)));
		System.out.println(Arrays.toString(towerBuilder(3)));
	}

	/**
	 * 주어진 길이 nFloors의 높이를 가진 피라미드를 배열에 담는다.
	 *
	 * @param nFloors 높이
	 * @return 완성된 피라미드
	 */
	public static String[] towerBuilder(int nFloors) {
		String[] result = new String[1], e;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nFloors; i++) {
			sb.append(" ".repeat(nFloors - (i + 1)));
			sb.append("*".repeat(i + i + 1));
			sb.append(" ".repeat(nFloors - (i + 1)));
			if (i + 1 != nFloors) {
				sb.append(",");
			}
		}
		result[0] = sb.toString();

		return result;
	}

}
