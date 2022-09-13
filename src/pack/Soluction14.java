package pack;

/**
 * Question : Basic Mathematical Operations
 * Writer : Kyudong
 * Date : 2022-09-13
 * Time : 오후 10:42
 */
public class Soluction14 {

	public static void main(String[] args) {
		System.out.println(basicMath("+", 4, 7));
		System.out.println(basicMath("-", 15, 18));
		System.out.println(basicMath("*", 5, 5));
		System.out.println(basicMath("/", 49, 7));
	}

	/**
	 * 주어진 연산방법에 따라 주어진 수를 계산하여 반환한다.
	 * 
	 * 함수형식으로 한 번 풀어보고 싶었음 ㅎ
	 * 
	 * @param op 연산방법
	 * @param v1 숫자1
	 * @param v2 숫자2
	 * @return 주어진 연산방법에 연산된 수
	 */
	public static Integer basicMath(String op, int v1, int v2) {
		int result = 0;
		switch (op) {
			case "+" :
				Function plus = Integer::sum;
				result = plus.math(v1, v2);
				break;
			case "-" :
				Function minus = ((x, y) -> x - y);
				result = minus.math(v1, v2);
				break;
			case "*" :
				Function multi = ((x, y) -> x * y);
				result = multi.math(v1, v2);
				break;
			case "/" :
				Function divi = ((x, y) -> x / y);
				result = divi.math(v1, v2);
				break;
		}
		return result;
	}

}

@FunctionalInterface
interface Function {
	int math(int x, int y);
}
