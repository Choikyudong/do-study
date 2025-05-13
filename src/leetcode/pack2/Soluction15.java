package leetcode.pack2;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/find-all-groups-of-farmland/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction15 {

	public static void main(String[] args) {
		// 테스트 1
		int[][] land = new int[][]{
				{1, 0, 0},
				{0, 1, 1},
				{0, 1, 1},
		};
		int[][] result = findFarmland(land); // [[0,0,0,0],[1,1,2,2]]

		// 테스트 2
		land = new int[][]{
				{1, 1},
				{1, 1},
		};
		result = findFarmland(land); // [[0,0,1,1]]

		// 테스트 3
		land = new int[][]{
				{0},
		};
		result = findFarmland(land); // []

		// 테스트 4
		land = new int[][]{
				{0},
				{0},
				{1},
				{1},
				{1},
				{0},
				{1},
				{1},
		};
		result = findFarmland(land); // []

	}

	/* 15ms로 너무 느림!
	public int[][] findFarmland(int[][] land) {
		if (land == null) {
			return new int[0][0];
		}

		int M = land.length;
		int N = land[0].length;
		List<int[]> lands = new ArrayList<>();
		for (int r1 = 0; r1 < M; r1++) {
			for (int c1 = 0; c1 < N; c1++) {
				if (land[r1][c1] == 1) {
					int r2 = r1;
					int c2 = c1;
					for (int r = r1; r < M; r++) {
						for (int c = c1; c < N; c++) {
							if (land[r][c] == 0) {
								break;
							}
							r2 = r;
							c2 = c;
							land[r][c] = 0;
						}
						if (r + 1 >= M || land[r + 1][c2] == 0) {
							break;
						}
					}
					lands.add(new int[]{r1, c1, r2, c2});
				}
			}
		}

		return lands.toArray(new int[lands.size()][]);
	}
	*/
	
	// 3ms로 개선함
	public static int[][] findFarmland(int[][] land) {
		if (land == null) {
			return new int[0][0];
		}

		int M = land.length;
		int N = land[0].length;
		List<int[]> lands = new ArrayList<>();
		for (int r1 = 0; r1 < M; r1++) {
			for (int c1 = 0; c1 < N; c1++) {
				if (land[r1][c1] == 1) {
					int r2 = r1;
					int c2 = c1;
					for (int r = r1; r < M; r++) {
						for (int c = c1; c < N; c++) {
							if (land[r][c] == 0) {
								break;
							}
							r2 = r;
							c2 = c;
							land[r][c] = 0;
						}
						if (r + 1 >= M || land[r + 1][c2] == 0) {
							break;
						}
					}
					lands.add(new int[]{r1, c1, r2, c2});
				}
			}
		}

		return lands.toArray(new int[lands.size()][]);
	}

}

