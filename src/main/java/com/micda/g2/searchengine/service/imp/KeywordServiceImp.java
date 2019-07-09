package com.micda.g2.searchengine.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.Keyword;
import com.micda.g2.searchengine.repository.IKeywordRepository;
import com.micda.g2.searchengine.service.IKeywordService;

@Service
@Qualifier("com.micda.g2.searchengine.service.imp.KeywordServiceImp")
public class KeywordServiceImp implements IKeywordService{
	@Autowired
	private IKeywordRepository iKeywordRepository;

	@Override
	public Keyword addKeyword(Keyword keyword) {
	return	this.iKeywordRepository.save(keyword);
	}

	@Override
	public Keyword removeKeyword(int id) {
		Keyword keyword = this.getKeyword(id);
		this.iKeywordRepository.delete(keyword);
		return keyword;
	}

	@Override
	public Keyword updateKeyword(Keyword keyword) {
		return this.iKeywordRepository.save(keyword);
	}

	@Override
	public Keyword getKeyword(int id) {
		return this.iKeywordRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Keyword with Id:" + id + " Not Found"));
	}

	@Override
	public List<Keyword> getAllKeywords() {
		List<Keyword> keywords=new ArrayList<>();
		iKeywordRepository.findAll().forEach(e->keywords.add(e));
		return keywords;
	}

}
