package programmers.pack1;

import java.util.Arrays;

public class Soluction33 {

	public static void main(String[] args) {
//		System.out.println(Arrays.toString(
//			solution(
//				5,
//				new int[]{9, 20, 28, 18, 11},
//				new int[]{30, 1, 21, 17, 28}
//			)
//		));
//		System.out.println(Arrays.toString(
//			solution(
//				6,
//				new int[]{46, 33, 33 ,22, 31, 50},
//				new int[]{27 ,56, 19, 14, 14, 10}
//			)
//		));
		System.out.println(Arrays.toString(
				solution(
						5,
						new int[]{0 ,0, 0, 0, 0 },
						new int[]{30 ,1 ,21 ,17, 28}
				)
		));
	}

	/*
	public static String[] solution(int n, int[] map1, int[] map2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			int number = map1[i] | map2[i];
			StringBuilder binaryString = new StringBuilder();
			while (number > 0) {
				int remainder = number % 2;
				binaryString.append(remainder);
				number = number / 2;
			}
			if (n > binaryString.length()) {
				int repeatLength = n - binaryString.length();
				for (int j = 0; j < repeatLength; j++) {
					binaryString.append("0");
				}
			}
			System.out.println(binaryString);
			answer[i] = binaryString.toString().replaceAll("1", "#").replaceAll("0", " ");
		}

		return answer;
	}
	*/

	// 개인적으로 비트 연산을 이용하여 정말 잘 풀었다고 생각되는 코드
	public static String[] solution(int n, int[] map1, int[] map2) {
		String[] answer = new String[n];
		for(int i = 0; i < n; i++) {
			int binary = map1[i] | map2[i];
			int w = n;
			StringBuilder str = new StringBuilder();
			while(w-- != 0) {
				str.append((binary % 2) == 1 ? "#" : " ");
				binary >>= 1;
			}
			answer[i] = String.valueOf(str.reverse());
		}
		return answer;
	}

}
