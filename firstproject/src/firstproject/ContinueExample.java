/**
 * 
 */
package firstproject;

/**
 * @author admin
 *
 */
public class ContinueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int lim=10;
		int sum=0;
		for (int i=1;i<lim;i++) {
			if(i%4==0) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
