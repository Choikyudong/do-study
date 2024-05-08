package programmers.pack1;

import java.util.Arrays;

public class Soluction23 {

	public static void main(String[] args) {
//		System.out.println(solution(new int[]{1,3,2,4,5}, 9));
//		System.out.println(solution(new int[]{1,3,2,4,2,2,1}, 9));
//		System.out.println(solution(new int[]{2,2,3,3}, 10));
		System.out.println(solution(new int[]{2,2,3,3}, 3));
	}

	/**
	 * 각 부서가 신청한 금액만큼 지원
	 * 중요한것은 "최대한 많이 지원"하는것
	 * @param d 부서 목록 1 ~ 100.length
	 * @param budget 예산 1 ~ 10,000,000
	 * @return 신청된 부서 수
	 */
	public static int solution(int[] d, int budget) {
		int answer = 0;

		Arrays.sort(d);
		for (var deptBudget : d) {
			if (deptBudget > budget || budget == 0) {
				continue;
			}
			budget -= deptBudget;
			answer++;
		}

		return answer;
	}

}
