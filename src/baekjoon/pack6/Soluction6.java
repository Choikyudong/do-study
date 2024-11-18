package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		for (int i = 0; i < 3; i++) {
			if (number != 0) {
				number++;
				continue;
			}
			String str = br.readLine();
			char test = str.charAt(0);
			if (test >= 47 && test <= 57) {
				number = Integer.parseInt(str) + 1;
			}
		}
		String answer = "";
		if (number % 3 == 0 && number % 5 == 0) {
			answer = "FizzBuzz";
		} else if (number % 3 == 0) {
			answer = "Fizz";
		} else if (number % 5 == 0) {
			answer = "Buzz";
		}
		System.out.println(answer.isBlank() ? number : answer);
	}

}
