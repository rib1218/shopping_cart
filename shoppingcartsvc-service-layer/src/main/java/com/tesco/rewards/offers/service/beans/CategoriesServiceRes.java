/**
 * 
 */
package com.tesco.rewards.offers.service.beans;

import java.util.List;

/**
 * @author RIB
 *
 */
public class CategoriesServiceRes {
	private StatusBlock statusBlock;
	private List<CategoriesServiceInfo> categoriesServiceInfos;

	/**
	 * @return the statusBlock
	 */
	public StatusBlock getStatusBlock() {
		return statusBlock;
	}

	/**
	 * @param statusBlock the statusBlock to set
	 */
	public void setStatusBlock(StatusBlock statusBlock) {
		this.statusBlock = statusBlock;
	}

	/**
	 * @return the categoriesServiceInfos
	 */
	public List<CategoriesServiceInfo> getCategoriesServiceInfos() {
		return categoriesServiceInfos;
	}

	/**
	 * @param categoriesServiceInfos the categoriesServiceInfos to set
	 */
	public void setCategoriesServiceInfos(List<CategoriesServiceInfo> categoriesServiceInfos) {
		this.categoriesServiceInfos = categoriesServiceInfos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CategoriesServiceRes [statusBlock=");
		builder.append(statusBlock);
		builder.append(", categoriesServiceInfos=");
		builder.append(categoriesServiceInfos);
		builder.append("]");
		return builder.toString();
	}

}
