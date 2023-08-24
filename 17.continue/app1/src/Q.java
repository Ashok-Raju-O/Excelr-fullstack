class Q 
{
	public static void main(String[] args) 
	{
		for ( int i = 0; i < 10 ; i++ )
		{
		  System.out.println("loop begin" + i);
		  if ( i > 5)
		 {
			  break;
			  System.out.println("if break");
			//continue;
		 }
		  System.out.println("loop end" + i);
		}
		 System.out.println("main end");
	}
}
