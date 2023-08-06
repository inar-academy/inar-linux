public class Multiply{
	public static void main(String[] args){
		System.out.println("4 * 3 = 12");
		System.out.println("----------------");
		System.out.println("4");
		System.out.println("*");
		System.out.println("3");
		System.out.println("=");
		System.out.println("12");
		System.out.println("----------------");
		System.out.print("4 * 3 =");
		System.out.println(4 * 3 );
		System.out.println("----------------");

		/* String and integer can be concatinated only to a 
		 * String either through + or via concat method

		  String + integer => String
		  integer +*-/... integer => integer
		*/
		System.out.println("4 * 3 = " + (4 * 3));
		System.out.println("4 * 3 = " + 4 * 3);
		System.out.println("4 + 3 = " + 4 + 3);
		System.out.println("4 - 3 = " + (4 - 3));
		System.out.println("4 + 3 = " + (4 + 3));
		System.out.println("19 % 3 = " + 19 % 3);
	}
}
