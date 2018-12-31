/**
 * 
 */
package com.tesco.rewards.offers.service.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tesco.rewards.offers.process.ShoppingCartProcess;
import com.tesco.rewards.offers.process.beans.CategoriesProcessReq;
import com.tesco.rewards.offers.process.beans.CategoriesProcessResp;
import com.tesco.rewards.offers.service.beans.CategoriesServiceReq;
import com.tesco.rewards.offers.service.beans.CategoriesServiceRes;
import com.tesco.rewards.offers.service.builder.ShoppingCartSvcReqBuilder;
import com.tesco.rewards.offers.service.builder.ShoppingCartSvcResBuilder;
import com.tesco.rewards.offers.service.exceptions.CategoriesInvalidRequestException;
import com.tesco.rewards.offers.service.validator.ShoppingCartValidator;

/**
 * @author RIB
 *
 */
@RestController
@RequestMapping("/sca/v1/")
public class ShoppingCartServiceController {

	@Autowired
	ShoppingCartValidator validator;

	@Autowired
	ShoppingCartSvcReqBuilder shoppingCartSvcReqBuilder;
	
	@Autowired
	ShoppingCartSvcResBuilder shoppingCartSvcResBuilder;

	@Autowired
	ShoppingCartProcess shoppingCartProcess;

	@PostMapping(value = "getCategories", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public CategoriesServiceRes getCategories(CategoriesServiceReq categoriesServiceReq)
			throws CategoriesInvalidRequestException, ClassNotFoundException, SQLException {
		CategoriesServiceRes categoriesServiceRes = null;

		// validate the categories service request
		validator.validateRequest(categoriesServiceReq);

		// prepare process layer request bean
		CategoriesProcessReq processReq = shoppingCartSvcReqBuilder.buildProcessReq(categoriesServiceReq);

		// process the request
		CategoriesProcessResp processResp = shoppingCartProcess.getCategories(processReq);

		//prepare the service response
		categoriesServiceRes=shoppingCartSvcResBuilder.buildServiceResponse(processResp);	
		
		return categoriesServiceRes;
	}
}
