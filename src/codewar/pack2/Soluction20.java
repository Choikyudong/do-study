package codewar.pack2;

/**
 * Question : Growth of a Population
 * Writer : Kyudong
 * Date : 2022-10-17
 * Time : 오후 11:22
 */
public class Soluction20 {

	public static void main(String[] args) {
		System.out.println(isTriangle(1,2,2));
		System.out.println(isTriangle(7,2,2));
	}

	/**
	 * 3개의 변으로 삼각형을 만들 수 있다면 true를 반환한다.
	 *
	 * @param a int
	 * @param b int
	 * @param c int
	 * @return true라면 삼각형이 가능
	 */
//	public static boolean isTriangle(int a, int b, int c) {
//		boolean isPossible = a + b > c;
//		if (isPossible) {
//			isPossible = a + c > b;
//		}
//		if (isPossible) {
//			isPossible = b + c > a;
//		}
//		return isPossible;
//	}

	/**
	 * 위에 방법처럼 할 필요가 없는 문제였음;
	 *
	 * @param a int
	 * @param b int
	 * @param c int
	 * @return true라면 삼각형이 가능
	 */
	public static boolean isTriangle(int a, int b, int c) {
		return a + b > c && a + c > b && b + c > a;
	}

}
