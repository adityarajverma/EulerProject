package questions;



public class Question1
{
	/*
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
	 * get 3, 5, 6 and 9. The sum of these multiples is 23.
	 *
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 */

	public static void main(String[] args)
	{
		int i=0;
		int sum=0;

		while(i<1000)
		{
			if (i%3==0)
			{
				System.out.println(i);
				sum=sum+i;

			}


			if (i%5==0)
			{
				System.out.println(i);
				sum=sum+i;

			}

			if(i%15==0)
			{
				sum=sum-i;

			}

			i++;

		}
		System.out.println(sum);

	}


	/*
	 * First of all, stop thinking on the number 1000 and turn your attention to the
	 * number 990 instead. If you solve the problem for 990 you just have to add
	 * 993,995,996 & 999 to it for the final answer. This sum is (a)=3983 Count all
	 * the #s divisible by 3: From 3... to 990 there are 330 terms. The sum is
	 * 330(990+3)/2, so (b)=163845
	 *
	 * Count all the #s divisible by 5: From 5... to 990 there are 198 terms. The
	 * sum is 198(990+5)/2, so (c)=98505 Now, the GCD (greatest common divisor) of 3
	 * & 5 is 1, so the LCM (least common multiple) should be 3×5=15.
	 *
	 * This means every number that divides by 15 was counted twice, and it should
	 * be done only once. Because of this, you have an extra set of numbers started
	 * with 15 all the way to 990 that has to be removed from (b)&(c).
	 *
	 * Then, from 15... to 990 there are 66 terms and their sum is 66(990+15)/2, so
	 * (d)=33165 The answer for the problem is: (a)+(b)+(c)−(d)=233168
	 */


}