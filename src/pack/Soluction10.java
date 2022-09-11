package pack;

/**
 * Question : Grade book
 * Writer : Kyudong
 * Date : 2022-09-12
 * Time : 오전 1:05
 */
public class Soluction10 {

	private static final char GRADE_A = 'A';
	private static final char GRADE_B = 'B';
	private static final char GRADE_C = 'C';
	private static final char GRADE_D = 'D';
	private static final char GRADE_F = 'F';

	public static void main(String[] args) {
		System.out.println(getGrade(95,90,93));
		System.out.println(getGrade(70,70,100));
		System.out.println(getGrade(70,70,70));
		System.out.println(getGrade(65,70,59));
		System.out.println(getGrade(44,55,52));
	}

	/**
	 * 3개값의 평균값에 따라 알맞는 등급을 반환한다.
	 *
	 * @param s1 값1
	 * @param s2 값2
	 * @param s3 값3
	 * @return char 등급
	 */
	public static char getGrade(final int s1, final int s2, final int s3) {
		int average = (s1 + s2 + s3) / 3;

		if (average >= 90) {
			return GRADE_A;
		} else if (average >= 80) {
			return GRADE_B;
		} else if (average >= 70) {
			return GRADE_C;
		} else if (average >= 60) {
			return GRADE_D;
		}

		return GRADE_F;
	}

}
