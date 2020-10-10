package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.BreweryNewsDAO;
import com.techelevator.model.BreweryNews;

@RestController
@CrossOrigin
public class BreweryNewsController {

	@Autowired
	public BreweryNewsDAO dao;
	
	
	@RequestMapping(path = "/news/{id}", method = RequestMethod.GET)
	public List<BreweryNews> newsByBreweryID(@PathVariable Long id){
		return dao.getNewsByBreweryId(id);
	}
	
	@RequestMapping(path = "/news/{id}", method = RequestMethod.DELETE)
	public void deleteNews(@PathVariable Long id){
		dao.deleteNews(id);
	}
	
	
}