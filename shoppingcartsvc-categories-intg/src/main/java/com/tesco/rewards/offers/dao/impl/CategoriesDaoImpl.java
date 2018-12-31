/**
 * 
 */
package com.tesco.rewards.offers.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tesco.rewards.offers.dao.CategoriesDao;
import com.tesco.rewards.offers.dao.beans.CategoriesDaoInfo;
import com.tesco.rewards.offers.dao.beans.CategoriesDaoReq;
import com.tesco.rewards.offers.dao.beans.CategoriesDaoResp;

/**
 * @author RIB
 *
 */
@Repository
public class CategoriesDaoImpl implements CategoriesDao {

//	private static final String JDBC_DRIVER_CLASS = "com.mysql.jdbc.Driver";
//	private static final String PASSWORD = "rib";
//	private static final String USERNAME = "rib";
//	private static final String URL = "jdbc:mysql://localhost:8080/shoppingcart";
//	private static final String QUERY = "CALL GET_CATEGORIES(?,?,?,?,?,?,?,?)";
	private static final String RESP_CODE = "0";
	private static final String RESP_MSG = "Success";
//	private Connection connection;

	public CategoriesDaoImpl() throws SQLException, ClassNotFoundException {
		/*
		 * Class.forName(JDBC_DRIVER_CLASS); connection =
		 * DriverManager.getConnection(URL, USERNAME, PASSWORD);
		 */
	}

	@Override
	public CategoriesDaoResp getCategories(CategoriesDaoReq categoriesReqBean) throws SQLException {
		CategoriesDaoResp categoriesRespBean = new CategoriesDaoResp();
		List<CategoriesDaoInfo> categorisInfos = new ArrayList<>();
		CategoriesDaoInfo categoryInfo = new CategoriesDaoInfo();
		categoryInfo.setCategoryDesc("Good");
		categoryInfo.setCategoryId("123");
		categoryInfo.setCategoryName("Mobile");
		categoryInfo.setCategoryStatus("Y");
		categoryInfo.setCategoryType("Electronic");
		categorisInfos.add(categoryInfo);
		categoriesRespBean.setCategorisInfo(categorisInfos);
		categoriesRespBean.setRespCode(RESP_CODE);
		categoriesRespBean.setRespMsg(RESP_MSG);
		return categoriesRespBean;
	}

}
