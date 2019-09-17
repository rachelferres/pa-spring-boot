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
		
		Dwarf sleepy = new Dwarf();
		sleepy.setName("Sleepy");
		sleepy.setAuthor("Disney");
		dwarfs.add(sleepy);
		
		Dwarf happy = new Dwarf();
		happy.setName("Happy");
		happy.setAuthor("Disney");
		dwarfs.add(happy);
		
		Dwarf doc = new Dwarf();
		doc.setName("Doc");
		doc.setAuthor("Disney");
		dwarfs.add(doc);
		
		Dwarf thorin = new Dwarf();
		thorin.setName("Thorin");
		thorin.setAuthor("Tolkien");
		dwarfs.add(thorin);
		
		Dwarf balin = new Dwarf();
		balin.setName("Balin");
		balin.setAuthor("Tolkien");
		dwarfs.add(balin);
		
		Dwarf dwalin = new Dwarf();
		dwalin.setName("Dwalin");
		dwalin.setAuthor("Tolkien");
		dwarfs.add(dwalin);
		
		System.out.println("The dwarfs are: ");
		
		for (Dwarf dwarf : dwarfs) {
			System.out.println(dwarf.getName()+"    "+dwarf.getAuthor());
			
		}
		
		for (Dwarf dwarf : dwarfs) {
			if(dwarf.getAuthor()=="Disney") {
			System.out.println(dwarf.getName()+"    "+dwarf.getAuthor());
			}
		}
		
		for (Dwarf dwarf : dwarfs) {
			if(dwarf.getAuthor()=="Tolkien") {
			System.out.println(dwarf.getName()+"    "+dwarf.getAuthor());
			}
		}
	}

}
