package programmers.pack1;

public class Soluction24 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{-2, 3, 0, 2, -5}));
		System.out.println(solution(new int[]{-3, -2, -1, 0, 1, 2, 3}));
		System.out.println(solution(new int[]{-1, 1, -1, 1}));
	}

	/**
	 * number에 있는 학생 번호를 3개 더했을 때 0이 되면 삼총사라고 한다.
	 * @param number 학생 번호 목록
	 * @return 삼총사 수
	 */
	public static int solution(int[] number) {
		int answer = 0;
		for (int i = 0; i < number.length; i++) {
			int curNum = number[i];
			for (int j = i + 1; j < number.length; j++) {
				int secNum = number[j];
				for (int k = j + 1; k < number.length; k++) {
					int thNum = number[k];
					if (curNum + secNum + thNum == 0) {
						answer++;
					}
				}
			}
		}
		return answer;
	}

}
