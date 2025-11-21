// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
	int resualt=x2;
	for(int i=0;i<x1;i++){
		resualt++;

	}
		return resualt;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		int resualt = x1;
		for(int i=0;i<x2;i++){
			resualt--;
		}
		return resualt;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
			int resualt=0;
		for(int i=0; i<x1;i++){
					int a = 0;
			for(; a<x2;a++){
				resualt++;

			}
			
		}

		return resualt;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int resualt= 1;
		for(int i = 0;i<n;i++){
			resualt = times (resualt,x);

		}
		return resualt;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int resualt=0;
		while (x1-x2>=0) {
			 x1 = minus(x1,x2);
			resualt++;
		}
		return resualt;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		int y =div(x1, x2);
		int  t = times(y, x2);
		int z = minus(x1, t) ;

		return z ;
		}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x){
	int z = 1;
	int f = times(z, z);
	while (f<=x) {
		z = plus(z,1);
		f = times(z,z);
	
	}	
		
		return minus(z, 1);
	}	  	  
}