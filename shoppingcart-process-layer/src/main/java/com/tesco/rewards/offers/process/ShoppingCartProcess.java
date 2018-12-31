/**
 * 
 */
package com.tesco.rewards.offers.process;

import java.sql.SQLException;

import com.tesco.rewards.offers.process.beans.CategoriesProcessReq;
import com.tesco.rewards.offers.process.beans.CategoriesProcessResp;

/**
 * @author RIB
 *
 */
public interface ShoppingCartProcess {
	/**
	 * 
	 * @param processReqBean
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	CategoriesProcessResp getCategories(CategoriesProcessReq processReqBean) throws ClassNotFoundException, SQLException;
}
