package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/convert-the-temperature/description/">
 * 문제링크
 * </a>
 */
public class Solution12 {

	public static void main(String[] args) {
		Solution12 solution = new Solution12();

		// 테스트1
		System.out.println(solution.convertTemperature(36.50)); // [309.65000,97.70000]

		// 테스트2
		System.out.println(solution.convertTemperature(122.11)); // [395.26000,251.79800]
	}

	public double[] convertTemperature(double celsius) {
		double[] ans = new double[2];
		ans[0] = celsius + 273.15;
		ans[1] = celsius * 1.80 + 32.00;
		return ans;
	}
	
}
