package pack;

/**
 * Question : School Paperwork
 * Writer : Kyudong
 * Date : 2022-09-14
 * Time : 오후 11:27
 */
public class Soluction16 {

	public static void main(String[] args) {
		System.out.println(paperWork(5, 5));
		System.out.println(paperWork(5, -5));
	}

	/**
	 * 반에 학생 수 만큼 종이를 가져오도록 계산하자
	 *
	 * n 또는 m의 값이 0미만일 때는 0을 반환한다.
	 *
	 * @param n 학생수
	 * @param m 종이
	 * @return 계산된 종이수
	 */
	public static int paperWork(int n, int m) {
		return (0 > n || 0 > m) ? 0 : n * m;
	}

}
