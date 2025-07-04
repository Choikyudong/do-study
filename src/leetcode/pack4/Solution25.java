package leetcode.pack4;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/smallest-even-multiple/description/">
 * 문제링크
 * </a>
 */
public class Solution25 {

	public static void main(String[] args) {
		Solution25 solution = new Solution25();

		// 테스트1 : [5,7,2,3,2]
		System.out.println(solution.kidsWithCandies(
				new int[]{2,3,5,1,3},
				3
		));

		// 테스트2 : [13]
		System.out.println(solution.kidsWithCandies(
				new int[]{4,2,1,1,2},
				1
		));
	}

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int maxCandy = 0;
		for (int candy : candies) {
			maxCandy = Math.max(maxCandy, candy);
		}

		List<Boolean> ans = new ArrayList<>();
		for (int candy : candies) {
			ans.add(candy + extraCandies >= maxCandy);
		}

		return ans;
	}

}
