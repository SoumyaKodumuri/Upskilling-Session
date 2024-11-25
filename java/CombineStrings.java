
public class CombineStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Soumya";
		String str2="Kodumuri";
		
		//combining strings
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));
		
		//wordcount
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		//Compare and equals
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String a="onboard";
		String b="onboard";
		System.out.println(a.compareTo(b));
		System.out.println(a.compareToIgnoreCase(b));
		
		//substrings
		System.out.println(str1.substring(2, 5));
		
		//split
		System.out.println(str2.split(str2, 5));
		//trim
		System.out.println(str2.trim());
		
		//toUpper toLower
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		//replace
		System.out.println(str1.replaceAll(str1, "Vyshnavi"));
		System.out.println(str1);
		
		//reverse
		StringBuilder sb=new StringBuilder(str1);
		System.out.println(sb.reverse());
		
		System.out.println(str1.indexOf('u'));
		System.out.println(str1.contains("Soumya")); //Contains
		
		
		
	}

}
