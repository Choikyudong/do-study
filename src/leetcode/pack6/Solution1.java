package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/count-sorted-vowel-strings/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Solution1 {

	public static void main(String[] args) {
		Solution1 solution1 = new Solution1();

		// 테스트1 : 1
		System.out.println(solution1.countDigits(7));

		// 테스트2 : 2
		System.out.println(solution1.countDigits(121));
		
		// 테스트3 : 4
		System.out.println(solution1.countDigits(1248));
	}

	public int countDigits(int num) {
		int temp = num;
		int count = 0;
		while (temp > 0) {
			int val = temp % 10;
			if (num % val == 0) {
				count++;
			}
			temp /= 10;
		}
		return count;
	}

}
