package tut1;

import java.util.Scanner;

public class Ex3_2 {
	public static int countDivisor(int n) {
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = 1; //gia su so 1 la so co nhieu uoc nhat
		int numDiv = 1; //numDiv la so uoc cua res
		for(int n = 2; n <= 10000; n++) {
			int ct = countDivisor(n);
			if(numDiv < ct) {
				res = n;
				numDiv = ct;
			}
		}
		System.out.println(res + " has largest number of divisors in [1, 10000]");
		sc.close();
	}
}
