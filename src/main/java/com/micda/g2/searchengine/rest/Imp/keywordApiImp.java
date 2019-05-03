package com.micda.g2.searchengine.rest.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Preconditions;
import com.micda.g2.searchengine.exception.ResourceNotFoundException;
import com.micda.g2.searchengine.model.Keyword;
import com.micda.g2.searchengine.rest.IKeywordApi;
import com.micda.g2.searchengine.service.imp.KeywordServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
@RequestMapping("/keyword")
class KeywordApiImp implements IKeywordApi{

	@Autowired
	KeywordServiceImp keywordServiceImp;


	@GetMapping(value = "/{id}")
	public Keyword get(@PathVariable("id") int id) {

		return keywordServiceImp.getKeyword(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Keyword add(@RequestParam(value = "name") String name) {
		Keyword keyword = new Keyword();
		//todo set attribute
		keywordServiceImp.addKeyword(keyword);
		return keyword;
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") int id, @RequestBody Keyword keyword) {
		Preconditions.checkNotNull(keyword);
		try {
			RestPreconditions.checkFound(keywordServiceImp.getKeyword(id));
			keywordServiceImp.updateKeyword(keyword);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") int id) {
		keywordServiceImp.removeKeyword(id);
	}


	

}
