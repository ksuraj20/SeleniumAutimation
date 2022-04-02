/**
 * 
 */
package auto;

import java.util.Scanner;

import org.testng.annotations.Test;

/**
 * @author suraj
 *
 */
public class oddEvenAndReverseInput
{
	
	//@Test
	public void oddoeEven()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Entae a number");
			int input= scanner.nextInt();

			//Operation
			if(input%2 ==0)
				{
					System.out.println("Entered input is Even number");
				}
			else {
				System.out.println("Entered input number is odd");
			}
		}


	@Test
	public void reverseString()
		{
			char temp;
			String result="";
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your name");
			String nameString= scanner.nextLine();
			
			for(int i=nameString.length()-1;i>=0;i--)
				{
					System.out.print(nameString.charAt(i));
					temp=nameString.charAt(i);
					result=result+temp;
				}
			System.out.println("");
			
			if (nameString.equals(result))
				{
					System.out.println("Entered data is palindrome");
				}
			else
				{
					System.out.println("Entered data is not palindrome");
				}
		}


}
