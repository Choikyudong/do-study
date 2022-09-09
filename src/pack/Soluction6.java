package pack;

import java.util.Arrays;

/**
 * Question : You only need one - Beginner
 * Writer : Kyudong
 * Date : 2022-09-10
 * Time : 오전 12:16
 */
public class Soluction6 {

	public static void main(String[] args) {
		System.out.println(check(new Object[] {66, 101}, 66));
		System.out.println(check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));
		System.out.println(check(new Object[] {'t', 'e', 's', 't'}, 'e'));
		System.out.println(check(new Object[] {"what", "a", "great", "kata"}, "kat"));
	}

	/**
	 * x의 값이 a에 포함되어 있는지 확인한다.
	 *
	 * 이 문제는 어쩌다 보니 3가지 방법으로 해결했다.
	 * 해당 컴퓨터로 속도를 측정을 했을 떄는
	 *  for문    스트림   리스트
	 * 482500  1830000  497700
	 * 결과가 나왔는데 뭐가 더 좋은지는 스스로 판단해보는게 맞을꺼 같다.
	 *
	 *
	 * @param a 문자, 문자열 또는 int 값이 들어있는 배열
	 * @param x a에 들어오는 값에 해당하는 타입
	 * @return x의 값이 a에 포함되어 있다면 true를 반환한다.
	 */
	public static boolean check(Object[] a, Object x) {
		// 1. 스트림을 이용하여 해결
		//return Arrays.stream(a).anyMatch(o -> o.equals(x));

		// 2. List형태로 변환 후 메서드로 해결
		//return Arrays.asList(a).contains(x);

		// 3. for 문을 이용
		for (Object objVale : a) {
			if (objVale.equals(x)) {
				return true;
			}
		}

		return false;
	}

}
