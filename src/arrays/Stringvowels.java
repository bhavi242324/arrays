package arrays;
import java.util.Scanner;
public class Stringvowels {
	public static void main (String[]args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<words.length();i++)
		{
			if((words.charAt(i)=='A'))||(words.charAt(i)=='E') ||(words.chatAt(i)=='I')||(words.charAt(i)=='O')||(words.chatAt(i)=='U')))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}