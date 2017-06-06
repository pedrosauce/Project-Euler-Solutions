package Euler;

public class prime100001 {
	
	private static boolean isPrime(long num) {
	    if (num == 2 || num == 3){
	    	return true;
	    	}
	    if (num % 2 == 0){ 
	    	return false;
	    	}
	    for (int i = 3; (i * i) <= num; i += 1){
	        if (num % i == 0 || num == 1){ 
	        	return false;
	        	}
	    }
	    return true;
	}
	
	public static void main (String [] args){
		
		int counter = 0;
		int primenum = 1;
		
		while(counter < 10001){
			primenum += 1;
			if(isPrime(primenum)){
				counter ++;
			}
		}
		System.out.println(primenum);
	}

}
