package com.ntt.model;

import java.io.Serializable;

public class TaskIdentifier implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int id;
	 String taskType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	 

}
