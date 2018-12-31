package com.tesco.rewards.offers.dao;

import java.sql.SQLException;

import com.tesco.rewards.offers.dao.beans.CategoriesDaoReq;
import com.tesco.rewards.offers.dao.beans.CategoriesDaoResp;

public interface CategoriesDao {

	CategoriesDaoResp getCategories(CategoriesDaoReq categoriesReqBean) throws SQLException;
}
