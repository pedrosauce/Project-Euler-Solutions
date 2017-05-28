package Euler;

public class evenFibonacci {
	public static void main(String[] agrs){
	    int prevFirst = 0;
	    int prevSecond = 1;
	    int bound = 4000000;
	    int evenSum = 0;

	    boolean exceed = false; //when fib numbers > bound
	    while(!exceed){
	        int newFib=prevFirst + prevSecond;
	        prevFirst = prevSecond;
	        prevSecond = newFib;

	        if(newFib > bound){
	            exceed=true;
	        }

	        if(newFib % 2 == 0){
	            evenSum += newFib;
	        }
	    }

	    System.out.println(evenSum);

	}

}
