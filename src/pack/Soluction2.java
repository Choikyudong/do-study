package pack;

/**
 * Question : Beginner - Reduce but Grow
 * Writer : Kyudong
 * Date : 2022-09-06
 * Time : 오후 10:32
 */
public class Soluction2 {

	public static void main(String[] args) {
		System.out.println(grow(new int[]{1}));
		System.out.println(grow(new int[]{1,2,3}));
		System.out.println(grow(new int[]{4,1,1,1,4}));
		System.out.println(grow(new int[]{2,2,2,2,2,2}));
	}

	/**
	 * 비어있지 않는 배열이 들어온다.
	 *
	 * @param x int 값을 지닌 비어있지않는 배열
	 * @return 배열의 모든 수를 곱한 값
	 */
	public static int grow(int[] x){
		int result = 1;

		for (int number : x) {
			result *= number;
		}

		return result;
	}

}
