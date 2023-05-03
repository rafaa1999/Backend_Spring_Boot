package com.bafoly.ex.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bafoly.ex.error.NotFoundException;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepository;
	
	public Article getArticleById(long id) {
		// TODO Auto-generated method stub
		return this.articleRepository.findById(id).orElseThrow(() -> new NotFoundException("Article does not found"));
	}

	public Article save(Article article) {
		// TODO Auto-generated method stub
		return this.articleRepository.save(article);
	}
}
