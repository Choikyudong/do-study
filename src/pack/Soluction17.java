package pack;

/**
 * Question : The Wide-Mouthed frog!
 * Writer : Kyudong
 * Date : 2022-09-17
 * Time : 오전 2:32
 */
public class Soluction17 {

	public static void main(String[] args) {
		System.out.println(mouthSize("toucan"));
		System.out.println(mouthSize("ant bear"));
		System.out.println(mouthSize("alligator"));
	}

	/**
	 * 동물이 악어(alligator)일 경우 입 크기를 작게 주고 그 외의 동물들은 크게 돌려준다.
	 *
	 * 해당 메서드에서는 대소문자를 구별하지 않는다.
	 *
	 * @param animal 동물 이름, 영문자로 들어옴
	 * @return 악어일 경우 small, 그 외의 동물은 wide
	 */
	public static String mouthSize(final String animal){
		return animal.equalsIgnoreCase("alligator") ? "small" : "wide";
	}

}
