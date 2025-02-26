class divisible
{
	public static void main(String args[])
	{
		int num=89;
                int age=19;
		if(num%3==0)
		{
			System.out.println(num+" is divisible by 3");
		}
		else
		{
			System.out.println(num+" is not divisible by 3");
		}
		String res=num%3==0?"Divisible by 3":"Not Divisible by 3";
                System.out.println((num%3==0?"Divisible by 3":"Not Divisible by 3"));            
	}
}
