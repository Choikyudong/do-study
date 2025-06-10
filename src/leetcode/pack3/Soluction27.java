package leetcode.pack3;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/find-words-containing-character/description/?envType=problem-list-v2&envId=array">
 * 문제링크
 * </a>
 */
public class Soluction27 {

	public static void main(String[] args) {
		Soluction27 soluction = new Soluction27();

		// 테스트1
		System.out.println(soluction.findWordsContaining(
				new String[]{"leet","code"},
				'e'
		)); // [0,1]

		// 테스트2
		System.out.println(soluction.findWordsContaining(
				new String[]{"abc","bcd","aaaa","cbc"},
				'a'
		)); // [0,2]

		// 테스트3
		System.out.println(soluction.findWordsContaining(
				new String[]{"abc","bcd","aaaa","cbc"},
				'z'
		)); // [0,2]
	}

	public List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> ans = new ArrayList<>();

		for (int i = 0; i < words.length; i++) {
			if (words[i].indexOf(x) != -1) {
				ans.add(i);
			}
		}

		return ans;
	}

}
