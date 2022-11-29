package pack3;

/**
 * Question : Equal Sides Of An Array
 * Writer : Kyudong
 * Date : 2022-11-29
 * Time : PM 11:53
 */
public class Soluction18 {

	public static void main(String[] args) {
		System.out.println(findEvenIndex(new int[] {1,2,3,4,3,2,1}));
		System.out.println(findEvenIndex(new int[] {1,100,50,-51,1,1}));
		System.out.println(findEvenIndex(new int[] {1,2,3,4,5,6}));
		System.out.println(findEvenIndex(new int[] {20,10,30,10,10,15,35}));
		System.out.println(findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
		System.out.println(findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
		System.out.println(findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
	}

	/**
	 * 하나의 배열 인덱스를 기준으로 왼쪽과 오른쪽의 합이 같을 때 해당 인덱스를 반환한다.
	 *
	 * 인덱스 0 또는 마지막 인덱스일 때 왼쪽과 오른쪽은 0으로 값을 취급한다.
	 *
	 * 예시)
	 * {1,2,3,4,3,2,1} -> 인덱스 4일 때 왼쪽(1, 2, 3)과 오른쪽(3, 2, 1)의 합이 같다.
	 *
	 * @param arr int[]
	 * @return 값이 같은 인덱스를 반환, 없다면 -1을 반환한다.
	 */
//	public static int findEvenIndex(int[] arr) {
//		int leftSum;
//		int rightSum;
//
//		for (int i = 0; i < arr.length; i++) {
//			leftSum = 0;
//			rightSum = 0;
//
//			if (i > 0) { // left
//				for (int j = 0; j < i; j++) {
//					leftSum += arr[j];
//				}
//			}
//
//			if (arr.length - 1 > i) { // right
//				for (int j = i + 1; j < arr.length; j++) {
//					rightSum += arr[j];
//				}
//			}
//
//			if (leftSum == rightSum) {
//				return i;
//			}
//		}
//
//		return -1;
//	}

	/**
	 * 위의 식은 O(n)이 좀 심한거 같아서 발상을 바꿔서
	 * 전부 더하고 빼는 식으로 변경해봄 ㅎ
	 *
	 * @param arr int[]
	 * @return 값이 같은 인덱스를 반환, 없다면 -1을 반환한다.
	 */
	public static int findEvenIndex(int[] arr) {
		int rightSum = 0;
		for (int i = 1; i < arr.length; i++) {
			rightSum += arr[i];
		}

		int leftSum = 0;

		if (rightSum == leftSum) {
			return 0;
		}

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				rightSum = 0;
			} else {
				rightSum -= arr[i + 1];
			}
			leftSum += arr[i];
			if (rightSum == leftSum) {
				return i + 1;
			}
		}

		return -1;
	}

}
