package arrays;

public class words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
String words="HELLO GOOD MORNING";
for(int i=0;i<words.length();i++)
{
	if(words.charAt(i)==' ')
	{
		count ++;
	}
}
System.out.println(count+1);
	}

}


	


