package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction25 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());
		int sum = x + y + z;
		if (sum != 180) {
			System.out.println("Error");
		} else if (x == 60 && y == 60 && z == 60) {
			System.out.println("Equilateral");
		} else if (x == y || x == z || y == z) {
			System.out.println("Isosceles");
		} else {
			System.out.println("Scalene");
		}
	}

}
