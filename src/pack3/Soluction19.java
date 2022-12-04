package pack3;

/**
 * Question : Is a num prime?
 * Writer : Kyudong
 * Date : 2022-12-04
 * Time : PM 11:17
 */
public class Soluction19 {

	public static void main(String[] args) {
		/*System.out.println(isPrime(0));
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(73));
		System.out.println(isPrime(75));
		System.out.println(isPrime(-1));
		System.out.println(isPrime(3));
		System.out.println(isPrime(5));
		System.out.println(isPrime(7));
		System.out.println(isPrime(41));
		System.out.println(isPrime(5099));*/
		System.out.println(isPrime(2319529));
	}

	/**
	 * 해당 수가 소수인지 판별한다. 음수는 무조건 false로 반환한다.
	 *
	 * @param num int
	 * @return true라면 소수
	 */
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++){
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
