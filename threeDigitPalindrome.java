package Euler;

public class threeDigitPalindrome {
	
	
	public static void main (String [] args){
		int palindrome = 0;
		int largestPalindrome = 0;
		
		
		for(int i = 999; i > 899; i--){
			for(int j = i; j > 899; j--){
				palindrome = i * j;
				if(isPalindrome(palindrome) == true){
					if(largestPalindrome < palindrome){
						largestPalindrome = palindrome;
					}
				}
				
			}
		}
		System.out.println(largestPalindrome);
	}
public static boolean isPalindrome(int n){
	int checkNumber = n; // copied number into variable
    int reverse = 0;

    while (checkNumber != 0) {
        int remainder = checkNumber % 10;
        reverse = reverse * 10 + remainder;
        checkNumber = checkNumber / 10;
    }

    // if original and reverse of number is equal means
    // number is palindrome in Java
    if (n == reverse) {
        return true;
    }
    return false;
}

}

