package programmers.pack1;

public class Soluction12 {
	public static void main(String[] args) {
		int[] question = new int[]{1, 7, 1, 2};
		System.out.println(solution(question));
	}

	public static String solution(int[] food) {
		int[] arr = new int[food.length - 1];
		for (int i = 1; i < food.length; i++) {
			arr[i - 1] = food[i] / 2;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			int count = arr[i];
			for (int j = 0; j < count; j++) {
				sb.append(i + 1);
			}
		}
		sb.append("0");
		for (int i = arr.length; i > 0; i--) {
			int count = arr[i - 1];
			for (int j = 0; j < count; j++) {
				sb.append(i);
			}
		}
		return sb.toString();
	}

}
