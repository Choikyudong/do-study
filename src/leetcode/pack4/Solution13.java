package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/defanging-an-ip-address/">
 * 문제링크
 * </a>
 */
public class Solution13 {

	public static void main(String[] args) {
		Solution13 solution = new Solution13();

		// 테스트1
		System.out.println(solution.defangIPaddr("1.1.1.1")); // 1[.]1[.]1[.]1

		// 테스트2
		System.out.println(solution.defangIPaddr("255.100.50.0")); // 255[.]100[.]50[.]0
	}

	public String defangIPaddr(String address) {
		return address.replace(".", "[.]");
	}
	
}
