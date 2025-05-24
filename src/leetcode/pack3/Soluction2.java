package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/divisor-game/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction2 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(divisorGame(2)); // true

		// 테스트2
		System.out.println(divisorGame(3)); // false
	}

	public static boolean divisorGame(int n) {
		return n % 2 == 0;
	}

}

