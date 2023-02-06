package leetcode.pack1;

/**
 * Question : 69. Sqrt(x)
 * Writer : Kyudong
 * Date : 2023-02-06
 * Time : 오후 11:14
 */
public class Soluction13 {

	public static void main(String[] args) {
		System.out.println(mySqrt(4));
		System.out.println(mySqrt(8));
	}

	/**
	 * 제곱근을 구한 뒤 반환한다.
	 * 쉬움이라고 했는데 어려워서 사람들 답안을 참고함
	 * 이진검색을 이용한 방법이라고 한다.
	 * @param x int
	 * @return int
	 */
	public static int mySqrt(int x) {
		int i = 1;
		int result = x;
		int mid;
		while (result >= i) {
			mid = (i + result) / 2;
			if (x / mid == mid) {
				return mid;
			} else if (mid > x / mid) {
				result = mid - 1;
			} else {
				i = mid + 1;
			}
		}
		return result;
	}

}
