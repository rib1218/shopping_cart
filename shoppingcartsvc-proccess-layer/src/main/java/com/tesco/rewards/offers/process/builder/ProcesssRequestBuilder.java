/**
 * 
 */
package com.tesco.rewards.offers.process.builder;

import org.springframework.stereotype.Component;

import com.tesco.rewards.offers.dao.beans.CategoriesDaoReq;
import com.tesco.rewards.offers.process.beans.CategoriesProcessReq;

/**
 * @author RIB
 *
 */
@Component
public class ProcesssRequestBuilder {

	public CategoriesDaoReq buildDaoRequest(CategoriesProcessReq processReqBean) {

		CategoriesDaoReq daoReq = new CategoriesDaoReq();
		daoReq.setClientID(processReqBean.getClientID());
		daoReq.setChannelID(processReqBean.getChannelID());
		daoReq.setCardNumber(processReqBean.getCardNumber());
		daoReq.setNameOnCard(processReqBean.getNameOnCard());
		daoReq.setCvvNumber(processReqBean.getCvvNumber());
		daoReq.setExpiryDate(processReqBean.getExpiryDate());
		daoReq.setAvailablePoints(processReqBean.getAvailablePoints());
		daoReq.setEligiblePoints(processReqBean.getEligiblePoints());
		return daoReq;
	}

}
