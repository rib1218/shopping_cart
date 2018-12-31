/**
 * 
 */
package com.tesco.rewards.offers.service.beans;

/**
 * @author RIB
 *
 */
public class StatusBlock {

	private String respCode;
	private String respMsg;
	private String developerMsg;

	/**
	 * @return the respCode
	 */
	public String getRespCode() {
		return respCode;
	}

	/**
	 * @param respCode the respCode to set
	 */
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	/**
	 * @return the respMsg
	 */
	public String getRespMsg() {
		return respMsg;
	}

	/**
	 * @param respMsg the respMsg to set
	 */
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

	/**
	 * @return the developerMsg
	 */
	public String getDeveloperMsg() {
		return developerMsg;
	}

	/**
	 * @param developerMsg the developerMsg to set
	 */
	public void setDeveloperMsg(String developerMsg) {
		this.developerMsg = developerMsg;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatusBlock [respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append(", developerMsg=");
		builder.append(developerMsg);
		builder.append("]");
		return builder.toString();
	}

}
