package com.micda.g2.searchengine.rest;

import org.springframework.web.bind.annotation.RestController;

import com.micda.g2.searchengine.model.Publication;

@RestController
public interface IPublicationApi extends IEntityApi<Publication> {

}
