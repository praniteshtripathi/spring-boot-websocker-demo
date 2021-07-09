package com.ntt.model;

import java.io.Serializable;

public class AgvStatusModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public AgvStatusModel() {
		
	}
	
	private int agvId = 0;
	private float x=0;
	private float y=0;
	private float theta=0;
	private String autoMode="";
	private String powerMode="";
	private boolean laden = false;
	private boolean moving = false;
	private byte batterySoc = (byte)0;
	private int currentJobId = (int)0;
	private int taskProgress = (short)0;
	private TaskIdentifier currentTask;
    private String currentStatus;
    
	public int getAgvId() {
		return agvId;
	}
	public void setAgvId(int agvId) {
		this.agvId = agvId;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getTheta() {
		return theta;
	}
	public void setTheta(float theta) {
		this.theta = theta;
	}
	public String getAutoMode() {
		return autoMode;
	}
	public void setAutoMode(String autoMode) {
		this.autoMode = autoMode;
	}
	public String getPowerMode() {
		return powerMode;
	}
	public void setPowerMode(String powerMode) {
		this.powerMode = powerMode;
	}
	public boolean isLaden() {
		return laden;
	}
	public void setLaden(boolean laden) {
		this.laden = laden;
	}
	public boolean isMoving() {
		return moving;
	}
	public void setMoving(boolean moving) {
		this.moving = moving;
	}
	public byte getBatterySoc() {
		return batterySoc;
	}
	public void setBatterySoc(byte batterySoc) {
		this.batterySoc = batterySoc;
	}
	public int getCurrentJobId() {
		return currentJobId;
	}
	public void setCurrentJobId(int currentJobId) {
		this.currentJobId = currentJobId;
	}
	public int getTaskProgress() {
		return taskProgress;
	}
	public void setTaskProgress(int taskProgress) {
		this.taskProgress = taskProgress;
	}
	public TaskIdentifier getCurrentTask() {
		return currentTask;
	}
	public void setCurrentTask(TaskIdentifier currentTask) {
		this.currentTask = currentTask;
	}
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	


}
