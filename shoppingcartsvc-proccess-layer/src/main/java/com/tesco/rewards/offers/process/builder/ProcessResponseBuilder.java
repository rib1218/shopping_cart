/**
 * 
 */
package com.tesco.rewards.offers.process.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tesco.rewards.offers.dao.beans.CategoriesDaoResp;
import com.tesco.rewards.offers.process.beans.CategoriesProcessInfo;
import com.tesco.rewards.offers.process.beans.CategoriesProcessResp;

/**
 * @author RIB
 *
 */
@Component
public class ProcessResponseBuilder {
	public CategoriesProcessResp buildProcessResponse(CategoriesDaoResp daoResp) {
		CategoriesProcessResp processResp = new CategoriesProcessResp();
		List<CategoriesProcessInfo> categoriesProcesses = new ArrayList<CategoriesProcessInfo>();

		if (daoResp != null && daoResp.getCategorisInfo() != null && !daoResp.getCategorisInfo().isEmpty()) {
			daoResp.getCategorisInfo().stream().forEach(catInfo -> {
				CategoriesProcessInfo processInfo = new CategoriesProcessInfo();
				processInfo.setCategoryDesc(catInfo.getCategoryDesc());
				processInfo.setCategoryId(catInfo.getCategoryId());
				processInfo.setCategoryName(catInfo.getCategoryName());
				processInfo.setCategoryStatus(catInfo.getCategoryStatus());
				processInfo.setCategoryType(catInfo.getCategoryType());
				categoriesProcesses.add(processInfo);
			});
		}

		processResp.setCategoriesProcesses(categoriesProcesses);
		processResp.setRespCode(daoResp.getRespCode());
		processResp.setRespMsg(daoResp.getRespMsg());
		return processResp;
	}

}
