package arrays;
import java.util.ArrayDeque;
public class Sample5 {
	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(10);
		ad.addFirst(30);
		ad.addLast(70);
		System.out.println(ad);
	}

}
