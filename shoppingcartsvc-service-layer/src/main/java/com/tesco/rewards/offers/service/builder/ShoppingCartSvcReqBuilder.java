package com.tesco.rewards.offers.service.builder;

import org.springframework.stereotype.Component;

import com.tesco.rewards.offers.process.beans.CategoriesProcessReq;
import com.tesco.rewards.offers.service.beans.CategoriesServiceReq;

@Component
public class ShoppingCartSvcReqBuilder {

	public CategoriesProcessReq buildProcessReq(CategoriesServiceReq categoriesServiceReq) {
		CategoriesProcessReq categoriesProcessReq = new CategoriesProcessReq();

		categoriesProcessReq.setCardNumber(categoriesServiceReq.getCustomerContext().getCardNumber());
		categoriesProcessReq.setNameOnCard(categoriesServiceReq.getCustomerContext().getNameOnCard());
		categoriesProcessReq.setCvvNumber(categoriesServiceReq.getCustomerContext().getCvvNumber());
		categoriesProcessReq.setExpiryDate(categoriesServiceReq.getCustomerContext().getExpiryDate());
		categoriesProcessReq.setClientID(categoriesServiceReq.getClientContext().getClientId());
		categoriesProcessReq.setChannelID(categoriesServiceReq.getClientContext().getChannelId());
		categoriesProcessReq.setAvailablePoints(categoriesServiceReq.getRewardsInfo().getAvailablePoints());
		categoriesProcessReq.setEligiblePoints(categoriesServiceReq.getRewardsInfo().getEligiblepoints());

		return categoriesProcessReq;
	}

}
