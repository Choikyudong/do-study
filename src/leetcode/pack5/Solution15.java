package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/">
 * 문제링크
 * </a>
 */
public class Solution15 {

	public static void main(String[] args) {
		Solution15 solution = new Solution15();

		// 테스트1 : 15
		System.out.println((solution.subtractProductAndSum(234)));

		// 테스트2 : 21
		System.out.println((solution.subtractProductAndSum(4421)));
	}

	public int subtractProductAndSum(int n) {
		int product = 1;
		int sum = 0;

		while (n > 0) {
			int num = n % 10;
			product *= num;
			sum += num;
			n /= 10;
		}

		return product - sum;
	}

}
