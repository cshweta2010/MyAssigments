package week1.Day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 17, i;

for (i = 2; i < n-1; i++) {
	if (n%i==0) {
		System.out.println(n +" is not prime number.");

		break;
	}
		
}


if(i== n-1) {
	System.out.println(n+" is Prime number.");
}


}
	}


