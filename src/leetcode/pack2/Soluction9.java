package leetcode.pack2;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/flood-fill/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction9 {

	public static void main(String[] args) {
		// 테스트 1
		int[][] image = new int[][]{
				{1, 1, 1},
				{1, 1, 0},
				{1, 0, 1},
		};
		floodFill(image, 1, 1, 2);

		image = new int[][]{
				{0, 0, 0},
				{0, 0, 0},
		};
		floodFill(image, 1, 0, 2);
	}

	private static class Pair {
		int sr;
		int sc;

		public Pair(int sr, int sc) {
			this.sr = sr;
			this.sc = sc;
		}
	}

	public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
		Queue<Pair> queue = new ArrayDeque<>();
		queue.offer(new Pair(sr, sc));

		int baseColor = image[sr][sc];
		int srLength = image.length - 1;
		int scLength = image[0].length - 1;
		while (!queue.isEmpty()) {
			Pair pair = queue.poll();
			int curSr = pair.sr;
			int curSc = pair.sc;

			int curColor = image[curSr][curSc];
			if (curColor == color) {
				continue;
			}

			if (curColor == baseColor) {
				image[curSr][curSc] = color;
			} else {
				continue;
			}

			if (curSr - 1 >= 0) {
				queue.offer(new Pair(curSr - 1, curSc));
			}
			if (curSr < srLength) {
				queue.offer(new Pair(curSr + 1, curSc));
			}
			if (curSc -1 >= 0){
				queue.offer(new Pair(curSr, curSc - 1));
			}
			if (curSc < scLength) {
				queue.offer(new Pair(curSr, curSc + 1));
			}
		}

		return image;
	}

}

