
package questions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question3
{

	public static void main(String [] args) throws IOException
	{
		ArrayList<Integer> result=new ArrayList<Integer>();
		ArrayList<Integer> workingList=new ArrayList<Integer>();



		Scanner scnr = new Scanner(System.in);

		int noOfTestcases=scnr.nextInt();

		for(int count=1;count<=noOfTestcases;count++)
		{


			int noOfInputs=scnr.nextInt();

			for(int inputCount=1;inputCount<=noOfInputs*2;inputCount++)
			{
				int temp=scnr.nextInt();
				workingList.add(temp);


			}

			Collections.sort(workingList);

			if(workingList.get(0)<0)
			{
				result.add((workingList.get(0) *(-1))+ 1 + workingList.get(workingList.size()-1));
			}
			else
			{
				result.add(workingList.get(0) + 1 + workingList.get(workingList.size()-1));

			}
			workingList.clear();



		}
		Collections.sort(result);

		for(Integer num: result)
		{
			System.out.println(num);
		}



		scnr.close();
	}



}
