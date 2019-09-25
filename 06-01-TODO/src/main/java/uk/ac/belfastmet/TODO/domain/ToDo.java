package uk.ac.belfastmet.TODO.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "task")
public class ToDo {
	
	private String name;
	private String description;
	private String completionDate;
	//private boolean completedOrNot;
	private String userName;
	private String priority;
	private long id;

	
	public ToDo() {

	}
// Colin: needs a javadoc to describe the expected parameters :)
	/**
	 * 
	 * @param name
	 * @param description
	 * @param completionDate
	 * @param userName
	 * @param priority
	 */
	public ToDo(String name, String description, String completionDate, String userName,
			String priority) {
		this.name = name;
		this.description = description;
		this.completionDate = completionDate;
		//this.completedOrNot = completedOrNot;  boolean completedOrNot,
		this.userName = userName;
		this.priority = priority;
		
		
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
	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name = "completiondate")
	public String getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}
//	@Column(name = "completedOrNot")
//	public boolean isCompletedOrNot() {
//		return completedOrNot;
//	}
//	public void setCompletedOrNot(boolean completedOrNot) {
//		this.completedOrNot = completedOrNot;
//	}
	@Column(name = "username")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name = "priority")
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String toString() {

		return this.name+" "+this.description+" "+this.completionDate+" "+this.userName+" "+ this.priority;
	}

}
//+this.completedOrNot+" "
