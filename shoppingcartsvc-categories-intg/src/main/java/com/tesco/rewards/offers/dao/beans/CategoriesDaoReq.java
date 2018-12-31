/**
 * 
 */
package com.tesco.rewards.offers.dao.beans;

/**
 * @author RIB
 *
 */
public class CategoriesDaoReq {

	private String clientID;
	private String channelID;
	private String cardNumber;
	private Integer cvvNumber;
	private String expiryDate;
	private String nameOnCard;
	private Long availablePoints;
	private Long eligiblePoints;

	/**
	 * @return the clientID
	 */
	public String getClientID() {
		return clientID;
	}

	/**
	 * @param clientID the clientID to set
	 */
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	/**
	 * @return the channelID
	 */
	public String getChannelID() {
		return channelID;
	}

	/**
	 * @param channelID the channelID to set
	 */
	public void setChannelID(String channelID) {
		this.channelID = channelID;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the cvvNumber
	 */
	public Integer getCvvNumber() {
		return cvvNumber;
	}

	/**
	 * @param cvvNumber the cvvNumber to set
	 */
	public void setCvvNumber(Integer cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	/**
	 * @return the expiryDate
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the nameOnCard
	 */
	public String getNameOnCard() {
		return nameOnCard;
	}

	/**
	 * @param nameOnCard the nameOnCard to set
	 */
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

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
	 * @return the eligiblePoints
	 */
	public Long getEligiblePoints() {
		return eligiblePoints;
	}

	/**
	 * @param eligiblePoints the eligiblePoints to set
	 */
	public void setEligiblePoints(Long eligiblePoints) {
		this.eligiblePoints = eligiblePoints;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CategoriesReqBean [clientID=");
		builder.append(clientID);
		builder.append(", channelID=");
		builder.append(channelID);
		builder.append(", cardNumber=");
		builder.append(cardNumber);
		builder.append(", cvvNumber=");
		builder.append(cvvNumber);
		builder.append(", expiryDate=");
		builder.append(expiryDate);
		builder.append(", nameOnCard=");
		builder.append(nameOnCard);
		builder.append(", availablePoints=");
		builder.append(availablePoints);
		builder.append(", eligiblePoints=");
		builder.append(eligiblePoints);
		builder.append("]");
		return builder.toString();
	}

}
