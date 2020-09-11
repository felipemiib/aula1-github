
public class Strings {

	public static void main(String[] args) {
		
		String original = "adcd ASDACD ASD asd ATDASD";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'z');
		String s07 = original.replace("adcd", "xyzt");
		
		int i = original.indexOf("ASD");
		int j = original.lastIndexOf("ASD");
		
		
		System.out.println("Original" + original);
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("Substring(2): -" + s04 + "-");
		System.out.println("Substring(2,9): -" + s05 + "-");
		System.out.println("Replace ('a','x'): -" + s06 + "-");
		System.out.println("Replace 'abc', 'xyz': -" + s07 + "-");
		System.out.println("indexOf 'ASD': -" + i + "-");
		System.out.println("indexOf 'ASD': -" + j + "-");
	}

}
