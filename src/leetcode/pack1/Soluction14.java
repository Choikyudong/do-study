package leetcode.pack1;

/**
 * Question : 88. Merge Sorted Array
 * Writer : Kyudong
 * Date : 2023-02-07
 * Time : 오후 11:12
 */
public class Soluction14 {

	public static void main(String[] args) {
		merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
		merge(new int[]{1}, 1, new int[]{}, 0);
	}

	/**
	 * 주어진 배열 nums1, nums2를 정렬된 배열로 합쳐서 반환한다.
	 * 포인터 개념을 쉽게 잘 사용한 예제를 가져왔다.
	 * @param nums1 int[]
	 * @param m nums1 배열이 가진 숫자의 갯수
	 * @param nums2 in[]
	 * @param n num2 배열이 가진 숫자의 갯수
	 */
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		while(i >= 0 && j >= 0){
			if(nums1[i] >= nums2[j]){
				nums1[i + j + 1] = nums1[i] ;
				i--;
			}else{
				nums1[i + j + 1] = nums2[j];
				j--;
			}
		}
		while(j >= 0){
			nums1[j] = nums2[j];
			j--;
		}
	}

}
