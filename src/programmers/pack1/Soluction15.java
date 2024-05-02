package programmers.pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soluction15 {

	public static void main(String[] args) {
		int[] arr = new int[]{5,9,7,10};
		int divisor = 5;
		System.out.println(Arrays.toString(solution(arr, divisor)));
	}

	public static int[] solution(int[] arr, int divisor) {
		Arrays.sort(arr);
		List<Integer> answer = new ArrayList<>();

		for (var num : arr) {
			if (num % divisor == 0) {
				answer.add(num);
			}
		}

		if (answer.isEmpty()) {
			return new int[]{-1};
		}

		return answer.stream().mapToInt(i -> i).toArray();
	}

	/*
	public static int[] solution(int[] arr, int divisor) {
		Arrays.sort(arr);
		int[] answer = Arrays.stream(arr).filter(n -> n % divisor == 0).toArray();
		return answer.length == 0 ? new int[]{-1} : answer;
	}
	*/

}
