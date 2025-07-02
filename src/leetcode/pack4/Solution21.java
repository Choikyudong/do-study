package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/convert-date-to-binary/description/">
 * 문제링크
 * </a>
 */
public class Solution21 {

	public static void main(String[] args) {
		Solution21 solution = new Solution21();

		// 테스트1 : "100000100000-10-11101"
		System.out.println(solution.convertDateToBinary("2080-02-29"));

		// 테스트2 : "11101101100-1-1"
		System.out.println(solution.convertDateToBinary("1900-01-01"));
	}

	public String convertDateToBinary(String date) {
		String year = date.substring(0, 4);
		String month = date.substring(5, 7);
		String day = date.substring(8, 10);

		StringBuilder ans = new StringBuilder();
		ans.append(Integer.toBinaryString(Integer.parseInt(year)));
		ans.append("-");
		ans.append(Integer.toBinaryString(Integer.parseInt(month)));
		ans.append("-");
		ans.append(Integer.toBinaryString(Integer.parseInt(day)));
		return ans.toString();
	}

}
