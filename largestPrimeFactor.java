package Euler;
//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?

public class largestPrimeFactor {
	
	private static boolean isPrime(long num) {
	    if (num == 2) return true;
	    if (num % 2 == 0) return false;
	    for (int i = 3; i * i < num; i += 2)
	        if (num % i == 0) return false;
	    return true;
	}
	
	public static void main(String []args){
		long n = 600851475143l;
		
		for(long i = (long) Math.sqrt(n); i > 2; i--){
			if (n % i == 0 && isPrime(i)){
				System.out.println(i);
			}
		}
		
		
	}

}
