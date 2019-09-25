package uk.ac.belfastmet.dwarfs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="dwarf")
public class Dwarf {
	
	private String name;
	private String author;
	private long id;
	
	public Dwarf() {
		
	}
	
	/**
	 * 
	 * @param name
	 * @param author
	 */
	public Dwarf(String name, String author) {
		
		this.name = name;
		this.author = author;
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "author")
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString() {
		return this.name+" "+this.author;
	}
}
