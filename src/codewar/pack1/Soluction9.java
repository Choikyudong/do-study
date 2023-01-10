package codewar.pack1;

/**
 * Question : Messi goals function
 * Writer : Kyudong
 * Date : 2022-09-11
 * Time : 오후 10:20
 */
public class Soluction9 {

	public static void main(String[] args) {
		System.out.println(goals(0, 0, 0));
		System.out.println(goals(43, 10, 5));
	}

	/**
	 * 3가지의 수를 더한값을 반환한다.
	 * 
	 * @param laLigaGoals int
	 * @param copaDelReyGoals int
	 * @param championsLeagueGoals int
	 * @return 3개의 매개변수를 더한 값
	 */
//	public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
//		return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
//	}


	/**
	 * 위의 문제에서 3가지 이상의 값을 받았을 때로 구현해봄
	 *
	 * 스트림을 생성해서 해도 좋지만 수가 많지 않은 환경에서는
	 * 스트림이 오히려 느릴때가 더 많다.
	 *
	 * @param goals int값들
	 * @return int값을 더한 값
	 */
	public static int goals(int... goals) {
		//return Arrays.stream(goals).sum();
		int totalGoals = 0;
		for (int goal : goals) {
			totalGoals += goal;
		}
		return totalGoals;
	} 
	
}
