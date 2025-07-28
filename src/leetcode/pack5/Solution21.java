package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/encode-and-decode-tinyurl/">
 * 문제링크
 * </a>
 */
public class Solution21 {

	public static void main(String[] args) {
		 Codec codec = new Codec();

		 String url = "https://leetcode.com/problems/design-tinyurl";
		System.out.println(codec.encode(url));
		System.out.println(codec.decode(url));
	}

	public static class Codec {

		// Encodes a URL to a shortened URL.
		public String encode(String longUrl) {
			return longUrl;
		}

		// Decodes a shortened URL to its original URL.
		public String decode(String shortUrl) {
			return shortUrl;
		}
	}
}
