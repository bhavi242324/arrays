package arrays;

import java.util.ArrayList;

public class Sample4 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
	    al1.add(1000);
	     al1.add(3000);
	   System.out.println(al1);
	   ArrayList al2=new ArrayList();
	   al2.add("Bhavitha");
	   al2.add(49);
	   System.out.println(al2);
	   ArrayList al3=new ArrayList();
	   al3.add(al1);
	   al3.add(53);
	   al3.add(2,6);
	   al3.add(3,3);
	   System.out.println(al3);
	}
}
