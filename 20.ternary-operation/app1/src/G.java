class G 
{
	public static void main(String[] args) 
	{ 
		int i = 200 , j = 300 , k = 100 , min = 0;
		min = (i < j && i < k) ?  i : (j < k) ? j : k;
		if ((i == j) && (i == k) && (j == k))
		{ 
			System.out.println(" all values are equal");
		}
		System.out.println(" min b/w " + i + "and" + j + "is" +min);
	}
}
