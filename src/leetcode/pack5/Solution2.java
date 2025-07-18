package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/number-of-employees-who-met-the-target/description/">
 * 문제링크
 * </a>
 */
public class Solution2 {

	public static void main(String[] args) {
		Solution2 solution1 = new Solution2();

		// 테스트1 : 4
		System.out.println(solution1.numberOfEmployeesWhoMetTarget(new int[]{0,1,2,3,4}, 2));

		// 테스트2 : 2
		System.out.println(solution1.numberOfEmployeesWhoMetTarget(new int[]{5,1,4,2,2}, 6));
	}

	public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
		int ans = 0;
		for (int hour : hours) {
			if (target <= hour) {
				ans++;
			}
		}

		return ans;
	}

}
