package pack2;

/**
 * Question : Complementary DNA
 * Writer : Kyudong
 * Date : 2022-10-16
 * Time : 오전 12:02
 */
public class Soluction17 {

	public static void main(String[] args) {
		System.out.println(makeComplement("AAAA"));
		System.out.println(makeComplement("ATTGC"));
		System.out.println(makeComplement("GTAT"));
	}

	/**
	 * DNA쪽에서는 A를 T로 C를 G로 바꾼다 카던데 그걸 구현한다.
	 *
	 * 예시)
	 * "ATTGC" --> "TAACG"
	 * "GTAT" --> "CATA"
	 *
	 * @param dna 대문자로 구성된 문자열
	 * @return 예시에 따라 변환된 문자열
	 */
	public static String makeComplement(String dna) {
		StringBuilder sb = new StringBuilder();
		for (String str : dna.split("")) {
			switch (str) {
				case "A" :
					sb.append("T");
					break;
				case "T" :
					sb.append("A");
					break;
				case "G" :
					sb.append("C");
					break;
				case "C" :
					sb.append("G");
					break;
				default :
					sb.append(str);
					break;
			}
		}
		return sb.toString();
	}

}
