package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Keyword;

public interface IKeywordService {
	
	public Keyword addKeyword(Keyword keyword);

	public Keyword removeKeyword(int id);

	public Keyword updateKeyword(Keyword keyword);

	public Keyword getKeyword(int id);

	public List<Keyword> getAllKeywords();
}
