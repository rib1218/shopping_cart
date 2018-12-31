/**
 * 
 */
package com.tesco.rewards.offers.service;

import com.tesco.rewards.offers.service.beans.CategoriesServiceReq;
import com.tesco.rewards.offers.service.beans.CategoriesServiceRes;

/**
 * @author RIB
 *
 */
public interface ShoppingCartService {

		CategoriesServiceRes getCategories(CategoriesServiceReq serviceReq);
		
}
