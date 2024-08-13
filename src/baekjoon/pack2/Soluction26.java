package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction26 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());

		while (x != 0 && y != 0 && z != 0) {
			if (!(x + y > z && x + z > y && y + z > x)) {
				System.out.println("Invalid");
			} else if (x == y && x == z) {
				System.out.println("Equilateral");
			} else if (x == y || x == z || y == z) {
				 System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
			st = new StringTokenizer(br.readLine(), " ");
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			z = Integer.parseInt(st.nextToken());
		}

	}

}
