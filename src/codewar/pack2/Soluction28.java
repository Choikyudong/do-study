package codewar.pack2;

import java.util.ArrayList;

/**
 * Question : Number of People in the Bus
 * Writer : Kyudong
 * Date : 2022-10-23
 * Time : 오후 10:15
 */
public class Soluction28 {

	public static void main(String[] args) {
		ArrayList<int[]> list = new ArrayList<>();
		list.add(new int[] {10,0});
		list.add(new int[] {3,5});
		list.add(new int[] {2,5});
		System.out.println(countPassengers(list));
	}

	/**
	 * 버스 터미널에 도착했을 때 남아있는 승객의 수를 집계한다.
	 *
	 * stops는 아래와 같은 값을 제공해준다.
	 * 배열의 0번째 인덱스는 승차하는 인원, 1번재는 하차하는 인원
	 * 그리고 stops가 끝났을 때 버스 터미널에 도착한 걸로 생각하면 된다.
	 * 
	 * @param stops 정거장마다 승객의 승차와 탑승값의 리스트
	 * @return 버스에 남아있는 승객 수
	 */
//	public static int countPassengers(ArrayList<int[]> stops) {
//		int passenger = 0;
//		for (var stopsResult : stops) {
//			passenger += stopsResult[0] - stopsResult[1];
//		}
//		return passenger;
//	}

	/**
	 * 버스 터미널에 도착했을 때 남아있는 승객의 수를 집계한다.
	 *
	 * @param stops 정거장마다 승객의 승차와 탑승값의 리스트
	 * @return 버스에 남아있는 승객 수
	 */
	public static int countPassengers(ArrayList<int[]> stops) {
		return stops.stream().mapToInt(stop -> stop[0] - stop[1]).sum();
	}

}
