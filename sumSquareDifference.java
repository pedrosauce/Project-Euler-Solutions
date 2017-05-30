package Euler;

public class sumSquareDifference {
	
	public static void main(String [] args){
		int sumOfSquares = 0, squareOfSum = 0, sum = 0;
		
		for(int i = 1; i <= 100; i++){
			sumOfSquares += i*i;
			sum += i;			
		}
		
		squareOfSum = sum*sum;
		System.out.println(squareOfSum - sumOfSquares);
	}

}
