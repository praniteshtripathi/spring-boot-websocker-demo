package com.ntt.model;

import java.io.Serializable;
import java.util.List;

public class JobDefModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public short agvId;
    public int jobId;
    
    public List<TaskIdentifier> taskIdentifierSeq;
	public short getAgvId() {
		return agvId;
	}
	public void setAgvId(short agvId) {
		this.agvId = agvId;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public List<TaskIdentifier> getTaskIdentifierSeq() {
		return taskIdentifierSeq;
	}
	public void setTaskIdentifierSeq(List<TaskIdentifier> taskIdentifierSeq) {
		this.taskIdentifierSeq = taskIdentifierSeq;
	}
    
}
