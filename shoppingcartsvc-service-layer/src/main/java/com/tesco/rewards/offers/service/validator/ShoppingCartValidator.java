package com.tesco.rewards.offers.service.validator;

import org.springframework.stereotype.Component;

import com.tesco.rewards.offers.service.beans.CategoriesServiceReq;
import com.tesco.rewards.offers.service.enums.CategoriesEnum;
import com.tesco.rewards.offers.service.exceptions.CategoriesInvalidRequestException;

@Component
public class ShoppingCartValidator {

	public void validateRequest(CategoriesServiceReq categoriesServiceReq) throws CategoriesInvalidRequestException {

		if (categoriesServiceReq == null || categoriesServiceReq.getClientContext() == null
				|| categoriesServiceReq.getCustomerContext() == null || categoriesServiceReq.getRewardsInfo() == null) {
			throw new CategoriesInvalidRequestException(CategoriesEnum.REQUEST_INVALID.getRespCode(),
					CategoriesEnum.REQUEST_INVALID.getRespMsg());
		}
	}
}
