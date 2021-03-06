package com.micda.g2.searchengine.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micda.g2.searchengine.model.Revision;

@RestController
public interface IRevisionApi extends IEntityApi<Revision> {

}
