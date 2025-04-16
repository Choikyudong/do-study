package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// 친구 관계 입력 받기
		char[][] friendRelation = new char[N][N];
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < N; j++) {
				friendRelation[i][j] = line.charAt(j);
			}
		}

		int maxTwoFriends = 0;

		// 각 사람마다 2-친구 수 계산
		for (int person = 0; person < N; person++) {
			// 2-친구 여부를 표시하는 배열
			boolean[] isTwoFriend = new boolean[N];

			// 직접 친구 체크
			for (int i = 0; i < N; i++) {
				if (friendRelation[person][i] == 'Y') {
					isTwoFriend[i] = true;
				}
			}

			// 친구의 친구 체크
			for (int i = 0; i < N; i++) {
				if (friendRelation[person][i] == 'Y') {
					for (int j = 0; j < N; j++) {
						if (friendRelation[i][j] == 'Y') {
							isTwoFriend[j] = true;
						}
					}
				}
			}

			// 자기 자신은 카운트에서 제외
			isTwoFriend[person] = false;

			// 2-친구 수 계산
			int count = 0;
			for (int i = 0; i < N; i++) {
				if (isTwoFriend[i]) {
					count++;
				}
			}

			// 최댓값 갱신
			maxTwoFriends = Math.max(maxTwoFriends, count);
		}

		System.out.println(maxTwoFriends);
	}
}