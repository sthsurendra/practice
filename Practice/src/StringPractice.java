
public class StringPractice {
	public static void main(String args[]) {
		
		
		String name="john doe";
		// String is a array of characters.. same as array index starts at zero
		
		// get first character (indexed zero) from the string
		System.out.println(name.charAt(0));// john
		// join name string value with the input 
		System.out.println(name.concat(" , last name")); 
		// return true if input exist inside name variable value
		System.out.println(name.contains("-"));// 
		// return true if name variable value ends with input 		
		System.out.println(name.endsWith("hn"));
		// return true if name variable value is equal to input	, case should match as well
		System.out.println(name.equals(" FIRST name ")); // John john 
		// return true if name variable value is equal to input	, case need not match		
		System.out.println(name.equalsIgnoreCase(" FIRST name "));// john JOHN
		// same as contains method, except it returns the index position of input first occurence
		System.out.println(name.indexOf("123")); // 123 8 123 8 123
		// same as contains method, except it returns the index position of input last occurence
		System.out.println(name.lastIndexOf("123")); // 14 8 123 8 123
		// replace all occurence of the input1 with input2
		System.out.println(name.replaceAll("23", "4"));
		// replace first occurence of the input1 with input2
		System.out.println(name.replaceFirst(" ", ":"));
		// split the string in array of strings by the input "first name" is converted to array containing value first and name
		// if split by space
		
		
		
	}

}
