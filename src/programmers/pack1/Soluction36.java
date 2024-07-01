package programmers.pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soluction36 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
		System.out.println(Arrays.toString(solution(new int[]{1,3,2,4,2})));
		System.out.println(Arrays.toString(solution(new int[]{5,5,5,5,5,5,5,5,5,5})));
		System.out.println(Arrays.toString(solution(new int[]{3,1,2})));
	}

	/**
	 * 1. 시험은 최대 10,000문제
	 * 2. 문제의 정답은  1, 2, 3, 4, 5 중 하나이다.
	 * 3. 높은 점수의 사람이 여럿이라면 오름차순으로 정렬
	 * 1번 수포자 : 1, 2, 3, 4, 5
	 * 2번 수포자 : 2, 1, 2, 3, 2, 4, 2, 5
	 * 3번 수포자 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
	 * @param answers 정답의 순서가 들어있음
	 * @return 맞춘 사람 순서대로 반환
	 */
	public static int[] solution(int[] answers) {
		int[] person1Arr = new int[]{1, 2, 3, 4, 5};
		int[] person2Arr = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
		int[] person3Arr = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

		int[] score = new int[3];
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == person1Arr[i % person1Arr.length]) {
				score[0]++;
			}
			if (answers[i] == person2Arr[i % person2Arr.length]) {
				score[1]++;
			}
			if (answers[i] == person3Arr[i % person3Arr.length]) {
				score[2]++;
			}
		}

		int max = Math.max(score[0], Math.max(score[1], score[2]));
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < score.length; i++) {
			if (score[i] == max) {
				result.add(i + 1);
			}
		}
		int[] answer = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}

		return answer;
	}

}
