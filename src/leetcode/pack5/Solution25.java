package leetcode.pack5;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/sort-the-people/description/">
 * 문제링크
 * </a>
 */
public class Solution25 {

	public static void main(String[] args) {
		Solution25 solution = new Solution25();

		// 테스트1 : ["Mary","Emma","John"]
		System.out.println(Arrays.toString(solution.sortPeople(
				new String[]{"Mary","John","Emma"},
				new int[]{180,165,170}
		)));

		// 테스트2 : ["Bob","Alice","Bob"]
		System.out.println(Arrays.toString(solution.sortPeople(
				new String[]{"Alice","Bob","Bob"},
				new int[]{155,185,150}
		)));
	}

	class Person {
		private final int height;
		private final String name;

		public Person(int height, String name) {
			this.height = height;
			this.name = name;
		}
	}

	public String[] sortPeople(String[] names, int[] heights) {
		int length = names.length;
		Person[] people = new Person[length];
		for (int i = 0; i < length; i++) {
			people[i] = new Person(heights[i], names[i]);
		}
		Arrays.sort(people, (person1, person2) -> person2.height - person1.height);

		String[] ans = new String[length];
		for (int i = 0; i < length; i++) {
			ans[i] = people[i].name;
		}
		return ans;
	}

}
