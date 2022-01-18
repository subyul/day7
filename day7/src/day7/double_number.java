package day7;
import java.util.Random;
public class double_number {
 public static void main(String[] args) {
	Random ran = new Random();
	
	int arr[] = new int [5];
	int i = 0;
	
	while(i<5)
	{
		int rannum = ran.nextInt(10)+1;
		int check = 1;
		int j = 0;
		
		while(j < i)
		{
			if(rannum == arr[j])
			{
				check = -1;
			}
			j += 1;
		}
		if(check == 1)
		{
			arr[i] = rannum;
			i += 1;
		}
	}
	for(int j = 0; j<arr.length; j++)
	{
		System.out.print(arr[j] + " ");
	}
	System.out.println();
 }
}
