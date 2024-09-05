package baekjoon.pack4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Soluction9 {

	public static void main(String[] args) throws IOException {

		// 1. 입력값 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int studends = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 2. 대기줄과 간식받는 공간을 만든다.
		Stack<Integer> stack = new Stack<>();
		stack.push(Integer.parseInt(st.nextToken()));

		// 3. 번호표를 돌며 확인한다.
		boolean isSad = false;
		int curNum = 1;
		for (int i = 1; i < studends; i++) {
			int num = Integer.parseInt(st.nextToken());

			// 대기소에 다음 차례 번호가 있을 경우 제거한다.
			for (int j = stack.size(); j > 0; j--) {
				if (stack.peek() == curNum) {
					stack.pop();
					++curNum;
				} else {
					break;
				}
			}

			if (stack.isEmpty() || stack.peek() > num) {
				stack.push(num);
			} else if (num > stack.peek()) {
				isSad = true;
				break;
			}
		}

		System.out.println(isSad ? "Sad" : "Nice");
	}

}
