package TestCaseDLPFlow;

public class pojo {

	private String workerId;
	private String emailId;
	private String worker;

	public pojo() {
		// TODO Auto-generated constructor stub
	}

	public pojo(String workerId, String emailId) {
		this.workerId = workerId;
		this.emailId = emailId;
	}

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "pojo [workerId=" + workerId + ", emailId=" + emailId + "]";
	}


}
