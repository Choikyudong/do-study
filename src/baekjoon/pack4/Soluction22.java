package baekjoon.pack4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Soluction22 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Map<String, Boolean> infectionList = new HashMap<>();
		infectionList.put("ChongChong", true);

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String user1 = st.nextToken();
			String user2 = st.nextToken();
			if ("ChongChong".equals(user1)) {
				infectionList.put(user2, true);
			} else if ("ChongChong".equals(user2)) {
				infectionList.put(user1, true);
			} else if (infectionList.containsKey(user1)) {
				infectionList.put(user2, true);
			} else if (infectionList.containsKey(user2)) {
				infectionList.put(user1, true);
			}
		}

		System.out.println(infectionList.size());
	}

}
