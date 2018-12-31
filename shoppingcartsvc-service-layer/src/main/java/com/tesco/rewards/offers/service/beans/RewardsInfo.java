/**
 * 
 */
package com.tesco.rewards.offers.service.beans;

/**
 * @author RIB
 *
 */
public class RewardsInfo {

	private Long availablePoints;
	private Long eligiblepoints;

	/**
	 * @return the availablePoints
	 */
	public Long getAvailablePoints() {
		return availablePoints;
	}

	/**
	 * @param availablePoints the availablePoints to set
	 */
	public void setAvailablePoints(Long availablePoints) {
		this.availablePoints = availablePoints;
	}

	/**
	 * @return the eligiblepoints
	 */
	public Long getEligiblepoints() {
		return eligiblepoints;
	}

	/**
	 * @param eligiblepoints the eligiblepoints to set
	 */
	public void setEligiblepoints(Long eligiblepoints) {
		this.eligiblepoints = eligiblepoints;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RewardsInfo [availablePoints=");
		builder.append(availablePoints);
		builder.append(", eligiblepoints=");
		builder.append(eligiblepoints);
		builder.append("]");
		return builder.toString();
	}

}
