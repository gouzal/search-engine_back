package com.micda.g2.searchengine.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micda.g2.searchengine.model.PublicationState;

@RestController
public interface IPublicationStateApi extends IEntityApi<PublicationState>{

}
