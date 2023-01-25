package leetcode.pack1;

/**
 * Question : 35. Search Insert Position
 * Writer : Kyudong
 * Date : 2023-01-25
 * Time : 오후 11:29
 */
public class Soluction9 {

	public static void main(String[] args) {
		System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
		System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 1));
		System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
		System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
	}

	/**
	 * target의 값을 nums에서 찾아 인덱스값을 반환
	 * 없다면 마지막으로 검색된 위치 반환
	 * 해당 문제에서 배열은 정렬이 되어있다.
	 * @param nums int[]
	 * @param target 목표값
	 * @return index값
	 */
//	public static int searchInsert(int[] nums, int target) {
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] == target) {
//				return i;
//			}
//			if (nums[i] > target) {
//				return i;
//			}
//		}
//		return nums.length;
//	}

	/**
	 * 다른 방식
	 * @param nums int[]
	 * @param target 목표값
	 * @return index값
	 */
	public static int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int mid;
		while (high >= low) {
			mid = (high + low) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[mid] > target) {
				high = mid - 1;
				continue;
			}
			if (target > nums[mid]) {
				low = mid + 1;
			}
		}
		return low;
	}

}
