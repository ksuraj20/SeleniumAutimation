/**
 * 
 */
package newPackage;

import java.util.Arrays;

/**
 * @author suraj
 *
 */
public class AnagramString
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
		{
			//Anagram means the size and charecters are available in pair of strings in different order
			String input1 = "listen",input2 = "silent"; 
			char [] array1, array2;
			boolean isStringAnagram=false;

			if(input1.length() != input2.length())
				{
					System.out.println("The pair of the strings are not anagram");
				}

			array1 = input1.toCharArray();
			array2 = input2.toCharArray();

			Arrays.sort(array1);
			Arrays.sort(array2);

			for(int i=0; i<array1.length; i++)
				{
					if(array1[i] != array2[i])
						{
							System.out.println("The pair of the strings are not anagram");
							break;
						}
					else
						{
							isStringAnagram = true;
						}
				}

			if (isStringAnagram)
				{
					System.out.println("The pair of the strings are anagram");
				}

		}

}
