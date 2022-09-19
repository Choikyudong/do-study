package pack;

/**
 * Question : Returning Strings
 * Writer : Kyudong
 * Date : 2022-09-19
 * Time : 오후 11:40
 */
public class Soluction21 {

	public static void main(String[] args) {
		System.out.println(greet("Ryan"));
	}

	/**
	 * 이름을 넣어서 문장을 완성시키는 건데; 넘 간단;
	 *
	 * @param name 이름
	 * @return 완성된 문장
	 */
//	public static String greet(String name) {
//		return "Hello, " + name + " how are you doing today?";
//	}

	/**
	 * 위의 방식보다 더 깔끔하게 처리 가능
	 *
	 * @param name 이름
	 * @return 완성된 문장
	 */
	public static String greet(String name) {
		return String.format("Hello, %s how are you doing today?", name);
	}
}
