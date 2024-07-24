package pratcie.recursive;

import java.util.Stack;

public class Recursive1 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(factorial(n));

		// for문으로 한다면?
		int temp = 1;
		for (int i = 1; i <= n; i++) {
			temp += temp * (i - 1);
		}
		System.out.println(temp);

		int x = 22;
		int y = 8;
		System.out.println(gcd(x, y));

		recur1(4);
		recur2(4);
		recur3(4);
	}

	static int factorial(int n) {
		if (n > 1) {
			return n * factorial(n - 1);
		}
		return 1;
	}

	static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		}
		return gcd(y, x % y);
	}

	static void recur1(int n) {
		if (n > 0) {
			recur1(n - 1);
			System.out.println(n);
			recur1(n - 2); // 꼬리재귀
		}
	}

	static void recur2(int n) {
		while (n > 0) {
			recur2(n - 1);
			System.out.println(n);
			n = n - 2; // 꼬리재귀 제거
		}
	}

	static void recur3(int n) {
		Stack<Integer> stack = new Stack<>();
		while (true) {
			if (n > 0) {
				stack.push(n);
				n -= 1;
				continue;
			}
			if (!stack.isEmpty()) {
				n = stack.pop();
				System.out.println(n);
				n -= 2;
				continue;
			}
			break;
		}
	}

}
