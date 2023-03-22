package programmers.pack1;

import java.util.Arrays;

/**
 * Question : 배열 두배 만들기
 * Writer : Kyudong
 * Date : 2023-03-21
 * Time : 오후 11:25
 */
public class Soluction9 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
		System.out.println(Arrays.toString(solution(new int[]{1, 2, 100, -99, 1, 2, 3})));
	}

	/**
	 * 정수 배열 numbers가 매개변수로 주어집니다.
	 * numbers의 각 원소에 두배한 원소를 가진 배열을
	 * return하도록 solution 함수를 완성해주세요.
	 * @param numbers int[]
	 * @return int[]
	 */
	public static int[] solution(int[] numbers) {
		int length = numbers.length;
		if (length > 1000 || 1 > length) {
			return new int[]{};
		}
		int number;
		for (int i = 0; i < length; i++) {
			number = numbers[i];
			if (number > 10000 || -10000 > number) {
				return new int[]{};
			}
			numbers[i] = number * 2;
		}
		return numbers;
	}

}
