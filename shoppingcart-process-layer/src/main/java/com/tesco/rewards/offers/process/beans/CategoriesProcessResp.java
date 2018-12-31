/**
 * 
 */
package com.tesco.rewards.offers.process.beans;

import java.util.List;

/**
 * @author RIB
 *
 */
public class CategoriesProcessResp {

	private List<CategoriesProcessInfo> categoriesProcesses;
	private String respCode;
	private String respMsg;

	/**
	 * @return the categoriesProcesses
	 */
	public List<CategoriesProcessInfo> getCategoriesProcesses() {
		return categoriesProcesses;
	}

	/**
	 * @param categoriesProcesses the categoriesProcesses to set
	 */
	public void setCategoriesProcesses(List<CategoriesProcessInfo> categoriesProcesses) {
		this.categoriesProcesses = categoriesProcesses;
	}

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CategoriesProcessResp [categoriesProcesses=");
		builder.append(categoriesProcesses);
		builder.append(", respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append("]");
		return builder.toString();
	}

}
