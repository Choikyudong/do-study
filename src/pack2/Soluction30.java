package pack2;

import java.util.*;
import java.util.stream.*;

/**
 * Question : Testing 1-2-3
 * Writer : Kyudong
 * Date : 2022-10-24
 * Time : 오후 11:12
 */
public class Soluction30 {

	public static void main(String[] args) {
		System.out.println(number(Arrays.asList("a", "b", "c")));
		System.out.println(number(Arrays.asList("", "", "", "", "")));
	}

	/**
	 * 모든 문자에 채번이 된 리스트를 반환한다.
	 *
	 * 예시)
	 * [] --> []
	 * ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
	 *
	 * @param lines 문자열
	 * @return 채번이 된 리스트
	 */
//	public static List<String> number(List<String> lines) {
//		List<String> indexedLines = new ArrayList<>();
//		for (int i = 0; i < lines.size(); i++) {
//			indexedLines.add(String.format("%d: %s", i + 1, lines.get(i)));
//		}
//		return indexedLines;
//	}

	/**
	 * 여기서 IntStrem을 사용한 이유는
	 * lines의 채번과 동시에 리스트 접근을 위해서 이다.
	 *
	 * @param lines 문자열
	 * @return 채번이 된 리스트
	 */
	public static List<String> number(List<String> lines) {
		return IntStream.range(0, lines.size())
				.mapToObj(i -> String.format("%d: %s", i + 1, lines.get(i)))
				.collect(Collectors.toList());
	}

}
