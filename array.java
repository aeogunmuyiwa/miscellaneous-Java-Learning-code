import java.util.Arrays;
public class array{
	public static void main(String[] args) {
		int[] array = {-1,-5,-17,39,38};
		System.out.println("Original array is "+ " "+ Arrays.toString(array) );
		int Maxsum = Maxsum(array);
		
		System.out.println("Maximum sum is "+""+  Maxsum  );
		
	
	}
	
public static int Maxsum(int[] a)	{
	
	
	int sum = 0;
	int low = a[0];
	int lowPosition = 0;
	// c ;
	for(int i = 1; i < a.length; i++ )
	{	
		if (a[i] < low)
		{
			
			low = a[i];
			lowPosition = i;
		}
		
	}
	
	a[lowPosition]=0;
	for (int i= 0; i< a.length;i++){
		sum += a[i];
		
	}
	System.out.println("New array is "+ " " +Arrays.toString(a) );
	
	return sum;
}
}

