package pack4;

/**
 * Question : RGB To Hex Conversion
 * Writer : Kyudong
 * Date : 2022-12-26
 * Time : 오전 5:57
 */
public class Soluction3 {

	public static void main(String[] args) {
//		System.out.println(rgb(0, 0, 0));
//		System.out.println(rgb(1, 2, 3));
//		System.out.println(rgb(255, 255, 255));
//		System.out.println(rgb(254, 253, 300));
//		System.out.println(rgb(-20, 275, 125));
		System.out.println(rgb(165, 265, 330));
	}

	public static String rgb(int r, int g, int b) {
		int[] arr = new int[3];

		arr[0] = r;
		arr[1] = g;
		arr[2] = b;

		int i = 0;
		for (var n : arr) {
			if (n > 255) {
				arr[i] = 255;
			} else if (0 > n) {
				arr[i] = 0;
			}
			i++;
		}

		return String.format("%02X%02X%02X", arr[0], arr[1], arr[2]);
	}

}
