package programmers.pack1;

import java.util.*;

public class Soluction35 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{3,1,2,3}));
		System.out.println(solution(new int[]{3,3,3,2,2,4}));
		System.out.println(solution(new int[]{3,3,3,2,2,2}));
	}

	/**
	 * 1. 폰켓몬이 총 N마리가 있고 N/2 마리를 가져가도 된다.
	 * 2. 폰켓몬은 종류에 따라 번호를 가지고 있다.
	 * 3. 같은 종류의 폰켓몬은 같은 번호를 가지고 있다.
	 * @param nums 폰켓몬
	 * @return 중복되지 않고 많은 폰켓몬을 선택할 수 있는 개수의 최대값
	 */
	public static int solution(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (var num : nums) {
			set.add(num);
		}
		return Math.min(nums.length / 2, set.size());
	}

}
