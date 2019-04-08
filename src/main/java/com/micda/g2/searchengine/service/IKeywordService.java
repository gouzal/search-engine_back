package com.micda.g2.searchengine.service;

import java.util.List;

import com.micda.g2.searchengine.model.Keyword;

public interface IKeywordService {
	public void addKeyword(Keyword keyword);

	public void removeKeyword(int id);

	public void updateKeyword(Keyword keyword);

	public Keyword getKeyword(int id);

	public List<Keyword> getAllKeywords();
}
