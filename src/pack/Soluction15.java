package pack;

/**
 * Question : Seats in Theater
 * Writer : Kyudong
 * Date : 2022-09-14
 * Time : 오후 10:55
 */
public class Soluction15 {

	public static void main(String[] args) {
		System.out.println(seatsInTheater(16,11,5,3));
		System.out.println(seatsInTheater(1,1,1,1));
		System.out.println(seatsInTheater(13,6,8,3));
		System.out.println(seatsInTheater(60,100,60,1));
		System.out.println(seatsInTheater(1000,1000,1000,1000));
	}

	/**
	 * 현재 앉아있는 자리에서 출구까지 갈 때 뒤에 앉아있는 사람의 수를 계산하여 반환한다.
	 *
	 * 행의 값에 + 1을 하는 이유는 내가 그 자리에 앉아있기 때문이다.
	 *
	 * @param nCols 극장의 총 행의 값
	 * @param nRows 극장의 총 열의 값
	 * @param col 내가 앉아있는 행의 값
	 * @param row 내가 앉아있는 열의 값
	 * @return 뒤에 앉아있는 사람의 수
	 */
	public static int seatsInTheater(int nCols, int nRows, int col, int row) {
		return (nCols - col + 1) * (nRows - row);
	}

}
