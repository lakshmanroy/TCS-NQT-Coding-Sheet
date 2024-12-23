// JAVA Program to find the sum of 
// arithmetic series. 

class SumOfAp{ 
	
	// Function to find sum of series. 
	public static float sumOfAP(float a, float d,int n){ 
		float sum = 0; 
		for (int i = 0; i < n; i++) 
		{ 
			sum = sum + a; 
			a = a + d; 
		} 
		return sum; 
	} 
	
	// Driver function 
	public static void main(String args[]) 
	{ 
		int n = 4; 
		float a = 2f, d = 2f; 
		System.out.println(sumOfAP(a, d, n)); 
	} 
} 

/*This code is contributed by Nikita Tiwari.*/
