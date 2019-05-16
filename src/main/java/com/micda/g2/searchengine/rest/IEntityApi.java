package com.micda.g2.searchengine.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


public interface IEntityApi<T> {
	@GetMapping(value = "/")
	@ResponseBody
	public List<T> all();
	
	@GetMapping(value = "/{id}")
	@ResponseBody
	public T one(@PathVariable("id") int id);

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public T add(@RequestBody T object);

	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void update(@PathVariable("id") int id, @RequestBody T object);

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void delete(@PathVariable("id") int id);
}
