package leetcode.pack6;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/find-the-number-of-winning-players/">
 * 문제링크
 * </a>
 */
public class Solution21 {

	public static void main(String[] args) {
		Solution21 solution = new Solution21();

		// 테스트1 : 12
		System.out.println((solution.numPrimeArrangements(5)));

		// 테스트2 : 682289015
		System.out.println((solution.numPrimeArrangements(100)));
	}

	public int numPrimeArrangements(int n) {
		boolean[] primeCheck = new boolean[101];
		Arrays.fill(primeCheck, true);
		primeCheck[0] = false;
		primeCheck[1] = false;
		for (int i = 2; i * i <= 100; i++) {
			if (primeCheck[i]) {
				for (int j = i * i; j <= 100; j += i) {
					primeCheck[j] = false;
				}
			}
		}

		int prime = 0;
		for (int i = 1; i <= n; i++) {
			if (primeCheck[i]) {
				prime++;
			}
		}

		long ans = 1;
		int mod = 1000000007;
		for (int i = prime; i > 1; i--) {
			ans = (ans * i) % mod;
		}

		int nonPrime = n - prime;
		for (int i = nonPrime; i > 0; i--) {
			ans = (ans * i) % mod;
		}

		return (int) ans;
	}

}

