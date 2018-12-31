package com.tesco.rewards.offers.process.beans;

public class CategoriesProcessInfo {
	private String categoryId;
	private String categoryName;
	private String categoryType;
	private String categoryDesc;
	private String categoryStatus;

	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the categoryType
	 */
	public String getCategoryType() {
		return categoryType;
	}

	/**
	 * @param categoryType the categoryType to set
	 */
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	/**
	 * @return the categoryDesc
	 */
	public String getCategoryDesc() {
		return categoryDesc;
	}

	/**
	 * @param categoryDesc the categoryDesc to set
	 */
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	/**
	 * @return the categoryStatus
	 */
	public String getCategoryStatus() {
		return categoryStatus;
	}

	/**
	 * @param categoryStatus the categoryStatus to set
	 */
	public void setCategoryStatus(String categoryStatus) {
		this.categoryStatus = categoryStatus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CategoriesProcessInfo [categoryId=");
		builder.append(categoryId);
		builder.append(", categoryName=");
		builder.append(categoryName);
		builder.append(", categoryType=");
		builder.append(categoryType);
		builder.append(", categoryDesc=");
		builder.append(categoryDesc);
		builder.append(", categoryStatus=");
		builder.append(categoryStatus);
		builder.append("]");
		return builder.toString();
	}

}
