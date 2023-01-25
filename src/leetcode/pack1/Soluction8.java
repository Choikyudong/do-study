package leetcode.pack1;

/**
 * Question : 27. Remove Element
 * Writer : Kyudong
 * Date : 2023-01-25
 * Time : 오후 11:11
 */
public class Soluction8 {

	public static void main(String[] args) {
		System.out.println(removeElement(new int[]{3,2,2,3}, 3));
		System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 3));
	}

	/**
	 * 배열 nums에 존재하는 val값을 모두 제거한다.
	 * 다만 in-place 공식을 이용해야 한다.
	 * @param nums 배열
	 * @param val 제거값
	 * @return 제거된 갯수
	 */
	public static int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val)
				nums[i++] = nums[j];
		}
		return i;
	}

}
