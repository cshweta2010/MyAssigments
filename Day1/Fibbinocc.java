package week1.Day1;

public class Fibbinocc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0,n2=1,n3, count=10;
int j;
System.out.println( n1);
System.out.println(n2);

for(j=2;j<count;j++)   
{
	n3=n1+n2;
	
	System.out.println(n3);
	
	n1=n2;
	n2=n3;
	
}
	}

}


