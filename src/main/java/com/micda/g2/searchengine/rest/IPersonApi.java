package com.micda.g2.searchengine.rest;

import org.springframework.web.bind.annotation.RestController;

import com.micda.g2.searchengine.model.Person;

@RestController
public interface IPersonApi extends IEntityApi<Person> {

}
