
import java.io.Serializable;

public class AgvCommand implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private short agvId;
	private String agvMode;
    private boolean pauseExecution;
	public AgvCommand() {
		
	}
	public AgvCommand(short agvId, String agvMode, boolean pauseExecution) {
		super();
		this.agvId = agvId;
		this.agvMode = agvMode;
		this.pauseExecution = pauseExecution;
	}
	public short getAgvId() {
		return agvId;
	}
	public void setAgvId(short agvId) {
		this.agvId = agvId;
	}
	public String getAgvMode() {
		return agvMode;
	}
	public void setAgvMode(String agvMode) {
		this.agvMode = agvMode;
	}
	public boolean getPauseExecution() {
		return pauseExecution;
	}
	public void setPauseExecution(boolean pauseExecution) {
		this.pauseExecution = pauseExecution;
	}
	@Override
	public String toString() {
		return "AgvCommand [agvId=" + agvId + ", agvMode=" + agvMode + ", pauseExecution=" + pauseExecution + "]";
	}

}
