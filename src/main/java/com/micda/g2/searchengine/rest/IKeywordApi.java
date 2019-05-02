package com.micda.g2.searchengine.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.micda.g2.searchengine.model.Keyword;


@RestController
public interface IKeywordApi {
	@GetMapping(value = "/{id}")
	public Keyword get(@PathVariable("id") int id);

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Keyword add(@RequestParam(value = "name") String name);

	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") int id, @RequestBody Keyword keyword);

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") int id);
}