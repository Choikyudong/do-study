package leetcode.pack5;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/count-sorted-vowel-strings/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Solution1 {

	public static void main(String[] args) {
		Solution1 solution1 = new Solution1();

		// 테스트1 : 4
		System.out.println(solution1.countLargestGroup(13));

		// 테스트2 : 2
		System.out.println(solution1.countLargestGroup(2));

		System.out.println(solution1.countLargestGroup(46));
	}

	public int countLargestGroup(int n) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			int num = i;
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}

		int max = 0;
		for (int count : map.values()) {
			max = Math.max(count, max);
		}

		int result = 0;
		for (int key : map.keySet()) {
			if (map.get(key) == max) {
				result++;
			}
		}
		
		return result;
	}

}
