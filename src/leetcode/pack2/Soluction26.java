package leetcode.pack2;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/pascals-triangle-ii/description/?envType=problem-result-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction26 {

	public static void main(String[] args) {
		// 테스트 1
		System.out.println(getRow(3)); // [1,3,3,1]

		// 테스트 2
		System.out.println(getRow(0)); // [1]

		// 테스트 3
		System.out.println(getRow(1)); // [1, 1]
	}

	public static List<Integer> getRow(int rowIndex) {
		List<List<Integer>> result = new ArrayList<>();
		result.add(List.of(1));
		if (rowIndex == 0) {
			return result.get(0);
		}

		for (int i = 1; i <= rowIndex; i++) {
			List<Integer> prevList = result.get(i - 1);
			List<Integer> list = new ArrayList<>();
			list.add(1);
			for (int j = 1; j < i; j++) {
				list.add(prevList.get(j - 1) + prevList.get(j));
			}
			list.add(1);
			result.add(list);
		}

		return result.get(rowIndex);
	}

}
