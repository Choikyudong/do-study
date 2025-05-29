package leetcode.pack3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/description/?envType=problem-list-v2&envId=greedy">
 * 문제링크
 * </a>
 */
public class Soluction12 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(groupThePeople(new int[]{3,3,3,3,3,1,3})); // [[5],[0,1,2],[3,4,6]]

		// 테스트2
		System.out.println(groupThePeople(new int[]{2,1,3,3,3,2})); // [[1],[0,5],[2,3,4]]
	}

	public static List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> result = new ArrayList<>();
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < groupSizes.length; i++) {
			int groupSize = groupSizes[i];
			map.put(groupSize, map.getOrDefault(groupSize, new ArrayList<>()));
			map.get(groupSize).add(i);

			if (map.get(groupSize).size() == groupSize) {
				result.add(map.get(groupSize));
				map.put(groupSize, new ArrayList<>());
			}

		}
		return result;
	}

}
