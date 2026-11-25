package advanceselenium;

public class ReverseString {
	public static void main(String[] args) {
		String s="Selenium";
		System.out.println(s.length());
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
	}
}
