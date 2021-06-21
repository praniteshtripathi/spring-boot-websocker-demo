package demo.websocket.client;

import java.io.Serializable;

public class AgvCommand implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String agvId;
	String agvMode;
	String pauseExecution;
	
	public AgvCommand() {
		
	}
	public AgvCommand(String agvId, String agvMode, String pauseExecution) {
		super();
		this.agvId = agvId;
		this.agvMode = agvMode;
		this.pauseExecution = pauseExecution;
	}
	public String getAgvId() {
		return agvId;
	}
	public void setAgvId(String agvId) {
		this.agvId = agvId;
	}
	public String getAgvMode() {
		return agvMode;
	}
	public void setAgvMode(String agvMode) {
		this.agvMode = agvMode;
	}
	public String getPauseExecution() {
		return pauseExecution;
	}
	public void setPauseExecution(String pauseExecution) {
		this.pauseExecution = pauseExecution;
	}
	@Override
	public String toString() {
		return "AgvCommand [agvId=" + agvId + ", agvMode=" + agvMode + ", pauseExecution=" + pauseExecution + "]";
	}

}
