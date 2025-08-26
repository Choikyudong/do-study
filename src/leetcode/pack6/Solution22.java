package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/distribute-candies/description/">
 * 문제링크
 * </a>
 */
public class Solution22 {

	public static void main(String[] args) {
		Solution22 solution = new Solution22();

		// 테스트1 : 3
		System.out.println((solution.distributeCandies(new int[]{1,1,2,2,3,3})));

		// 테스트2 : 2
		System.out.println((solution.distributeCandies(new int[]{1,1,2,3})));

		// 테스트3 : 1
		System.out.println((solution.distributeCandies(new int[]{6,6,6,6})));
	}

	/* 느림
	public int distributeCandies(int[] candyType) {
		Set<Integer> set = new HashSet<>();
		for (int candy : candyType) {
			set.add(candy);
		}

		return Math.min(set.size(), candyType.length / 2);
	}
	*/

	public int distributeCandies(int[] candyType) {
		boolean[] candys = new boolean[200001];
		int offset = 100000;
		int count = 0;
		int limitCandy = candyType.length / 2;
		for (int candy : candyType) {
			int index = candy + offset;
			if (!candys[index]) {
				candys[index] = true;
				count++;
				if (count == limitCandy) {
					break;
				}
			}
		}

		return Math.min(limitCandy, count);
	}

}

