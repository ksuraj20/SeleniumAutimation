/**
 * 
 */
package Interview;

import java.util.Scanner;

/**
 * @author suraj
 *
 */
public class Demo
	{

		/**
		 * @param args
		 */
		public static void main(String[] args)
			{
				
			//Get Input data from console
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name");
			String nameString= sc.nextLine();
			System.out.println("Enter your DOB");
			String DOB = sc.nextLine();

			//operation
			//calculate the age as of today

			String[] parts = DOB.split("\\-");
			String Date= parts[0];
			String Month= parts[1];
			String Year= parts[2];

			int birthDay,birthMonth,birthYear;
			birthDay=Integer.parseInt(Date);
			birthMonth=Integer.parseInt(Month);
			birthYear=Integer.parseInt(Year);

			//To get vurrent date
			Date currentDate1 = new Date();
			SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
			String Cdate = dateFormat.format(currentDate1);

			parts=Cdate.split("\\-");
			int currentDate=Integer.parseInt(parts[0]);
			int currentMonth=Integer.parseInt(parts[1]);
			int currentYear=Integer.parseInt(parts[2]);

			if(birthDay>currentDate)
				{
					currentDate= currentDate + currentMonth-1;
					currentMonth=currentMonth-1;
				}
			if(birthMonth>currentMonth)
				{
					currentYear = currentYear-1;
					currentMonth=currentMonth+12;
				}

			int Days= currentDate-birthDay;
			int Months= currentMonth-birthMonth;
			int Years= currentYear-birthYear;
			System.out.println();
			System.out.println(nameString+", your age is "+Years+" Years "+Months+" Months "+Days+" Days");


		}
	}
