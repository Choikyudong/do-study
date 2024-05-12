package programmers.pack1;

import java.util.Arrays;

public class Soluction30 {

	public static void main(String[] args) {
		String[] nameList = new String[]{"may", "kein", "kain", "radi"};
		int[] yearing = new int[]{5, 10, 1, 3};
		String[][] photoList =  new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		System.out.println(Arrays.toString(solution(nameList, yearing, photoList)));
	}

	// 이게 맞나? ㅋ
	public static int[] solution(String[] nameList, int[] yearning, String[][] photoList) {
		int[] answer = new int[photoList.length];

		int index = 0;
		for (var photo : photoList) {
			int num = 0;
			for (var person : photo) {
				for (int i = 0; i < nameList.length; i++) {
					if (person.equals(nameList[i])) {
						num += yearning[i];
					}
				}
			}
			answer[index++] = num;
		}

		return answer;
	}
}
