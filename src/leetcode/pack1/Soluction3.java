package leetcode.pack1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Question : Two Sum
 * Writer : Kyudong
 * Date : 2023-01-11
 * Time : 오후 10:47
 */
public class Soluction3 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[]{2, 13, 11, 7, 5}, 9)));
//		System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
//		System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
	}

	/**
	 * nums에서 목표 숫자를 구할 수 있는 인덱스의 값을 배열에 넣어 반환한다.
	 * @param nums 정수 배열
	 * @param target 목표 숫자
	 * @return 정수배열
	 */
//	public static int[] twoSum(int[] nums, int target) {
//		int[] result = new int[2];
//		for (int i = 0; i < nums.length ; i++) {
//			for (int j = i  + 1; j < nums.length; j++) {
//				if (target == nums[i] + nums[j]) {
//					result[0] = i;
//					result[1] = j;
//				}
//			}
//		}
//		return result;
//	}

	/**
	 * 다른 사람들 답안을 가져와봄
	 * @param nums 정수 배열
	 * @param target 목표 숫자
	 * @return 정수배열
	 */
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				result[1] = i;
				result[0] = map.get(target - nums[i]);
				break;
			}
			map.put(nums[i], i);
		}
		return result;
	}

}
