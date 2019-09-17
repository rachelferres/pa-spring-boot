/**
 * 
 */
package uk.ac.belfastmet;

/**
 * @author fer19171898
 *
 */
public class FindOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5 };
		System.out.println(findIt(a));
	}

	public static int findIt(int[] a) {

		int xor = 0;
	    for (int i = 0; i < a.length; i++) {
	      xor ^= a[i];
	    }
	    return xor;
	}

}
