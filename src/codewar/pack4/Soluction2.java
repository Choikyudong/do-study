package codewar.pack4;

/**
 * Question : Human Readable Time
 * Writer : Kyudong
 * Date : 2022-12-24
 * Time : 오전 1:01
 */
public class Soluction2 {

	public static void main(String[] args) {
		System.out.println(makeReadable(0));
		System.out.println(makeReadable(5));
		System.out.println(makeReadable(60));
		System.out.println(makeReadable(86399));
		System.out.println(makeReadable(359999));
	}

	/**
	 * 전달받은 초(seconds)를 사람이 읽을 수 있는 hh:mm:ss로 변환한다.
	 * @param seconds 초
	 * @return 변환된 문자열
	 */
//	public static String makeReadable(int seconds) {
//		int min = seconds / 60;
//		int hour = min / 60;
//		seconds %= 60;
//		min %= 60;
//
//		String hourResult = 10 > hour ? "0" + hour : String.valueOf(hour);
//		String minResult = 10 > min ? "0" + min : String.valueOf(min);
//		String secResult = 10 > seconds ? "0" + seconds : String.valueOf(seconds);
//
//		return String.format("%s:%s:%s", hourResult, minResult, secResult);
//	}


	/**
	 * 다른 사람꺼 보고 따라해봄
	 * @param seconds 초
	 * @return 변환된 문자열
	 */
	public static String makeReadable(int seconds) {
		return String.format("%02d:%02d:%02d", seconds/3600, (seconds/60)%60, seconds%60);
	}
	
}
