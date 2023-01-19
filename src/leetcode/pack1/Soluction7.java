package leetcode.pack1;

/**
 * Question : 26. Remove Duplicates from Sorted Array
 * Writer : Kyudong
 * Date : 2023-01-19
 * Time : 오후 9:04
 */
public class Soluction7 {

	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[]{1, 1, 2}));
		System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
	}

	/**
	 * 중복된 숫자의 갯수를 반환하는 문제
	 * @param nums int[]
	 * @return 갯수
	 */
//	public static int removeDuplicates(int[] nums) {
//		int i = nums.length > 0 ? 1 : 0;
//		for (int n : nums) {
//			if (n > nums[i - 1])
//				nums[i++] = n;
//		}
//		return i;
//	}

	/**
	 * 메모리를 조금 더 최적화한 방법을 가져옴
	 * @param nums int[]
	 * @return 갯수
	 */
	public static int removeDuplicates(int[] nums) {
		int l = nums.length;
		int c = 1;
		for (int i = 0; i < l - 1; i++) {
			if (nums[i] < nums[i + 1]) {
				nums[c] = nums[i + 1];
				c++;
			}
		}
		return c;
	}

}
