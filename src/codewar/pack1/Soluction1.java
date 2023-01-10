package codewar.pack1;

/**
 * Question : Grasshopper - Check for factor
 * Writer : Kyudong
 * Date : 2022-09-05
 * Time : 오후 10:50
 */
public class Soluction1 {

	public static void main(String[] args) {
		System.out.println(checkForFactor(10, 2));
		System.out.println(checkForFactor(63, 7));
		System.out.println(checkForFactor(2450, 5));
		System.out.println(checkForFactor(24612, 3));
	}

	/**
	 * 2, 3 은 6의 인지다. -> 2 * 3 = 6
	 * 즉 인자를 구하기 위해서는 0으로 나누어(%) 떨어지면 된다.
	 * 7 % 2 = 1 -> 3가지의 수를 어떤식으로 계산해도 딱 떨어지지는 않는다.
	 *
	 * @param base 기본값
	 * @param factor 기본값이 인자값인지 판단하는 수
	 * @return 해당 값이 인자인지 여부
	 */
	public static boolean checkForFactor(int base, int factor) {
		return base % factor == 0;
	}

}
