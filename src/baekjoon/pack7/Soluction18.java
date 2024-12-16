package baekjoon.pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Soluction18 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			char[] commands = br.readLine().toCharArray();
			int length = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String[] strArr = str.substring(1, str.length() - 1).split(",");

			Deque<Integer> deque = new LinkedList<>();
			if (length > 0) {
				for (String s : strArr) {
					deque.add(Integer.parseInt(s));
				}
			}

			boolean isR = false; // 뒤집기 명령 여부
			boolean isError = false; // 에러 여부
			for (char command : commands) {
				if (command == 'R') {
					isR = !isR;
				} else {
					if (deque.isEmpty()) {
						sb.append("error").append('\n');
						isError = true;
						break;
					} else if (isR) {
						deque.pollLast();
					} else {
						deque.pollFirst();
					}
				}
			}
			
			// 결과 처리
			if (!isError) {
				sb.append("[");
				if (isR) {
					while (!deque.isEmpty()) {
						sb.append(deque.pollLast());
						if (!deque.isEmpty()) {
							sb.append(',');
						}
					}
				} else {
					while (!deque.isEmpty()) {
						sb.append(deque.pollFirst());
						if (!deque.isEmpty()) {
							sb.append(',');
						}
					}
				}
				sb.append("]").append('\n');
			}
		}
		System.out.println(sb);
	}

}
