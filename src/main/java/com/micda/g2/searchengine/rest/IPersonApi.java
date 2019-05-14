package com.micda.g2.searchengine.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micda.g2.searchengine.model.Person;

@RestController
@RequestMapping("/person")
public interface IPersonApi extends IEntityApi<Person> {

}
