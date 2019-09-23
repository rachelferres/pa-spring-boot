package uk.ac.belfastmet.TODO.domain;

import java.util.Date;

public class ToDo {
	
	private String name;
	private String description;
	private String completionDate;
	private boolean completedOrNot;
	private String userName;
	private String priority;
	
	
	public ToDo() {
		
	}
	
	public ToDo(String name, String description, String completionDate, boolean completedOrNot, String userName,
			String priority) {
		this.name = name;
		this.description = description;
		this.completionDate = completionDate;
		this.completedOrNot = completedOrNot;
		this.userName = userName;
		this.priority = priority;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}
	public boolean isCompletedOrNot() {
		return completedOrNot;
	}
	public void setCompletedOrNot(boolean completedOrNot) {
		this.completedOrNot = completedOrNot;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	public String toString() {
		
		return name+" "+description+" "+completionDate+" "+completedOrNot+" "+userName+" "+ priority;
	}

}
