package pack;

/**
 * Question : Simple multiplication
 * Writer : Kyudong
 * Date : 2022-09-17
 * Time : 오전 2:45
 */
public class Soluction18 {

	public static void main(String[] args) {
		System.out.println(simpleMultiplication(1));
		System.out.println(simpleMultiplication(4));
		System.out.println(simpleMultiplication(21));
		System.out.println(simpleMultiplication(22));
	}

	/**
	 * 주어진 숫자 n이 홀수라면 9를 곱하고 짝수라면 8을 곱한 뒤 값을 반환한다.
	 *
	 * @param n 정수
	 * @return 곱해진 수
	 */
//	public static int simpleMultiplication(int n) {
//		return n % 2 == 0 ? n * 8 : n * 9;
//	}

	/**
	 * 비트연산으로 해결한 방법이 있기에 한 번 이용해봤음
	 *
	 * 예시)
	 * n에 3이 들어올 경우 3을 bit로 계산하면 11이다.
	 * 11
	 *  1
	 * 일 경우 끝자리 1만 같으므로 1을 반환한다.
	 *
	 * @param n 정수
	 * @return 곱해진 수
	 */
	public static int simpleMultiplication(int n) {
		return n * (8 + (n & 1));
	}
	
}
