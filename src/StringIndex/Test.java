package StringIndex;

public class Test {
	public static void main(String[] args) {
		String age= "rahaman";
		System.out.println(age.charAt(5));
		System.out.println(age.charAt(0));
		System.out.println(age.charAt(3));
		try
		{
		System.out.println(age.charAt(9));
	    }
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("it is an string index out of bounds exception ");
		}
}
}
