/**
 * 
 */
package com.tesco.rewards.offers.service.beans;

/**
 * @author RIB
 *
 */
public class CategoriesServiceReq {

	private ClientContext clientContext;
	private CustomerContext customerContext;
	private ServiceDetails serviceDetails;
	private RewardsInfo rewardsInfo;

	/**
	 * @return the clientContext
	 */
	public ClientContext getClientContext() {
		return clientContext;
	}

	/**
	 * @param clientContext the clientContext to set
	 */
	public void setClientContext(ClientContext clientContext) {
		this.clientContext = clientContext;
	}

	/**
	 * @return the customerContext
	 */
	public CustomerContext getCustomerContext() {
		return customerContext;
	}

	/**
	 * @param customerContext the customerContext to set
	 */
	public void setCustomerContext(CustomerContext customerContext) {
		this.customerContext = customerContext;
	}

	/**
	 * @return the serviceDetails
	 */
	public ServiceDetails getServiceDetails() {
		return serviceDetails;
	}

	/**
	 * @param serviceDetails the serviceDetails to set
	 */
	public void setServiceDetails(ServiceDetails serviceDetails) {
		this.serviceDetails = serviceDetails;
	}

	/**
	 * @return the rewardsInfo
	 */
	public RewardsInfo getRewardsInfo() {
		return rewardsInfo;
	}

	/**
	 * @param rewardsInfo the rewardsInfo to set
	 */
	public void setRewardsInfo(RewardsInfo rewardsInfo) {
		this.rewardsInfo = rewardsInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CategoriesServiceReq [clientContext=");
		builder.append(clientContext);
		builder.append(", customerContext=");
		builder.append(customerContext);
		builder.append(", serviceDetails=");
		builder.append(serviceDetails);
		builder.append(", rewardsInfo=");
		builder.append(rewardsInfo);
		builder.append("]");
		return builder.toString();
	}

}
