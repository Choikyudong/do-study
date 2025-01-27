package baekjoon.pack9;

import java.util.Scanner;

public class Soluction6 {

	private static final StringBuilder sb = new StringBuilder();
	private static int goal;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		goal = scanner.nextInt();
		sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
		repeat(0);
		recurl(1);
		sb.append("라고 답변하였지.");
		System.out.println(sb);
	}

	private static void recurl(int depth) {
		if (depth == goal) {
			sb.append("____".repeat(depth)).append("\"재귀함수가 뭔가요?\"\n")
			.append("____".repeat(depth)).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n")
			.append("____".repeat(depth)).append("라고 답변하였지.\n");
			return;
		}
		repeat(depth);
		recurl(depth + 1);
		sb.append("____".repeat(depth)).append("라고 답변하였지.\n");
	}

	private static void repeat(int repeat) {
		sb.append("____".repeat(repeat)).append("\"재귀함수가 뭔가요?\"\n")
		.append("____".repeat(repeat)).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n")
		.append("____".repeat(repeat)).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n")
		.append("____".repeat(repeat)).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
	}

}
