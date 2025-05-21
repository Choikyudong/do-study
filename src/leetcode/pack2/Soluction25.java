package leetcode.pack2;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/pascals-triangle/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction25 {

	public static void main(String[] args) {
		// 테스트 1
		System.out.println(generate(5)); // [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

		// 테스트 2
		System.out.println(generate(1)); // [[1]]
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		result.add(List.of(1));
		if (numRows == 1) {
			return result;
		}

		for (int i = 1; i < numRows; i++) {
			List<Integer> list = new ArrayList<>();
			List<Integer> prevList = result.get(i - 1);
			list.add(1);
			for (int j = 1; j < i; j++) {
				list.add(prevList.get(j - 1) + prevList.get(j));
			}
			list.add(1);
			result.add(list);
		}

		return result;
	}

}

