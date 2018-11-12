/**
 * 
 */
package com.tesco.rewards.offers.dao.beans;

import java.util.List;

/**
 * @author RIB
 *
 */
public class CategoriesRespBean {

	private List<CategoriesDaoInfo> categorisInfo;
	private String respCode;
	private String respMsg;

	/**
	 * @return the categorisInfo
	 */
	public List<CategoriesDaoInfo> getCategorisInfo() {
		return categorisInfo;
	}

	/**
	 * @param categorisInfo the categorisInfo to set
	 */
	public void setCategorisInfo(List<CategoriesDaoInfo> categorisInfo) {
		this.categorisInfo = categorisInfo;
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
		builder.append("CategoriesRespBean [categorisInfo=");
		builder.append(categorisInfo);
		builder.append(", respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append("]");
		return builder.toString();
	}

}
