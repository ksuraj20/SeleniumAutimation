/**
 * 
 */
package newPackage;

/**
 * @author suraj
 *
 */
public class ReverseArrayString
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
		{

			String[] input = {"abcd","mno","xyz"};
			String[] reverseInput = new String[input.length];
			String[] outputList = new String[input.length]; 
			int j=0;
			String output = "",temp="";
			char c;

			//Print the inpur array
			System.out.print("Input:- ");
			for(String in : input)
				System.out.print(in+", ");

			System.out.println("");

			//Reverse array
			for(int i=input.length-1;i >=0;i--)
				{
					reverseInput[j]=input[i];
					j++;
				}


			//Reverse the array element
			for (int k=0; k< reverseInput.length; k++)
				{
					temp=reverseInput[k];
					for(int l=temp.length()-1; l >=0; l--)
						{
							c=temp.charAt(l);
							output+=c;
						}
					outputList[k]=output;
					output="";
				}

			//Print the output array
			System.out.print("Output:- ");
			for(String dc : outputList)
				{
					System.out.print(dc+", ");
				}
		}

}
