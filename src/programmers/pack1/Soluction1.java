package programmers.pack1;

import java.util.*;

/**
 * Question : 같은 숫자는 싫어
 * Writer : Kyudong
 * Date : 2023-01-14
 * Time : 오후 5:05
 */
public class Soluction1 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{1,1,3,3,0,1,1})));
		System.out.println(Arrays.toString(solution(new int[]{4,4,4,3,3})));
	}

	public static int[] solution(int []arr) {
		Stack<Integer> stack = new Stack<>();

		int n;
		for (var i : arr) {
			if (!stack.empty()) {
				n = stack.peek();
				if (n != i) {
					stack.add(i);
				}
			} else {
				stack.add(i);
			}
		}
		int[] answer = new int[stack.size()];
		int index = 0;
		for (var i : stack) {
			answer[index++] = i;
		}

		return answer;
	}

}
