package com.bafoly.ex.article;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bafoly.ex.user.User;

@RestController
public class ArticleController {  

	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/articles/{id}")
	public Article getArticle(@PathVariable long id) {
		return this.articleService.getArticleById(id);
	}
	
	@PostMapping("/articles")
	public Article save(@Valid @RequestBody Article article) {
		return this.articleService.save(article);
	}
}
