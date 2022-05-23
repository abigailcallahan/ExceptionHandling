
public class ExceptionHandlingPractice
	{

		public static void main(String[] args)
			{
				invalidCast();
				invalidNullReference();
				formatNums();

			}
		
		public static void invalidCast()
		{
			int nums[ ] = new int [4];
			try
				{
				nums[7] = 10;
				System.out.println("This line won't print");
				}
			catch (ClassCastException exc)
				{
				System.out.println("Oops. Class Cast Exception.");
				}
		}
		
		public static void invalidNullReference()
		{
			int nums[ ] = new int [4];
			try
				{
				//nums[0];
				System.out.println("This line won't print");
				}
			catch (NullPointerException exc)
				{
				System.out.println("Oops. Invalid Null Reference.");
				}
		}
		
		public static void formatNums()
		{
			//String nums[ ] = new String [4];
			String name = "abigail";
			try
				{
				//name = name / 3; 
				//nums[7] = 10;
				System.out.println(name);
				System.out.println("This line won't print");
				}
			catch (NumberFormatException exc)
				{
				System.out.println("Oops. Number Format Exception.");
				}
		}

	}
