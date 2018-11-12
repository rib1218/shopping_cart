package com.tesco.rewards.offers.dao;

import com.tesco.rewards.offers.dao.beans.CategoriesReqBean;
import com.tesco.rewards.offers.dao.beans.CategoriesRespBean;

public interface CategoriesDao {

	CategoriesRespBean getCategories(CategoriesReqBean categoriesReqBean);
}
