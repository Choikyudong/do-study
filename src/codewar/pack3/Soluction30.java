package codewar.pack3;

/**
 * Question : Take a Ten Minutes Walk
 * Writer : Kyudong
 * Date : 2022-12-21
 * Time : PM 10:34
 */
public class Soluction30 {

	public static void main(String[] args) {
		System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
		System.out.println(isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
		System.out.println(isValid(new char[] {'w'}));
		System.out.println(isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
		System.out.println(isValid(new char[] {'e', 'e', 'e', 'w', 'n', 's', 'n', 's', 'e', 'w'}));
		System.out.println(isValid(new char[] {'n', 'e', 'n', 'e', 'n', 'e', 'n', 'e', 'n', 'e'}));
		System.out.println(isValid(new char[] {'e', 'e', 'e', 'w', 'w', 's', 's', 's', 's', 's'}));
	}

	/**
	 * 10번 걸어서 제자리로 돌아오면 true를 반환한다.
	 *
	 * <p>
	 * 다른 정답을 보니 int x, int y식으로 2개로 하면 되는데
	 * 하나로 해서 뭔가 이해하기 힘들게 만들었음..
	 * </p>
	 *
	 * @param walk 걷는 방향
	 * @return 제자리면 true, 아닐경우 false
	 */
	public static boolean isValid(char[] walk) {
		if (walk.length != 10)
			return false;

		int result = 0;

		for (var move : walk) {
			switch (move) {
				case 'n' :
					result += 1;
					break;
				case 's' :
					result -= 1;
					break;
				case 'e' :
					result += 50;
					break;
				case 'w' :
					result -= 50;
					break;
				default:
					result += 0;
					break;
			}
		}

		return result == 0;
	}

}
