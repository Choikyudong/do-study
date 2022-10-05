package pack2;

/**
 * Question : Get the Middle Character
 * Writer : Kyudong
 * Date : 2022-10-05
 * Time : 오후 11:08
 */
public class Soluction9 {

	public static void main(String[] args) {
		System.out.println(getMiddle("test"));
		System.out.println(getMiddle("middle"));
		System.out.println(getMiddle("testing"));
		System.out.println(getMiddle("A"));
		System.out.println(getMiddle("xcFCFTxUZwQgyaiJEBjnPYCmsCFOAxwphohKhAeWpauSczDFghWwaKKhMaykhCdEqkXSUDKfflwhkkchHilsIPCMhthcaQPlIQotgQMGfJNxHoJPhRZtndsbSXtEEDovjDHFSUuPuReVJvjFjCFbFDznbDHHTveWkuxQKxDHqCeHahoLgMewrhzYsWHwPhfXuhOnDpThpIeJOjFowQLLpQcVGnUYrTuxCLZOLXOmfiBIszKwUNlgziRuULeYZrPYKBSVYPcBGNcBhvsAGxLehdkwayCiTfVVcnzELhgOYlSOZSlHgmefOvgypMobBRuXzQlrXmoKchwYQsiJKEJpnWpkYwrfFYVvMhKyCYjEPGNeBhUnSElVYhDPPrgqahuUyxataRNxsciSaWZNiqinUVuKGsqzbqNrxaYLYsjQLCbztpOhiGffFIKCOkOoxdinxKVyoRrtghzBjMwVQXUVRMsSmzvDLABIPpIgFISdHEKLjpBBuOiVpHuDawmOzZqLSwObpVALlZOvzqnsvaBnpjBsWwWTvLRTqnuxmNpMlOQjBvBqHJIbgfhBzDscEbawnOFDZWRzUriACCeUrQnAHfqbconvijVDqYjltqFIRxUaCcEtSuocXgZtBwkZZcaMiGbnMIfcMgllkKhWIBMNNosDTzLWsnqmzHZRAgoKtwCpavHOVupEARAStAT"));
	}

	/**
	 * 주어진 문자열에서 중간 글자를 반환한다. 짝수일 경우 2개를 반환한다.
	 *
	 * @param word 문자열
	 * @return 중간 글자
	 */
	public static String getMiddle(String word) {
		int half = word.length() / 2;
		return word.length() % 2 == 0 ? word.substring(half - 1, half + 1) : String.valueOf(word.charAt(half));
	}

}
