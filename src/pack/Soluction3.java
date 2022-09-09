package pack;

/**
 * Question : Twice as old
 * Writer : Kyudong
 * Date : 2022-09-07
 * Time : 오후 11:09
 */
public class Soluction3 {

	public static void main(String[] args) {
		System.out.println(TwiceAsOld(30,0));
		System.out.println(TwiceAsOld(30,7));
		System.out.println(TwiceAsOld(45,30));
	}

	/**
	 * 아버지가 아들보다 몇 년전에 2배가 되었는지 계산하는 문제
	 *
	 * 항상 0보다 크거나 같은 값을 반환한다.
	 *
	 * @param dadYears 아버지의 나이
	 * @param sonYears 아들의 나이
	 * @return int 차이값
	 */
	public static int TwiceAsOld(int dadYears, int sonYears){
		return Math.abs((sonYears * 2) - dadYears);
	}

}
