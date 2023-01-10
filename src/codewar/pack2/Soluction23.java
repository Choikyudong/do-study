package codewar.pack2;

/**
 * Question : Binary Addition
 * Writer : Kyudong
 * Date : 2022-10-20
 * Time : 오후 11:30
 */
public class Soluction23 {

	public static void main(String[] args) {
		System.out.println(binaryAddition(1, 1));
		System.out.println(binaryAddition(0, 1));
		System.out.println(binaryAddition(1, 1));
		System.out.println(binaryAddition(2, 2));
		System.out.println(binaryAddition(51, 12));
	}

	/**
	 * a와 b의 합을 2진수로 반환한다.
	 *
	 * 자바에서는 기본적으로 2진수로 변경해주는 메서드가 있다.
	 *
	 * @param a int
	 * @param b int
	 * @return 2진수로 전환된 값
	 */
	public static String binaryAddition(int a, int b){
		return Integer.toBinaryString(a + b);
	}

}
