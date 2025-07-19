// Java program to demonstrate working of
// hashCode() and toString()

public class Student321 {
	static int last_roll = 100;
	int roll_no;

	// Constructor
	Student321()
	{
		roll_no = last_roll;
		last_roll++;
	}

	// Overriding hashCode()
	@Override public int hashCode() { return roll_no; }

	// Driver code
	public static void main(String args[])
	{
		Student321 s = new Student321();

		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
	}
}
