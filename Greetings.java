import java.util.Scanner;
public class Greetings
{
	public static void main(String[] args) 
	{
		Scanner name = new Scanner(System.in);
                                        System.out.print("Enter your name: ");
		String i = name.nextLine();
                                        System.out.println("Hello there " + i );
	}

}
