
public class SumOfTheFirstAllNum {
	public static void main(String[]args)
	{
		int n1=1;
		int n2=2;
		int i=0;
		long n3=n1+n2;
		System.out.println(n1);
		System.out.println(n2);
		boolean flag=true;
		while(i<10)
		{
			System.out.println(n3);
			n3=n3*2;
			i++;
		}
	}
}
