package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Soluction26 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, int[]> color = new HashMap<>();
		color.put("black", new int[]{0, 1});
		color.put("brown", new int[]{1, 10});
		color.put("red", new int[]{2, 100});
		color.put("orange", new int[]{3, 1_000});
		color.put("yellow", new int[]{4, 10_000});
		color.put("green", new int[]{5, 100_000});
		color.put("blue", new int[]{6, 1_000_000});
		color.put("violet", new int[]{7, 10_000_000});
		color.put("grey", new int[]{8, 100_000_000});
		color.put("white", new int[]{9, 1_000_000_000});

		int firstColor = color.get(br.readLine())[0] * 10;
		int secondColor = color.get(br.readLine())[0];
		long lastColor = color.get(br.readLine())[1];
		System.out.println((firstColor + secondColor) * lastColor);
	}

}