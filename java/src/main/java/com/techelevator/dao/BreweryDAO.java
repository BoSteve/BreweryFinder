package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Brewery;

public interface BreweryDAO {

	public List<Brewery> getAllBrewerys();

	public Brewery getBreweryById(long id);
	
	public Brewery getBreweryByBrewer(Long id);

	public void deleteBrewery(Long id);

	public void saveBrewery(Brewery brewery);
	
	public void updateBrewery(Brewery brewery, long id);

	public Brewery getBreweryByName(String name);
}
