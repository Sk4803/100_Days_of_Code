import java.io.*;
import java.math.*;

class TwistedPrime {
	static int reverse(int n){
		int rev = 0, r;
		while (n > 0){
			r = n % 10;
			rev = rev * 10 + r;
			n /= 10;
		}
		return rev;
	}
	static boolean isPrime(int n){
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;

		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}

	static boolean checkTwistedPrime(int n){
		if (isPrime(n) == false)
			return false;

		return isPrime(reverse(n));
	}

	public static void main(String args[])
	throws IOException
	{
		System.out.println("First few Twisted Prime" +
		" Numbers are :- n");
		for (int i = 2; i <= 200; i++)
			if (checkTwistedPrime(i))
				System.out.print(i + " ");
	}
}
