package com.micda.g2.searchengine.rest;

import org.springframework.web.bind.annotation.RequestMapping;

import com.micda.g2.searchengine.model.Organisation;

@RequestMapping("/organisation")
public interface IOrganisationApi extends IEntityApi<Organisation>{
	
	
}
