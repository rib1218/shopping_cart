/**
 * 
 */
package com.tesco.rewards.offers.process.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tesco.rewards.offers.dao.CategoriesDao;
import com.tesco.rewards.offers.dao.beans.CategoriesDaoReq;
import com.tesco.rewards.offers.dao.beans.CategoriesDaoResp;
import com.tesco.rewards.offers.dao.impl.CategoriesDaoImpl;
import com.tesco.rewards.offers.process.ShoppingCartProcess;
import com.tesco.rewards.offers.process.beans.CategoriesProcessReq;
import com.tesco.rewards.offers.process.beans.CategoriesProcessResp;
import com.tesco.rewards.offers.process.builder.ProcessResponseBuilder;
import com.tesco.rewards.offers.process.builder.ProcesssRequestBuilder;

/**
 * @author RIB
 *
 */
@Service
public class ShoppingCartProcessImpl implements ShoppingCartProcess {

	@Autowired
	private CategoriesDao categoriesDao;

	@Autowired
	private ProcesssRequestBuilder requestBuilder;

	@Autowired
	ProcessResponseBuilder responseBuilder;

	@Override
	public CategoriesProcessResp getCategories(CategoriesProcessReq processReqBean)
			throws ClassNotFoundException, SQLException {

		// Build DAO Request
		CategoriesDaoReq daoReq = requestBuilder.buildDaoRequest(processReqBean);

		// call dao layer getCategories() method
		categoriesDao = new CategoriesDaoImpl();
		CategoriesDaoResp daoResp = categoriesDao.getCategories(daoReq);

		// build process response
		CategoriesProcessResp processResp = responseBuilder.buildProcessResponse(daoResp);

		return processResp;
	}

}
