package baekjoon.pack7;

import java.io.IOException;

public class Soluction26 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	private static int N;
	private static int M;
	private static int max;
	private static int[][] arr;
	public static void main(String[] args) throws IOException {
		N = read();
		M = read();
		arr = new int[N][M];
		for (int n = 0; n < N; n++) {
			for (int m = 0; m < M; m++) {
				arr[n][m] = read();
			}
		}

		int[][][] typeA = {
				{{0, 0}, {0, 1}, {0, 2}, {0, 3}},
				{{0, 0}, {1, 0}, {2, 0}, {3, 0}},
				{{0, 0}, {0, -1}, {0, -2}, {0, -3}},
				{{0, 0}, {-1, 0}, {-2, 0}, {-3, 0}}
		};

		int[][][] typeB = {
				{{0, 0}, {0, 1}, {1, 0}, {1, 1}}
		};

		int[][][] typeC = {
				{{0, 0}, {1, 0}, {2, 0}, {2, 1}}, // 기본 형태
				{{0, 0}, {0, -1}, {0, -2}, {1, -2}},
				{{0, 0}, {-1, 0}, {-2, 0}, {-2, -1}},
				{{0, 0}, {0, 1}, {0, 2}, {1, 2}},
				{{0, 0}, {1, 0}, {2, 0}, {2, -1}}, // 대칭 형태
				{{0, 0}, {0, -1}, {0, -2}, {-1, -2}},
				{{0, 0}, {-1, 0}, {-2, 0}, {-2, 1}},
				{{0, 0}, {0, 1}, {0, 2}, {-1, 2}}
		};

		int[][][] typeD = {
				{{0, 0}, {1, 0}, {1, 1}, {2, 1}}, // 기본 형태
				{{0, 0}, {0, -1}, {1, -1}, {1, -2}},
				{{0, 0}, {-1, 0}, {-1, -1}, {-2, -1}},
				{{0, 0}, {0, 1}, {-1, 1}, {-1, 2}},
				{{0, 0}, {1, 0}, {1, -1}, {2, -1}}, // 대칭 형태
				{{0, 0}, {0, -1}, {-1, -1}, {-1, -2}},
				{{0, 0}, {-1, 0}, {-1, 1}, {-2, 1}},
				{{0, 0}, {0, 1}, {1, 1}, {1, 2}}
		};

		int[][][] typeE = {
				{{0, 0}, {0, 1}, {0, 2}, {1, 1}}, // 기본형태
				{{0, 0}, {1, 0}, {2, 0}, {1, -1}},
				{{0, 0}, {0, -1}, {0, -2}, {-1, -1}},
				{{0, 0}, {-1, 0}, {-2, 0}, {-1, 1}},
				{{0, 0}, {0, 1}, {0, 2}, {-1, 1}}, // 대칭 형태
				{{0, 0}, {1, 0}, {2, 0}, {1, 1}},
				{{0, 0}, {0, -1}, {0, -2}, {1, -1}},
				{{0, 0}, {-1, 0}, {-2, 0}, {-1, -1}}
		};

		max = 0;
		for (int n = 0; n < N; n++) {
			for (int m = 0; m < M; m++) {
				iterType(typeA, n, m);
				iterType(typeB, n, m);
				iterType(typeC, n, m);
				iterType(typeD, n, m);
				iterType(typeE, n, m);
			}
		}
		System.out.println(max);
	}

	private static void iterType(int[][][] types, int n, int m) {
		for (int[][] type : types) {
			int sum = 0;
			boolean valid = true;
			for (int[] t : type) {
				int nn = n + t[0];
				int nm = m + t[1];
				if (!indexCheck(nn, nm)) {
					valid = false;
					break;
				}
				sum += arr[nn][nm];
			}
			if (valid) {
				max = returnMax(max, sum);
			}
		}
	}

	private static boolean indexCheck(int nn, int nm) {
		return nn >= 0 && N > nn && nm >= 0 && M > nm;
	}

	private static int returnMax(int max, int sum) {
		return Math.max(max, sum);
	}

}
