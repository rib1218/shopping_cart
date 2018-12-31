package com.tesco.rewards.offers.service.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tesco.rewards.offers.process.beans.CategoriesProcessResp;
import com.tesco.rewards.offers.service.beans.CategoriesServiceInfo;
import com.tesco.rewards.offers.service.beans.CategoriesServiceRes;
import com.tesco.rewards.offers.service.beans.StatusBlock;

@Component
public class ShoppingCartSvcResBuilder {

	public CategoriesServiceRes buildServiceResponse(CategoriesProcessResp processResp) {
		CategoriesServiceRes categoriesServiceRes = new CategoriesServiceRes();

		List<CategoriesServiceInfo> categoriesServiceInfos = new ArrayList<CategoriesServiceInfo>();

		if (processResp.getCategoriesProcesses() != null || !processResp.getCategoriesProcesses().isEmpty()) {
			processResp.getCategoriesProcesses().stream().forEach(processInfo -> {
				CategoriesServiceInfo categoriesServiceInfo = new CategoriesServiceInfo();
				categoriesServiceInfo.setCategoryDesc(processInfo.getCategoryDesc());
				categoriesServiceInfo.setCategoryId(processInfo.getCategoryId());
				categoriesServiceInfo.setCategoryName(processInfo.getCategoryName());
				categoriesServiceInfo.setCategoryStatus(processInfo.getCategoryStatus());
				categoriesServiceInfo.setCategoryType(processInfo.getCategoryType());
				categoriesServiceInfos.add(categoriesServiceInfo);
			});
		}

		categoriesServiceRes.setCategoriesServiceInfos(categoriesServiceInfos);
		StatusBlock statusBlock = new StatusBlock();
		statusBlock.setRespCode(processResp.getRespCode());
		statusBlock.setRespMsg(processResp.getRespMsg());
		categoriesServiceRes.setStatusBlock(statusBlock);
		return categoriesServiceRes;
	}

}
