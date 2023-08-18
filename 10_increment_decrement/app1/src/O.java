class O
{
	public static void main(String[] args) 
	{
		int i= 0;
		//int j = ++i + i;2nd
		int j = ++i + ++i + ++i + i;
		//int j = ++i; 1st
		System.out.println(i);
		System.out.println(j);
	}
}
