package com.tesco.rewards.offers.service.enums;

public enum CategoriesEnum {

	SUCCESS("000", "Success"), REQUEST_INVALID("CAT001", "Request Parameter Missing");

	private String respCode;
	private String respMsg;

	private CategoriesEnum(String respCode, String respMsg) {
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

}
