package firstproject;

import java.util.Random;

public class RelationalLogicalOperator {

	public static void main(String[] args) {
	     Random rand = new Random();
	     int i=rand.nextInt(1000);
	     int j=rand.nextInt(1000);
	     System.out.println("i="+i);
	     System.out.println("j=" + j);
	     System.out.println(i>=j);
	     System.out.println(i<=j);

	}

}
