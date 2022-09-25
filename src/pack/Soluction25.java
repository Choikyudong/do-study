package pack;

/**
 * Question : Thinkful - Logic Drills: Traffic light
 * Writer : Kyudong
 * Date : 2022-09-25
 * Time : 오후 10:29
 */
public class Soluction25 {

	public static void main(String[] args) {
		System.out.println(updateLight("red"));
		System.out.println(updateLight("green"));
		System.out.println(updateLight("yellow"));
	}

	/**
	 * 다음 신호색을 반환한다.
	 *
	 * 예시)
	 * green -> yellow -> red -> green -> ..
	 * 
	 * @param current 현재 신호색
	 * @return 다음 신호색
	 */
	public static String updateLight(String current) {
		String light = "";

		switch (current) {
			case "green" :
				light = "yellow";
				break;
			case "yellow" :
				light = "red";
				break;
			case "red" :
				light = "green";
				break;
		}

		return light;
	}

}
