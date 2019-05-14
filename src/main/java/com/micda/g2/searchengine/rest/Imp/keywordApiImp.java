package com.micda.g2.searchengine.rest.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.google.common.base.Preconditions;
import com.micda.g2.searchengine.exception.ResourceNotFoundException;
import com.micda.g2.searchengine.model.Keyword;
import com.micda.g2.searchengine.rest.IKeywordApi;
import com.micda.g2.searchengine.service.imp.KeywordServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;


class KeywordApiImp implements IKeywordApi{

	@Autowired
	KeywordServiceImp keywordServiceImp;


	@Override
	public List<Keyword> all() {
		return this.keywordServiceImp.getAllKeywords();
	}

	@Override
	public Keyword one(int id) {
		return this.keywordServiceImp.getKeyword(id);
	}
	
	@Override
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
	public void delete(@PathVariable("id") int id) {
			keywordServiceImp.removeKeyword(id);
	}


	@Override
	public Keyword add(Keyword keyword) {
		return this.keywordServiceImp.addKeyword(keyword);
	}
}