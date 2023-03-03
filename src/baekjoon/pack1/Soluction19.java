package baekjoon.pack1;

import java.io.IOException;

/**
 * Question : 다이얼
 * Writer : Kyudong
 * Date : 2023-03-04
 * Time : 오전 1:15
 */
public class Soluction19 {

	public static void main(String[] args) throws IOException {
		int count = 0;
		char c;
		while (true) {
			c = (char) System.in.read();
			if (c == '\n') {
				break;
			}
			count += countingNumber(c);
		}
		System.out.println(count);
	}

	public static int countingNumber(char c) {
		int count = 0;
		switch (c) {
			case 'A': case 'B':	case 'C':
				count += 3;
				break;
			case 'D': case 'E':	case 'F':
				count += 4;
				break;
			case 'G': case 'H':	case 'I':
				count += 5;
				break;
			case 'J': case 'K':	case 'L':
				count += 6;
				break;
			case 'M': case 'N':	case 'O':
				count += 7;
				break;
			case 'P': case 'Q': case 'R':	case 'S':
				count += 8;
				break;
			case 'T': case 'U':	case 'V':
				count += 9;
				break;
			case 'W': case 'X':	case 'Y': case 'Z':
				count += 10;
				break;
			default:
				count += 0;
		}
		return count;
	}

}
