package java1;

public class driven {

	public static void main(String[] args)
	{
		int a[]= {10,11,12,13,14};
		int evenSum=0;
		for(int t:a)
		{
			if(t%2==0)
			{
				evenSum=evenSum + t;
			}
		}
		System.out.println(evenSum);
	}
}

