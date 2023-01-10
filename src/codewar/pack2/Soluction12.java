package codewar.pack2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Question : List Filtering
 * Writer : Kyudong
 * Date : 2022-10-07
 * Time : 오후 10:17
 */
public class Soluction12 {

	public static void main(String[] args) {
		System.out.println(filterList(List.of(1, 2, "a", "b")));
		System.out.println(filterList(List.of(1, "a", "b", 0, 15)));
		System.out.println(filterList(List.of(1, 2, "aasf", "1", "123", 123)));
	}

	/**
	 * 해당 리스트에 숫자를 제외한 값들은 모두 제거한다.
	 *
	 * @param list Object형 리스트
	 * @return 숫자값만 들어있는 리스트
	 */
//	public static List<Object> filterList(final List<Object> list) {
//		List<Object> newList = new ArrayList<>();
//		for (Object obj : list) {
//			if (obj instanceof Integer) {
//				newList.add(obj);
//			}
//		}
//		return newList;
//	}

	/**
	 * 해당 리스트에 숫자를 제외한 값들은 모두 제거한다.
	 *
	 * instanceof는 컴파일시에 객체의 타입을 확인하고
	 * isInstance는 런타임에서 확인한다.
	 *
	 * @param list Object형 리스트
	 * @return 숫자값만 들어있는 리스트
	 */
	public static List<Object> filterList(final List<Object> list) {
		//return list.stream().filter(e -> e instanceof Integer).collect(Collectors.toList());
		return list.stream().filter(Integer.class::isInstance).collect(Collectors.toList());
	}

}
