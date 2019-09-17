/**
 * 
 */
package uk.ac.belfastmet;

import java.util.ArrayList;

/**
 * @author fer19171898
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		dwarfs.add(new Dwarf("Sleepy", "Disney"));
		dwarfs.add(new Dwarf("Happy", "Disney"));
		dwarfs.add(new Dwarf("Grumpy", "Disney"));
		dwarfs.add(new Dwarf("Dopey", "Disney"));
		dwarfs.add(new Dwarf("Bashful", "Disney"));
		dwarfs.add(new Dwarf("Doc", "Disney"));
		dwarfs.add(new Dwarf("Sneezy", "Disney"));
		
		
		for (Dwarf dwarf : dwarfs) {
			if((boolean)dwarf.getName().startsWith("S")) {
			System.out.println(dwarf.getName()+"    "+dwarf.getAuthor());
			}
			
		} 
	}
	
}
