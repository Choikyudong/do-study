package leetcode.pack5;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/">
 * 문제링크
 * </a>
 */
public class Solution30 {

	public static void main(String[] args) {
		Solution30 solution = new Solution30();

		// 테스트1 : 8
		System.out.println(solution.numberOfBeams(new String[]{"011001","000000","010100","001000"}));

		// 테스트2 : 0
		System.out.println(solution.numberOfBeams(new String[]{"000","111","000"}));
	}

	/* 역대급 느림;
	public int numberOfBeams(String[] bank) {
		List<String> beamList = new ArrayList<>();
		for (String s : bank) {
			if (s.contains("1")) {
				beamList.add(s);
			}
		}

		int ans = 0;
		for (int i = 0; i < beamList.size() - 1; i++) {
			String currentLine = beamList.get(i);
			for (char current : currentLine.toCharArray()) {
				if (current == '1') {
					String nextLine = beamList.get(i + 1);
					for (char next : nextLine.toCharArray()) {
						if (next == '1') {
							ans++;
						}
					}
				}
			}
		}
		return ans;
	}
	*/

	public int numberOfBeams(String[] bank) {
		List<Integer> beamCount = new ArrayList<>();
		for (String b : bank) {
			if (b.contains("1")) {
				int count = 0;
				for (char c : b.toCharArray()) {
					if (c == '1') {
						count++;
					}
				}
				beamCount.add(count);
			}
		}

		if (beamCount.size() == 1) {
			return 0;
		}

		int ans = 0;
		for (int i = 0; i < beamCount.size() - 1; i++) {
			ans += beamCount.get(i) * beamCount.get(i + 1);
		}
		return ans;
	}

}
