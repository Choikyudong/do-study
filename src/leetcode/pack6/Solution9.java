package leetcode.pack6;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/count-of-matches-in-tournament/">
 * 문제링크
 * </a>
 */
public class Solution9 {

	public static void main(String[] args) {
		Solution9 solution = new Solution9();

		// 테스트1 : 1
		List<String> types = List.of("phone","blue","pixel");
		List<String> colors = List.of("computer","silver","lenovo");
		List<String> names = List.of("phone","gold","iphone");
		List<List<String>> items = new ArrayList<>();
		items.add(types);
		items.add(colors);
		items.add(names);
		System.out.println(solution.countMatches(
				items,
				"color",
				"silver"
		));

		// 테스트2 : 13
		types = List.of("phone","blue","pixel");
		colors = List.of("computer","silver","lenovo");
		names = List.of("phone","gold","iphone");
		items = new ArrayList<>();
		items.add(types);
		items.add(colors);
		items.add(names);
		System.out.println(solution.countMatches(
				items,
				"type",
				"phone"
		));
	}

	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int key;
		if (ruleKey.equals("type")) {
			key = 0;
		} else if (ruleKey.equals("color")) {
			key = 1;
		} else {
			key = 2;
		}

		int count = 0;
		for (List<String> item : items) {
			if (item.get(key).equals(ruleValue)) {
				count++;
			}
		}

		return count;
	}

}
