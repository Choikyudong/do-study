package pack4;

/**
 * Question : Greed is Good
 * Writer : Kyudong
 * Date : 2023-01-09
 * Time : 오후 9:40
 */
public class Soluction8 {

	public static void main(String[] args) {
		System.out.println(greedy(new int[]{5,1,3,4,1}));
		System.out.println(greedy(new int[]{1,1,1,3,1}));
		System.out.println(greedy(new int[]{2,4,4,5,4}));
		System.out.println(greedy(new int[]{1,1,1,1,1}));
	}

	/**
	 * 육각형 주사위 5개를 굴려 점수로 변환한다.
	 * 다른 답안을 참고했슴
	 * @param dice 주사위 수
	 * @return 변환된 수
	 */
	public static int greedy(int[] dice){
		int[] checkNumber = new int[6];
		for (var number : dice) {
			checkNumber[--number] += 1;
		}
		return checkNumber[0]/3 * 1000 + checkNumber[0]%3 * 100 + checkNumber[1]/3 * 200
				+ checkNumber[2]/3 * 300 + checkNumber[3]/3 * 400
				+ checkNumber[4]/3 * 500 + checkNumber[4]%3 * 50 + checkNumber[5]/3 * 600;
	}

}
