package day7;
import java.util.Scanner;
public class move_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
		int check = 0;
		int count = 0;
		while(true)
		{
			for(int i = 0; i<game.length;i++)
			{
				if(game[i] == 0)
				{
					System.out.print(game[i]+" ");
				}
				else if(game[i] == 1)
				{
					System.out.print("�� ");
				}
				else if(game[i] == 2)
				{
					System.out.print("�� ");
					check = i;
					
				}
			}
			System.out.println();
			System.out.println("[1]���� [2]������");
			int data = sc.nextInt();
			
			if(count>4 || count<-4)
			{
				System.out.println("���̻� ������ �� �����ϴ�");
				break;
			}
			if(data==1)
			{
				if(game[check-1]==1)
				{
					System.out.println("���� ���� ������ �� �����ϴ�");
					System.out.println("�� �μ��� -> 3");
				}
				else
				{
					game[check-1] = game[check];
					game[check] = 0;
					count++;
					System.out.println("count1 " + count);
				}
			}
			if(data == 2)
			{
				if(game[check+1]==1)
				{
					System.out.println("���� ���� ������ �� �����ϴ�");
					System.out.println("�� �μ��� -> 3");
				}
				else
				{
					game[check+1] = game[check];
					game[check] = 0;
					count--;
					System.out.println("count2 "+ count);
				}
			}
			if(data == 3)
			{
				game[check-1] = 0;
				game[check+1] = 0;
			}
			System.out.println("������: "+count);
		}
	}

}
