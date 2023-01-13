package codility.pack1;

/**
 * Question : Task1 : binary gap
 * Writer : Kyudong
 * Date : 2023-01-13
 * Time : 오후 11:32
 */
public class Soluction1 {

	public static void main(String[] args) {
		System.out.println(solution(9));
		System.out.println(solution(529));
		System.out.println(solution(20));
		System.out.println(solution(15));
		System.out.println(solution(32));
	}

	/**
	 * 전달받은 정수(N)을 이진수로 변경 후 1과 1사이의 0의 갯수를 반환한다.
	 * <pre>
	 *     flag값을 뭘로 줄까 고민하다가 count를 -1을 주는걸로 해버림..
	 *     아니면 현재 수정된것처럼 boolean으로 줘도 될듯
	 * </pre>
	 * @param N 양의 정수
	 * @return 최대로 많은 0의 갯수
	 */
	public static int solution(int N) {
		int max = 0;
		int count = 0;
		int num;
		boolean onlyOneCheck = false;
		while (N > 0) {
			num = N % 2;
			N = N / 2;
			if (num == 1) {
				max = Math.max(max, count);
				count = 0;
				onlyOneCheck = true;
			}
			if (num == 0 && onlyOneCheck) {
				count++;
			}
		}
		return max;
	}
	
	/**
	 * 자바 메서드 이용해서 풀어봄
	 * @param N 양의 정수
	 * @return 최대로 많은 0의 갯수
	 */
//	public static int solution(int N) {
//		char[] chars = Integer.toBinaryString(N).toCharArray();
//		int max = 0;
//		int count = 0;
//		for (var num : chars) {
//			if (num == '1') {
//				max = Math.max(max, count);
//				count = 0;
//			}
//			if (num == '0') {
//				count++;
//			}
//		}
//		return max;
//	}

}
