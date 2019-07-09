package com.micda.g2.searchengine.rest.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Preconditions;
import com.micda.g2.searchengine.exception.ResourceNotFoundException;
import com.micda.g2.searchengine.model.Keyword;
import com.micda.g2.searchengine.rest.IKeywordApi;
import com.micda.g2.searchengine.service.imp.KeywordServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;

@RestController
class KeywordApiImp implements IKeywordApi  {

	@Autowired
	KeywordServiceImp keywordServiceImp;

	@Override
	@ResponseBody
	@GetMapping("/keyword")
	public List<Keyword> all() {
		return this.keywordServiceImp.getAllKeywords();
	}

	@Override
	@ResponseBody
	@GetMapping("/keyword/{id}")
	public Keyword one(@PathVariable int id) {
	return this.keywordServiceImp.getKeyword(id);
	}

	@Override
	@ResponseBody
	@PutMapping("/keyword/{id}")
	public void update(@PathVariable("id") int id, @RequestBody Keyword keyword) {
		Preconditions.checkNotNull(keyword);
		try {
			RestPreconditions.checkFound(keywordServiceImp.getKeyword(id));
			keywordServiceImp.updateKeyword(keyword);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	@ResponseBody
	@DeleteMapping("/keyword/{id}")
	public void delete(@PathVariable("id") int id) {
		keywordServiceImp.removeKeyword(id);
	}

	@Override
	@ResponseBody
	@PutMapping("/keyword")
	public Keyword add(@RequestBody Keyword keyword) {
		return this.keywordServiceImp.addKeyword(keyword);
	}
}