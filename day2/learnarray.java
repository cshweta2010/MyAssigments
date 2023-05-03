package week1.day2;

public class learnarray {
public static void main(String[] args) {
	int[] num= {10,20,33,20,45,56,67,78,99,65,21,54,32,21};
	for(int i=0;i<num.length;i++)
	{
		for (int j= i+1; j< num.length; j++) {
			if(num[1]==num[j])
			{System.out.println(num[i]);
		}	
	}
}
}

}