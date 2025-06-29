package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/jewels-and-stones/">
 * 문제링크
 * </a>
 */
public class Solution15 {

	public static void main(String[] args) {
		Solution15 solution = new Solution15();

		// 테스트1
		System.out.println(solution.numJewelsInStones(
				"aA",
				"aAAbbbb"
		)); // 3

		// 테스트2
		System.out.println(solution.numJewelsInStones(
				"z",
				"ZZ"
		)); // 0
	}

	public int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		for (char jewel : jewels.toCharArray()) {
			for (char stone : stones.toCharArray()) {
				if (jewel == stone) {
					count++;
				}
			}
		}
		return count;
	}

}
