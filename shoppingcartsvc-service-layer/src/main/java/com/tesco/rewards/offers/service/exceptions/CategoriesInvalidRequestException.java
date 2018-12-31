package com.tesco.rewards.offers.service.exceptions;

public class CategoriesInvalidRequestException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String respCode;
	private String respMsg;

	public CategoriesInvalidRequestException(String respCode, String respMsg) {
		this.respCode = respCode;
		this.respMsg = respMsg;
	}

	/**
	 * @return the respCode
	 */
	public String getRespCode() {
		return respCode;
	}

	/**
	 * @return the respMsg
	 */
	public String getRespMsg() {
		return respMsg;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CategoriesInvalidRequestException [respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append("]");
		return builder.toString();
	}

}
