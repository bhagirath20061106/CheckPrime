package bhagirath;
import java.util.*;
public class Prime {
static int prime(int n) {
	int count=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			count++;
		}
	}
	if(count==2) {
		return 1;
	}
	else
		return 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n;
		n=sc.nextInt();
		if(prime(n)==1) {
System.out.print("Number is prime");
	}
		else {
			System.out.print("Not a prime");
		}

}
	
}
