package Euler;

public class smallestMultiple {
	
	public static void main (String [] args){
		int smallestMultiple = 20;
		while(!isMultiple(smallestMultiple)){
			smallestMultiple++;
		}
		System.out.println(smallestMultiple);
		
	}
	public static boolean isMultiple(int n){
		for(int i = 2; i <= 20; i++){
			if(n % i != 0){
				return false;
			}
		}
		return true;
	}

}
