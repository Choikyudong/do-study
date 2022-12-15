package pack3;

/**
 * Question : Who likes it?
 * Writer : Kyudong
 * Date : 2022-12-15
 * Time : PM 11:06
 */
public class Soluction27 {

	public static void main(String[] args) {
		long start = System.nanoTime();

		System.out.println(whoLikesIt());
		System.out.println(whoLikesIt("Peter"));
		System.out.println(whoLikesIt("Jacob", "Alex"));
		System.out.println(whoLikesIt("Max", "John", "Mark"));
		System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));

		long end = System.nanoTime();
		System.out.println(end - start);
	}

	/**
	 * 주어진 사람들이 좋아요를 눌렀을 때 보기좋게 예시에 맞춰 출력해준다.
	 * 예시)
	 * []                                -->  "no one likes this"
	 * ["Peter"]                         -->  "Peter likes this"
	 * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
	 * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
	 * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
	 *
	 * @param names 사람들
	 * @return 문자열
	 */
//	public static String whoLikesIt(String... names) {
//		if (names.length < 1) {
//			return "no one likes this";
//		} else if (names.length == 1) {
//			return names[0] + " likes this";
//		} else if (names.length == 2) {
//			return names[0] + " and " + names[1] + " like this";
//		} else if (names.length == 3) {
//			return names[0] +  ", " + names[1] + " and " + names[2] + " like this";
//		} else {
//			return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
//		}
//	}

	/**
	 * 조금 더 깔끔하게 바꿔봄
	 * 
	 * @param names 사람들
	 * @return 문자열
	 */
	public static String whoLikesIt(String... names) {
		switch (names.length) {
			case 0 : return "no one likes this";
			case 1: return String.format("%s likes this", names[0]);
			case 2: return String.format("%s and %s like this", names[0], names[1]);
			case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
			default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
		}
	}

}
