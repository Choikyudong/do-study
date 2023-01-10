package codewar.pack2;

/**
 * Question : Vowel Count
 * Writer : Kyudong
 * Date : 2022-10-04
 * Time : 오후 11:47
 */
public class Soluction7 {

	public static void main(String[] args) {
		System.out.println(getCount("abracadabra"));
		System.out.println(getCount(""));
		System.out.println(getCount("pear tree"));
		System.out.println(getCount("o a kak ushakov lil vo kashu kakao"));
		System.out.println(getCount("tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty"));
	}

	/**
	 * 해당 문자열의 모음의 수를 반환한다.
	 *
	 * 해당 문제는 무조건 소문자이다.
	 * 영어 모음 = aeiou
	 *
	 * @param str 문자열
	 * @return 모음의 수
	 */
//	public static int getCount(String str) {
//		return (int) Arrays.stream(str.split(""))
//				.filter(s -> s.matches("[aeiou]")).count();
//	}

	/**
	 * 해당 문자열의 모음의 수를 반환한다.
	 *
	 * 해당 문제는 무조건 소문자이다.
	 * [^문자] <- 문자가 아닌 문자를 매칭한다.
	 *
	 * @param str 문자열
	 * @return 모음의 수
	 */
	public static int getCount(String str) {
		return str.replaceAll("[^aeiou]", "").length();
	}

}
