package pack3;

import java.util.HashSet;
import java.util.Set;

/**
 * Question : Find the odd int
 * Writer : Kyudong
 * Date : 2022-10-26
 * Time : 오후 11:32
 */
public class Soluction3 {

	public static void main(String[] args) {
		System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
		System.out.println(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
		System.out.println(findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
		System.out.println(findIt(new int[]{10}));
		System.out.println(findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
		System.out.println(findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
	}

	/**
	 * 주어진 배열에서 홀수로 존재하는 값을 반환한다.
	 *
	 * 해당 배열에서 홀수로 존재하는 값은 하나이다.
	 *
	 * @param a int 배열
	 * @return 홀수로 존재하는 값
	 */
	public static int findIt(int[] a) {
		Set<Integer> set = new HashSet<>();
		for (var i : a) {
			set.add(i);
		}

		int count;
		int result = 0;
		for (var setNumber : set) {
			count = 0;
			for (var arrNumber : a) {
				if (setNumber == arrNumber) {
					count++;
				}
			}
			if (count % 3 == 0 || count == 1) {
				result = setNumber;
			}
		}

		return result;
	}

	/**
	 * 정답 중에서 훌륭한거 하나 들고옴
	 * 
	 * @param a int 배열
	 * @return 홀수로 존재하는 값
	 */
//	public static int findIt(int[] a) {
//		int xor = 0;
//
//		for (var i : a)
//			xor = xor ^ i;
//
//		return xor;
//	}

}
