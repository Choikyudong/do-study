package programmers.pack1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Soluction29 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("banana")));
		System.out.println(Arrays.toString(solution("foobar")));
	}

	public static int[] solution(String s) {
		int[] answer = new int[s.length()];

		Map<Character, Integer> indexMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (indexMap.containsKey(c)) {
				int beforeIndex = indexMap.get(c);
				answer[i] = i - beforeIndex;
				indexMap.put(c, i);
			} else {
				indexMap.put(c, i);
				answer[i] = -1;
			}

			/*
			이런 방법도 있음
			answer[i] = i - indexMap.getOrDefault(c, i + 1); // <-- 괜찮은 메서드인듯
			indexMap.put(c, i);
			*/
		}

		return answer;
	}

}
