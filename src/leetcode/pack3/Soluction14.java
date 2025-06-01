package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/description/?envType=problem-list-v2&envId=greedy">
 * 문제링크
 * </a>
 */
public class Soluction14 {

	public static void main(String[] args) {
		System.out.println(minTimeToType("z")); // 2
		// 테스트1
		System.out.println(minTimeToType("abc")); // 5

		// 테스트2
		System.out.println(minTimeToType("bza")); // 7

		// 테스트3
		System.out.println(minTimeToType("zjpc")); // 34
	}

	public static int minTimeToType(String word) {
		int time = 0;
		int current = 0; // 'a'의 위치는 0

		for (char c : word.toCharArray()) {
			int target = c - 'a';
			int diff = Math.abs(target - current);
			time += Math.min(diff, 26 - diff) + 1;
			current = target;
		}

		return time;
	}


}
